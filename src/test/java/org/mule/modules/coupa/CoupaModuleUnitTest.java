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
import static net.sf.staccatocommons.lang.number.Numbers.i;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import javax.ws.rs.core.MultivaluedMap;

import net.sf.staccatocommons.collections.stream.Streams;

import org.junit.Before;
import org.junit.Test;

import com.coupa.api.Client;
import com.coupa.resources.Account;
import com.coupa.resources.InvoiceHeader;
import com.coupa.resources.Resource;
import com.coupa.resources.Resources;

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
        Account value = new Account();
        value.setId(i(1));
        when(coupaClientMock.post(anyString(), any(), eq(Account.class))).thenReturn(value);

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
        Resources resources = new Resources();
        resources.getResources().add(new InvoiceHeader());

        when(coupaClientMock.get(anyString(), any(MultivaluedMap.class), eq(Resources.class))).thenReturn(resources);

        Iterable<Resource> results = coupaModule.find(ResourceType.InvoiceHeader,
            new HashMap<String, String>(), false, 0, null);

        assertNotNull(results);
        assertEquals(1, Streams.from(results).size());
    }

}
