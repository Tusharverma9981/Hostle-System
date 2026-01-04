package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    public void addProperty(Long ownerId) {
        // add hostel or PG
    }

    public void disableProperty(Long propertyId) {
        // disable listing
    }

    public void approveProperty(Long propertyId) {
        // admin approval logic
    }

}
