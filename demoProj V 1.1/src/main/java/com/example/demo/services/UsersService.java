package com.example.demo.services;



import com.example.demo.dto.UserForm;
import com.example.demo.models.User;

import java.util.List;

public interface UsersService {
    List<User> getAllUsers();

    void addUser(UserForm user);

    User getUser(Long id);

    void updateUser(Long userId, UserForm user);

    void deleteUser(Long userId);
}
