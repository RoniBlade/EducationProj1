package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.security.details.CustomUserDetails;

public interface ProfileService {

    User getCurrent(CustomUserDetails userDetails);

}
