package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void updateUserProfile(Long userId) {
        // update user profile logic
    }

    public void addToFavorites(Long userId, Long propertyId) {
        // save property as favorite
    }

    public void removeFromFavorites(Long userId, Long propertyId) {
        // remove favorite
    }

}
