package com.jsp.spring.backbencher.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jsp.spring.backbencher.ems.entity.Course;
import com.jsp.spring.backbencher.ems.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public String listCourses(Model model) {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);
        return "courses/list";
    }

    @GetMapping("/{id}")
    public String getCourse(@PathVariable Long id, Model model) {
        Course course = courseService.getCourseById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid course Id:" + id));
        model.addAttribute("course", course);
        return "courses/detail";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("course", new Course());
        model.addAttribute("types", Course.CourseType.values());
        return "courses/add";
    }

    @PostMapping("/add")
    public String addCourse(@ModelAttribute Course course) {
        courseService.saveCourse(course);
        return "redirect:/courses";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Course course = courseService.getCourseById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid course Id:" + id));
        model.addAttribute("course", course);
        model.addAttribute("types", Course.CourseType.values());
        return "courses/edit";
    }

    @PostMapping("/{id}/edit")
    public String editCourse(@PathVariable Long id, @ModelAttribute Course course) {
        course.setId(id);
        courseService.saveCourse(course);
        return "redirect:/courses";
    }

    @PostMapping("/{id}/delete")
    public String deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return "redirect:/courses";
    }
}