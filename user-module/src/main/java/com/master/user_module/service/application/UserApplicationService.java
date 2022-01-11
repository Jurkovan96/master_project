package com.master.user_module.service.application;

import com.master.user_module.service.domain.UserDomainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserApplicationService {

    private final UserDomainService userDomainService;



}
