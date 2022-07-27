package com.nexim.nexim.payload.response;

import java.util.List;

public class JwtResponse {
    private String accessToken;
    private String type = "Bearer";
    private Long userId;
    private String fullname;
    private String username;
    private String password;
    private List<String> roles;

    public JwtResponse(String accessToken, Long userId, String fullname, String username, String password,  List<String> roles) {
        this.accessToken = accessToken;
        this.userId = userId;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
