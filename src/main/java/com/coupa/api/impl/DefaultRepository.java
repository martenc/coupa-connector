/**
 * Mule Coupa Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 *
 * Coupa Connector com.coupa package contains portions of code based on Coupa4j
 * http://code.google.com/p/coupa4j/, under a MIT license:
 * http://www.opensource.org/licenses/mit-license.php.
 */


package com.coupa.api.impl;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXB;

import org.jvnet.inflector.Noun;

import com.coupa.api.Client;
import com.coupa.api.Identifiable;
import com.coupa.api.Repository;
import com.coupa.api.impl.internal.XMLToHashMapAdapter;
import com.coupa.resources.Resource;
import com.coupa.resources.Resources;
import com.sun.jersey.api.representation.Form;

/**
 * Code based on <a href="http://code.google.com/p/coupa4j/">Coupa4j</a>
 *
 * @author coupa4j
 */
public class DefaultRepository<T extends Identifiable> implements Repository<T>
{

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    private Client client = null;
    private Class<T> resourceClass = null;
    private String resourceUrl = null;
    private int parseLimit = 50;

    public DefaultRepository(Client coupaServer, Class<T> resourceClass, String resourceUrl)
    {
        this.client = coupaServer;
        this.resourceClass = resourceClass;
        this.resourceUrl = resourceUrl;
    }

    public T findById(long id)
    {
        return client.get(getResourceUri(BigInteger.valueOf(id)), resourceClass);
    }

    public List<T> findAll(T prototype)
    {
        return findAll(prototype, true);
    }

    public List<T> findAll(T prototype, boolean exactMatch)
    {
        OutputStream outputStream = new ByteArrayOutputStream();
        JAXB.marshal(prototype, outputStream);
        Map<String, String> conditions = XMLToHashMapAdapter.convertToMap(outputStream.toString());
        return findAll(conditions, exactMatch, 0, null);
    }

    public List<T> findAll()
    {
        return findAll(null, false, 0, null);
    }

    public List<T> findAll(int offset)
    {
        return findAll(null, false, offset, null);
    }

    public List<T> findAll(int offset, int limit)
    {
        return findAll(null, false, offset, limit);
    }

    public List<T> findAll(Map<String, String> conditions, boolean exactMatch, int offset, Integer limit)
    {
        MultivaluedMap<String, String> urlParams = new Form();
        return findAll(conditions, exactMatch, offset, limit, null);
    }

    public List<T> findAll(Map<String, String> conditions,
                           boolean exactMatch,
                           int offset,
                           Integer limit,
                           Date dateLimit)
    {
        MultivaluedMap<String, String> urlParams = new Form();

        if (limit != null)
        {
            urlParams.add("limit", Integer.toString(limit));
        }

        String dateField = null;
        List<String> dateStringsToSearch = null;

        if (conditions != null)
        {

            Iterator it = conditions.entrySet().iterator();
            while (it.hasNext())
            {
                Map.Entry pairs = (Map.Entry) it.next();
                String key = (String) pairs.getKey();
                String value = (String) pairs.getValue();

                // Coupa needs underscores instead of dashes for query keys
                String coupaKey = key.replaceAll("-", "_");

                if (!exactMatch)
                {
                    if (isDateValue(value))
                    {
                        // if we get here then we have valid date so do greater
                        // than or equal to search
                        urlParams.add(coupaKey + "[gt_or_eq]", value);

                        if (dateLimit != null)
                        {
                            urlParams.add(coupaKey + "[lt_or_eq]", dateFormat.format(dateLimit));
                        }
                    }
                    else
                    {
                        // not a date value so add as regular value
                        urlParams.add(coupaKey + "[starts_with]", value);
                    }
                }
                else
                {
                    urlParams.add(coupaKey, value);
                }
            }
        }

        List<T> resourceList = new ArrayList<T>();

        int currentOffset = offset;
        boolean allItemsRetrieved = false;
        int currentDateIdx = 0;
        do
        {
            if (dateStringsToSearch != null)
            {
                urlParams.add(dateField, dateStringsToSearch.get(currentDateIdx++));
            }
            do
            {
                urlParams.add("offset", Integer.toString(currentOffset));
                List<T> resources = getResources(getResourceUri(), urlParams);

                resourceList.addAll(resources);

                // deal with Coupa limit on requests by automatically parsing
                // and resetting the offset so we get all resources
                if (resources.size() < this.parseLimit)
                {
                    allItemsRetrieved = true;
                }
                else
                {
                    currentOffset += this.parseLimit;
                }
            }
            while (!allItemsRetrieved);
        }
        while (dateStringsToSearch != null && currentDateIdx < dateStringsToSearch.size());

        return resourceList;
    }

    private List<T> getResources(String url, MultivaluedMap<String, String> queryParams)
    {
        List<T> returnedResources = new ArrayList<T>();
        for (Resource item : client.get(getResourceUri(), queryParams, Resources.class).getResources())
        {
            returnedResources.add((T) item);
        }
        return returnedResources;
    }

    @SuppressWarnings("unchecked")
    public T save(T resource)
    {
        BigInteger id = resource.getId();
        if (id == null)
        {
            return (T) client.post(getResourceUri(), resource, resource.getClass());
        }
        else
        {
            return (T) client.put(getResourceUri(id), resource, resource.getClass());
        }
    }

    private boolean isDateValue(String value)
    {
        if (value == null)
        {
            return false;
        }

        if (value.trim().length() != 25)
        {
            return false;
        }

        dateFormat.setLenient(false);
        try
        {
            dateFormat.parse(value.trim().substring(0, 19));
        }
        catch (ParseException pe)
        {
            return false;
        }

        return true;
    }

    private String getResourceUri(BigInteger id)
    {
        return this.resourceUrl + "/" + id;
    }

    private String getResourceUri()
    {
        return this.resourceUrl;
    }

    public static <T extends Resource> Repository<T> newRepository(Client coupaServer, Class<T> resourceClass)
    {
        return new DefaultRepository<T>(coupaServer, resourceClass, makeResourceUrl(resourceClass));
    }

    private static String makeResourceUrl(Class<?> resourceClass)
    {
        String className = resourceClass.getName().toLowerCase();
        return "/" + Noun.pluralOf(className.substring(className.lastIndexOf('.') + 1));
    }
}
