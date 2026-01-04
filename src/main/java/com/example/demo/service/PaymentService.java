package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void processPayment(Long bookingId) {
        // payment gateway integration
    }

    public void processRefund(Long bookingId) {
        // refund logic
    }

}
