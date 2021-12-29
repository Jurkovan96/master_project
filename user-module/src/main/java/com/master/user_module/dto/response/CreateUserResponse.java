package com.master.user_module.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CreateUserResponse {

    private String email;
    private String fullName;
    private String role;
}
