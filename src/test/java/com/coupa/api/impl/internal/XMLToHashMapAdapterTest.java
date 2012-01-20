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

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class XMLToHashMapAdapterTest {

    @Test
    public void testSimpleXML() {
       String xml = "<root><child>value</child></root>";
       Map<String,String> params = XMLToHashMapAdapter.convertToMap(xml);
       
       assertEquals(1, params.size());
       assertEquals("value", params.get("child"));
    }
    
    @Test
    public void testSomethingConfusing() {
        String xml = "<root><child>value</child><anotherchild><bad>value</bad></anotherchild></root>";
        Map<String,String> params = XMLToHashMapAdapter.convertToMap(xml);
       
        // don't think this should/will ever happen, but if it does, at least we do something reasonable
        assertEquals(2, params.size());
        assertEquals("value", params.get("child"));
    }
    
    @Test
    public void testChildElements() {
        String xml = "<requisition-header>"+
                     "    <status>ordered</status>"+
                     "    <requested-by>"+
                     "        <login>administrator</login>"+
                     "    </requested-by>"+
                     "</requisition-header>";
        Map<String,String> params = XMLToHashMapAdapter.convertToMap(xml);
       
        assertEquals(2, params.size());
        assertEquals("ordered", params.get("status"));
        assertEquals("administrator", params.get("requested-by[login]"));
    }
}
