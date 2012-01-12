/**
 * Mule Coupa Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package org.mule.modules.coupa;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import com.coupa.api.Client;
import com.coupa.resources.Resource;

/**
 * Test for {@link CoupaModule}
 *
 * @author flbulgarelli
 */
public class CoupaModuleUnitTest
{

    private CoupaModule coupaModule;
    private Client coupaClientMock;

    @Before
    public void setUp()
    {
        coupaModule = new CoupaModule();
        coupaClientMock = mock(Client.class);
        coupaModule.setCoupaClient(coupaClientMock);
        coupaModule.init();
    }

    /**Test for */
    @Test
    public void testSave() throws Exception
    {
        Resource result = coupaModule.save(ResourceType.Account, new HashMap<String, Object>() { {
                put("name", "MyAccount");
                put("code", "XSDF44");
            } });

        assertNotNull(result);
        assertNotNull(result.getId());
    }

    @Test
    public void testFind() throws Exception
    {
        Iterable<Resource> results = coupaModule.find(ResourceType.InvoiceHeader,
            new HashMap<String, String>(), false, 0, null);

        assertNotNull(results);
    }

}
