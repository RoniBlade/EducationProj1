package com.example.demo.controllers;

import com.example.demo.dto.UserForm;
import com.example.demo.models.User;
import com.example.demo.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Controller
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/users")
    public String getUsersPage(@RequestParam(value = "orderBy", required = false) String orderBy,
                               @RequestParam(value = "dir", required = false) String direction,
                               Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "Users/users_page";
    }

    @PostMapping("/users")
    public String addUser(UserForm user){
        usersService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/{user-id}")
    public String getUserPage(@PathVariable("user-id") Long id, Model model) {
        model.addAttribute("user" , usersService.getUser(id));
        return "Users/user_page";
    }

    @PostMapping("/users/{user-id}/update")
    public String updateUser(@PathVariable("user-id") Long userId, UserForm user, Model model) {
        if(user.getAge() < 0){
            model.addAttribute("error", "Age should be > 0");
            return "redirect:/users/" + userId;
        }
        model.addAttribute("error", "");
        usersService.updateUser(userId, user);
        return "redirect:/users/" + userId;
    }

    @GetMapping("/users/{user-id}/delete")
    public String deleteUser(@PathVariable("user-id") Long userId) {
        usersService.deleteUser(userId);
        return "redirect:/users";
    }



}
