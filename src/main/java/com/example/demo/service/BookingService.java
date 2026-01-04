package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BookingService {

    public void requestBooking(Long userId, Long roomId) {
        // booking request logic
    }

    public void approveBooking(Long bookingId) {
        // owner approval logic
    }

    public void cancelBooking(Long bookingId) {
        // cancellation logic
    }

}
