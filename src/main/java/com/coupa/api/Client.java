package com.coupa.api;

import javax.ws.rs.core.MultivaluedMap;

public interface Client {

    <T> T get(String uri, Class<T> clazz);

    <T> T get(String uri, MultivaluedMap<String, String> urlParams, Class<T> clazz);

    <T> T put(String url, Object content, Class<T> clazz);

    <T> T post(String url, Object content, Class<T> clazz);

}