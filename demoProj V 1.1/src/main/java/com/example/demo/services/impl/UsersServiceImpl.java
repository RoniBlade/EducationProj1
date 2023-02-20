package com.example.demo.services.impl;

import com.example.demo.dto.UserForm;
import com.example.demo.exceptions.AlreadyExistsException;
import com.example.demo.models.User;
import com.example.demo.repositories.UsersRepository;
import com.example.demo.services.UsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAllByStateNot(User.State.DELETED);
    }

    @Override
    public void addUser(UserForm user) {

        User newUser = User.builder()
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .password(passwordEncoder.encode(user.getPassword()))
                .state(User.State.NOT_CONFIRMED)
                .build();

            usersRepository.save(newUser);
    }

    @Override
    public User getUser(Long id) {
        return usersRepository.findById(id).orElseThrow();
    }

    @Override
    public void updateUser(Long userId, UserForm updateData) {
        User userForUpdate = usersRepository.findById(userId).orElseThrow();

        userForUpdate.setFirstName(updateData.getFirstName());
        userForUpdate.setLastName(updateData.getLastName());
        userForUpdate.setAge(updateData.getAge());

        usersRepository.save(userForUpdate);
    }

    @Override
    public void deleteUser(Long userId) {
        User userForDelete = usersRepository.findById(userId).orElseThrow();

        userForDelete.setState(User.State.DELETED);

        usersRepository.save(userForDelete);
    }

}
