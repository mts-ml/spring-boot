package com.mateuslima.spring_boot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id: " + id);
    }
}
