
package com.coupa.api;

/**
 * Code based on <a href="http://code.google.com/p/coupa4j/">Coupa4j</a>
 *
 * @author coupa4j
 */
@SuppressWarnings("serial")
public class RESTException extends RuntimeException
{

    public RESTException(String message)
    {
        super(message);
    }

}
