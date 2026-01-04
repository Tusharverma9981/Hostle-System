package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String adminDashboard() {
        return "admin/admin-dashboard";
    }

    @GetMapping("/users")
    public String manageUsers() {
        return "admin/manage-users";
    }

    @GetMapping("/owners")
    public String manageOwners() {
        return "admin/manage-owners";
    }

    @GetMapping("/properties")
    public String manageProperties() {
        return "admin/manage-properties";
    }

    @GetMapping("/bookings")
    public String manageBookings() {
        return "admin/bookings";
    }

    @GetMapping("/reports")
    public String reports() {
        return "admin/reports";
    }
}
