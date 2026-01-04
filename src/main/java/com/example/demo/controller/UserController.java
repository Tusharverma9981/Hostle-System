package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/dashboard")
    public String userDashboard() {
        return "user/user-dashboard";
    }

    @GetMapping("/profile")
    public String profile() {
        return "user/profile";
    }

    @GetMapping("/bookings")
    public String bookingHistory() {
        return "user/booking-history";
    }

    @GetMapping("/favorites")
    public String favorites() {
        return "user/favorites";
    }
}
