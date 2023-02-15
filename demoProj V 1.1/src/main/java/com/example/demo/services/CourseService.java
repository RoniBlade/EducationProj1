package com.example.demo.services;

import com.example.demo.models.Course;
import com.example.demo.models.User;

import java.util.List;

public interface CourseService {
    void addStudentToCourse(Long courseId, Long studentId);

    Course getCourse(Long courseId);

    List<User> getNotInCourseStudents(Long courseId);

    List<User> getInCourseStudents(Long courseId);

    List<Course> getCourses();
}
