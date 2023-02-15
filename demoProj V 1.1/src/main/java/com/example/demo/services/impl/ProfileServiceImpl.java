package com.example.demo.services.impl;

import com.example.demo.models.User;
import com.example.demo.repositories.UsersRepository;
import com.example.demo.security.details.CustomUserDetails;
import com.example.demo.services.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProfileServiceImpl implements ProfileService {

    private final UsersRepository usersRepository;

    @Override
    public User getCurrent(CustomUserDetails userDetails) {
        return usersRepository.findById(userDetails.getUser().getId()).orElseThrow();
    }
}
