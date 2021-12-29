package com.master.user_module.exception.customExceptions;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException {

    private final Object[] objects;
    public ResourceNotFoundException(String message, Object... objects) {
        super(message);
        this.objects = objects;
    }
}
