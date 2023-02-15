package com.example.demo.controllers;

import com.example.demo.repositories.UsersRepository;
import com.example.demo.security.details.CustomUserDetails;
import com.example.demo.services.impl.ProfileServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ProfileController {

    private final UsersRepository usersRepository;

    private final ProfileServiceImpl profileService;

    @GetMapping("/")
    public String getRoot(){
        return "redirect:/profile";
    }

    @GetMapping("/profile")
    public String getProfile(@AuthenticationPrincipal CustomUserDetails userDetails,
                             Model model){

        model.addAttribute("user", profileService.getCurrent(userDetails));
        return "profile_page";
    }

}
