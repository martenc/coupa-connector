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


package com.coupa.api.impl.internal;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import net.sf.staccatocommons.lang.SoftException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 * Code based on <a href="http://code.google.com/p/coupa4j/">Coupa4j</a>
 *
 * @author coupa4j
 */
public final class XMLToHashMapAdapter
{
    private XMLToHashMapAdapter()
    {
    }

    // converts XML object to hashmap.
    // ie.
    // <currency>
    // <code>CUR</code>
    // </currency>
    //
    // converts to hashmap
    // <'code','CUR'>
    public static Map<String, String> convertToMap(String xml)
    {
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(xml.getBytes()));
            return convertToMap(XMLToHashMapAdapter.removeWhitespaceNodes(doc.getDocumentElement()), null);
        }
        catch (Exception e)
        {
            throw SoftException.soften(e);
        }
    }

    public static Map<String, String> convertToMap(Node node, String base)
    {
        Map<String, String> params = new HashMap<String, String>();
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++)
        {
            Node child = children.item(i);

            if (child.getNodeType() == Node.ELEMENT_NODE && child.getChildNodes().getLength() > 0
                && child.getFirstChild().getNodeType() == Node.TEXT_NODE)
            {
                String key = base == null ? child.getNodeName() : base + "[" + child.getNodeName() + "]";
                params.put(key, child.getTextContent());
            }
            else if (child.getNodeType() == Node.ELEMENT_NODE)
            {
                String newBase = base == null ? child.getNodeName() : base + "[" + child.getNodeName() + "]";
                Map<String, String> childParams = XMLToHashMapAdapter.convertToMap(child, newBase);

                Iterator it = childParams.entrySet().iterator();
                while (it.hasNext())
                {
                    Map.Entry<String, String> pairs = (Map.Entry) it.next();
                    params.put(pairs.getKey(), pairs.getValue());
                }
            }
        }
        return params;
    }

    public static Element removeWhitespaceNodes(Element e)
    {
        NodeList children = e.getChildNodes();
        for (int i = children.getLength() - 1; i >= 0; i--)
        {
            Node child = children.item(i);
            if (child instanceof Text && ((Text) child).getData().trim().length() == 0)
            {
                e.removeChild(child);
            }
            else if (child instanceof Element)
            {
                removeWhitespaceNodes((Element) child);
            }
        }

        return e;
    }
}
