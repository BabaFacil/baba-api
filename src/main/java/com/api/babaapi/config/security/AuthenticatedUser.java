package com.api.babaapi.config.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Getter
public class AuthenticatedUser extends User {

    private String email;
    private String login;

    private String tenetId;


    public AuthenticatedUser(String username,String password ,String email, String tenetId, List<GrantedAuthority> roles) {
        super(username, password, roles);
        this.login = username;
        this.email = email;
        this.tenetId = tenetId;
    }

}
