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


package com.coupa.api;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse.Status;

public class RESTExceptionUnitTest
{

    /** test for {@link RESTException#getMessage()} */
    @Test
    public void getMessageContainsTheOrigialMessageStatusCodeAndUri()
    {
        assertEquals("URI: /foo,\n" + //
                     "Status: Not Found,\n" + //
                     "Message: Nothing to see here", //
            new RESTException("/foo", Status.NOT_FOUND, "Nothing to see here").getMessage());
    }

}
