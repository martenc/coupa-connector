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

import java.util.List;
import java.util.Map;

public interface Repository<T> {

    T findById(long id);

    List<T> findAll(T prototype);

    List<T> findAll(T prototype, boolean exactMatch);

    List<T> findAll();

    List<T> findAll(int offset);

    List<T> findAll(int offset, int limit);

    List<T> findAll(Map<String, String> conditions, boolean exactMatch, int offset, Integer limit);

    T save(T resource);

}