package com.master.user_module.exception.customExceptions;

import lombok.Getter;

@Getter
public class ParametrizedException extends RuntimeException {

    private final Object[] objects;

    public ParametrizedException(Throwable exception, Object... objects) {
        super(exception.getMessage(), exception);
        this.objects = objects;
    }
}
