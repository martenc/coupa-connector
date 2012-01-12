package com.coupa.api.impl.internal;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.coupa.api.impl.internal.XMLToHashMapAdapter;

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
