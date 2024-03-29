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

/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.modules.coupa;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.utils.mom.JaxbMapObjectMappers;
import com.coupa.resources.Resource;

import com.coupa.api.Client;
import com.coupa.api.RESTException;
import com.coupa.api.impl.JerseyClient;
import com.zauberlabs.commons.mom.MapObjectMapper;

/**
 * Coupa is a provider of cloud spend management (CSM) solutions that help companies
 * control their indirect spending and generate savings that go direct to the bottom
 * line. This Mule Module is cable of creating, updating and finding coupa resources
 * both <a href=
 * "http://integrate.coupa.com/home/erp-integration/rest-apis/object-resources"
 * >master resources</a> and <a href=
 * "http://integrate.coupa.com/home/erp-integration/rest-apis/transaction-resources<gd"
 * > transaction resources</a>
 *
 * @author MuleSoft, Inc
 */
@Connector(name = "coupa", schemaVersion = "1.0")
public class CoupaModule
{

    private Client coupaClient;

    private final MapObjectMapper mom = JaxbMapObjectMappers.defaultWithPackage("com.coupa.resources").build();

    /**
     * The base URL of your company's account in Coupa. Its looks like
     * https://[company].[coupahost].com/api
     */
    @Configurable
    private String baseUrl;

    /**
     * The token of your company's account in Coupa. You can get if from the
     * administrative coupa UI, in the API Keys section
     */
    @Configurable
    private String apiKey;

    /** Initializes the Coupa client */
    @PostConstruct
    public void init()
    {
        if (coupaClient == null)
        {
            coupaClient = new JerseyClient(baseUrl, apiKey);
        }
    }

    /**
     * Creates or updates and object. If the resource's id is not null, the connector
     * creates it. Otherwise, it updates the present fields, leaving the rest of
     * fields unchanged.
     *
     * {@sample.xml ../../../doc/connector.xml.sample coupa:save}
     *
     * @param type the type of the resource to update
     * @param resource the resource
     * @return the updated or created object
     * @throws RESTException if the object can not be created
     */
    @Processor
    public Resource save(ResourceType type, Map<String, Object> resource)
    {
        return type.newRepository(coupaClient).save(unmap(type, resource));
    }

    /**
     * Searches for an specific resource given its type and id
     *
     * {@sample.xml ../../../doc/connector.xml.sample coupa:find-by-id}
     *
     * @param type the type of resource to search
     * @param id  the id of the resources
     * @return the resource for the given id
     * @throws RESTException if there is not resource for the given id and type
     */
    @Processor
    public Resource findById(ResourceType type, long id)
    {
        /*TODO use big integers when devkit supports them*/
        return type.newRepository(coupaClient).findById(id);
    }

    /**
     * Searches for resources
     *
     * {@sample.xml ../../../doc/connector.xml.sample coupa:find}
     *
     * @param type the type of resource to search
     * @param conditions TODO
     * @param exactMatch TODO
     * @param offset TODO
     * @param limit TODO
     * @return an iterable of resources
     */
    @Processor
    public Iterable<Resource> find(ResourceType type,
                                   @Optional Map<String, String> conditions,
                                   @Optional @Default("false") boolean exactMatch,
                                   @Optional @Default("0") int offset,
                                   @Optional Integer limit)
    {
        return type.newRepository(coupaClient).findAll(conditions, exactMatch, offset, limit);
    }

    /**
     * Searches for resources using an example
     *
     * {@sample.xml ../../../doc/connector.xml.sample coupa:find-by-example}
     *
     * @param type the type of object to search
     * @param prototype the example. Fields set will be used as search conditions
     * @param exactMatch TODO
     * @return an iterable of resources
     */
    @Processor
    public Iterable<Resource> findByExample(ResourceType type,
                                            Map<String, Object> prototype,
                                            @Optional @Default("false") boolean exactMatch)
    {
        return type.newRepository(coupaClient).findAll(unmap(type, prototype), exactMatch);
    }

    protected Resource unmap(ResourceType type, Map<String, Object> resource)
    {
        return (Resource) mom.unmap(resource, type.getResourceClass());
    }

    public void setCoupaClient(Client coupaClient)
    {
        this.coupaClient = coupaClient;
    }

    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
    }

    public void setBaseUrl(String baseUrl)
    {
        this.baseUrl = baseUrl;
    }

	public String getBaseUrl() {
		return baseUrl;
	}

	public String getApiKey() {
		return apiKey;
	}
}
