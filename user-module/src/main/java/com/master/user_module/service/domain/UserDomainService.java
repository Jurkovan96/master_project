package com.master.user_module.service.domain;

import com.master.user_module.entity.User;
import com.master.user_module.exception.customExceptions.ResourceNotFoundException;
import com.master.user_module.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserDomainService {

    private final UserRepository userRepository;

    public User findUserById(Long userId) {
        log.info("Getting user with id {}", userId);
        return userRepository.findById(userId)
                .orElseThrow(() -> {
                    log.error("Cannot get user with id {}", userId);
                    return new ResourceNotFoundException("message", userId);
                });
    }

    public User findUserByEmail(String email) {
        log.info("Getting user with email address {}", email);
        return userRepository.findByEmail(email)
                .orElseThrow(() -> {
                    log.error("Cannot get user with email {}", email);
                    return new ResourceNotFoundException("message", email);
                });
    }

    public Collection<User> findAllUsers() {
        return userRepository.findAll();
    }
}
