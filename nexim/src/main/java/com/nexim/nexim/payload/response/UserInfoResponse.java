package com.nexim.nexim.payload.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class UserInfoResponse {
    private Long userId;
    private String fullname;
    private String username;
    private String password;
    private List<String> roles;

    public UserInfoResponse(Long userId, String fullname, String username, String password, List<String> roles) {
        this.userId = userId;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }


}
