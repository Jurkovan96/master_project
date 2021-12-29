package com.master.user_module.controller;


import com.master.user_module.dto.request.CreateUserRequest;
import com.master.user_module.dto.response.CreateUserResponse;
import com.master.user_module.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity<CreateUserResponse> createUser(@Valid @RequestBody CreateUserRequest createUserRequest) {
        log.info("In method createUser " + LocalDateTime.now());
        return ResponseEntity.ok(CreateUserResponse.builder()
                .email(createUserRequest.getEmail())
                .fullName(createUserRequest.getFirstName().concat(createUserRequest.getLastName()))
                .role(createUserRequest.getUserRole())
                .build());
    }
}
