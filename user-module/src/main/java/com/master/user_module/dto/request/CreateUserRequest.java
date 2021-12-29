package com.master.user_module.dto.request;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(max = 10)
    private String firstName;

    @NotNull
    @Size(max = 10)
    private String lastName;

    @NotNull
    @Size(min = 8, max = 11)
    private String phoneNumber;

    @NotNull
    private String userRole;
}
