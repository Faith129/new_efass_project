package com.nexim.nexim.payload.request;

import lombok.Builder;
import lombok.Data;


import javax.validation.constraints.NotBlank;

import java.util.Set;
@Data
@Builder
public class SignUpRequest {
    @NotBlank
    private String fullname;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    private Set<String> role;

   }
