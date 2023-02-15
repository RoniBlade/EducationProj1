package com.example.demo.repositories;

import com.example.demo.models.Course;
import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByStateNot(User.State state);

    List<User> findAllByCoursesNotContainsAndState(Course course, User.State state);

    List<User> findAllByCoursesContains(Course course);

    Optional<User> findByEmail(String email);
}
