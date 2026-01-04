package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking")
public class BookingController {

    @GetMapping("/request")
    public String bookingRequest() {
        return "user/property-details";
    }

    @GetMapping("/history")
    public String bookingHistory() {
        return "user/booking-history";
    }

    @GetMapping("/requests")
    public String ownerBookingRequests() {
        return "owner/booking-requests";
    }
}
