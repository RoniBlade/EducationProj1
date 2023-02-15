package com.example.demo.controllers;


import com.example.demo.repositories.CoursesRepository;
import com.example.demo.security.details.CustomUserDetails;
import com.example.demo.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/courses")
@RequiredArgsConstructor
@Controller
public class CoursesController {

    private final CourseService courseService;
    private final CoursesRepository coursesRepository;

    @GetMapping()
    public String getCoursesPage(@AuthenticationPrincipal CustomUserDetails customUserDetails,
                                 Model model){
        model.addAttribute("role", customUserDetails.getUser().getRole());
        model.addAttribute("courses", courseService.getCourses());
        return "courses_page";
    }

    @PostMapping("/{course-id}/students")
    public String addStudentToCourse(@PathVariable("course-id") Long courseId,
                                     @RequestParam("student-id") Long studentId){

            courseService.addStudentToCourse(courseId, studentId);
            return "redirect:/courses/" + courseId;
    }

    @GetMapping("/{course-id}")
    public String getCoursesPage(@PathVariable("course-id") Long courseId, Model model){
        model.addAttribute("course", courseService.getCourse(courseId));
        model.addAttribute("notInCourseStudents", courseService.getNotInCourseStudents(courseId));
        model.addAttribute("inCourseStudents", courseService.getInCourseStudents(courseId));
        return "course_page";
    }

}
