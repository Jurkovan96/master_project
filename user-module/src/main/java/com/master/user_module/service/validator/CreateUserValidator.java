package com.master.user_module.service.validator;

import com.master.user_module.dto.request.CreateUserRequest;

public interface CreateUserValidator {

    void validate(CreateUserRequest createUserRequest);
}
