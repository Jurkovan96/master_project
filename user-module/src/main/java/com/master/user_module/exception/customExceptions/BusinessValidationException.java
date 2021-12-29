package com.master.user_module.exception.customExceptions;

import lombok.Getter;

@Getter
public class BusinessValidationException extends RuntimeException {

    private final Object[] objects;

    public BusinessValidationException(String message, Object... objects) {
        super(message);
        this.objects = objects;
    }
}
