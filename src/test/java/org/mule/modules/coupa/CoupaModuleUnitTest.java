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


package org.mule.modules.coupa;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.math.BigInteger;
import java.util.HashMap;

import javax.ws.rs.core.MultivaluedMap;

import net.sf.staccatocommons.collections.stream.Streams;

import org.junit.Before;
import org.junit.Test;

import com.coupa.api.Client;
import com.coupa.resources.Account;
import com.coupa.resources.Currency;
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
        resources.getResources().add(new Currency());

        when(coupaClientMock.get(anyString(), any(MultivaluedMap.class), eq(Resources.class))).thenReturn(resources);

        Iterable<Resource> results = coupaModule.find(ResourceType.Currency,
            new HashMap<String, String>(), false, 0, null);

        assertNotNull(results);
        assertEquals(1, Streams.from(results).size());
    }
    
    private BigInteger i(int i)
    {
        return BigInteger.valueOf(i);
    }

}
