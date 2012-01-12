package com.coupa.api;

@SuppressWarnings("serial")
public class RESTException extends RuntimeException {

    public RESTException(String message) {
        super(message);
    }

}
