package com.ws101.deleon.ecommerceapi.exception;

/**
 * Custom exception for handling product not found scenarios.
 * 
 * This exception is thrown when a requested product cannot be found
 * in the product catalog.
 * 
 * @author Kent Jeanne S. De Leon
 * @author Keniel Drew D. De Asis
 */
public class ProductNotFoundException extends RuntimeException {

    /**
     * Constructs a new ProductNotFoundException with the specified message.
     * 
     * @param message the detail message describing the error
     */
    public ProductNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new ProductNotFoundException with the specified message and cause.
     * 
     * @param message the detail message describing the error
     * @param cause   the cause of this exception
     */
    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}