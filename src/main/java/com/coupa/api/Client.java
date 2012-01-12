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

import javax.ws.rs.core.MultivaluedMap;

/**
 * Client interface to connect to Coupa in a REST style
 *
 * @author flbulgarelli
 */
public interface Client
{
    <T> T get(String uri, Class<T> clazz);

    <T> T get(String uri, MultivaluedMap<String, String> urlParams, Class<T> clazz);

    <T> T put(String url, Object content, Class<T> clazz);

    <T> T post(String url, Object content, Class<T> clazz);

}
