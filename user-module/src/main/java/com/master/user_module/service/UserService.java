package com.master.user_module.service;

import com.master.user_module.dto.request.CreateUserRequest;
import com.master.user_module.dto.response.CreateUserResponse;
import com.master.user_module.service.domain.UserDomainService;
import com.master.user_module.service.validator.CreateUserValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private CreateUserValidator userValidator;
    private UserDomainService userDomainService;

    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        userValidator.validate(createUserRequest);
        return null;
        //TODO Add Handle for this case
    }

}
