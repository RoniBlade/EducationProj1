package com.example.demo.services.impl;

import com.example.demo.models.Course;
import com.example.demo.models.User;
import com.example.demo.repositories.CoursesRepository;
import com.example.demo.repositories.UsersRepository;
import com.example.demo.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    private final CoursesRepository coursesRepository;
    private final UsersRepository usersRepository;

    @Override
    public void addStudentToCourse(Long courseId, Long studentId) {

        Course course = coursesRepository.findById(courseId).orElseThrow();
        User student = usersRepository.findById(studentId).orElseThrow();

        student.getCourses().add(course);

        usersRepository.save(student);

    }

    @Override
    public Course getCourse(Long courseId) {
        return coursesRepository.findById(courseId).orElseThrow();
    }

    @Override
    public List<User> getNotInCourseStudents(Long courseId) {
        return usersRepository.findAllByCoursesNotContainsAndState(coursesRepository.findById(courseId).orElseThrow(), User.State.CONFIRMED);
    }

    @Override
    public List<User> getInCourseStudents(Long courseId) {
        return usersRepository.findAllByCoursesContains(coursesRepository.findById(courseId).orElseThrow());
    }

    @Override
    public List<Course> getCourses() {
        return coursesRepository.findAll();
    }
}
