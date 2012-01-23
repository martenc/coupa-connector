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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.coupa.api.impl.JerseyClient;
import com.coupa.resources.Resource;

/**
 * Integration test for {@link ResourceType}
 *
 * @author flbulgarelli
 */
@RunWith(Theories.class)
public class ResourceTypeTestDriver
{
    private JerseyClient client;

    @Before
    public void setup()
    {
        client = new JerseyClient(System.getenv("coupaHost"), System.getenv("coupaKey"));
    }

    @DataPoints
    public static final ResourceType[] CLASSES = {ResourceType.PaymentTerm, ResourceType.User,
        ResourceType.SupplierItem, ResourceType.OrderRevision, ResourceType.Requisitions,
        ResourceType.Invoice};

    @Theory
    public void resourceCanBeSearched(ResourceType resourceClass) throws Exception
    {
        List<Resource> results = resourceClass.newRepository(client).findAll(0, 10);
        assertNotNull(results);
        assertTrue(results.size() <= 10);
    }

}
