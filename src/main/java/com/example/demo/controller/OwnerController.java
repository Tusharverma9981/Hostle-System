package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    @GetMapping("/dashboard")
    public String ownerDashboard() {
        return "owner/owner-dashboard";
    }

    @GetMapping("/profile")
    public String ownerProfile() {
        return "owner/owner-profile";
    }

    @GetMapping("/earnings")
    public String earnings() {
        return "owner/earnings";
    }
}
