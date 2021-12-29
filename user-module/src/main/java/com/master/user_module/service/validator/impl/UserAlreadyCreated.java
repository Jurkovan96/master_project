package com.master.user_module.service.validator.impl;

import com.master.user_module.dto.request.CreateUserRequest;
import com.master.user_module.exception.customExceptions.BusinessValidationException;
import com.master.user_module.service.domain.UserDomainService;
import com.master.user_module.service.validator.CreateUserValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserAlreadyCreated implements CreateUserValidator {

    private final UserDomainService userDomainService;

    @Override
    public void validate(CreateUserRequest createUserRequest) {
        if (userDomainService.findUserByEmail(createUserRequest.getEmail()) != null) {
            log.error("An user with the email address {} already exists", createUserRequest.getEmail());
            throw new BusinessValidationException("User with email already exists!",
                    createUserRequest.getEmail());
        }
    }
}
