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

import net.sf.staccatocommons.collections.stream.Streams;

import com.sun.jersey.api.client.ClientResponse.Status;

/**
 * Code based on <a href="http://code.google.com/p/coupa4j/">Coupa4j</a>
 *
 * @author coupa4j
 */
@SuppressWarnings("serial")
public class RESTException extends RuntimeException
{
    private final String uri;
    private final Status status;

    public RESTException(String uri, Status status, String message)
    {
        super(message);
        this.uri = uri;
        this.status = status;
    }

    @Override
    public String getMessage()
    {
        return Streams.cons("URI: " + uri, "Status: " + status, "Message: " + super.getMessage())
            .joinStrings(",\n");
    }

    public String getSimpleMessage()
    {
        return super.getMessage();
    }

    public Status getStatus()
    {
        return status;
    }

    public String getUri()
    {
        return uri;
    }
}
