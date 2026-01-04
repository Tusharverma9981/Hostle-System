package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String getRedirectUrlByRole(String role) {

        if (role.equals("ADMIN")) {
            return "/admin/dashboard";
        } else if (role.equals("OWNER")) {
            return "/owner/dashboard";
        } else {
            return "/user/dashboard";
        }
    }

}
