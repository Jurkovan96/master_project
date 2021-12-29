package com.master.user_module.service.validator;

import com.master.user_module.dto.request.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserValidator {

    private final List<CreateUserValidator> createUserValidators;

    public void validateUserRegistration(CreateUserRequest createUserRequest) {
        createUserValidators.forEach(createUserValidator -> createUserValidator.validate(createUserRequest));
    }
}
