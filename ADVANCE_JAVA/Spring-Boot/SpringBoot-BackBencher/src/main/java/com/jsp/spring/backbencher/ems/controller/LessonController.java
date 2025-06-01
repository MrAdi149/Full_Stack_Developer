package com.jsp.spring.backbencher.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jsp.spring.backbencher.ems.entity.Course;
import com.jsp.spring.backbencher.ems.entity.Lesson;
import com.jsp.spring.backbencher.ems.service.CourseService;
import com.jsp.spring.backbencher.ems.service.LessonService;

@Controller
@RequestMapping("/lessons")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/course/{courseId}")
    public String listLessons(@PathVariable Long courseId, Model model) {
        List<Lesson> lessons = lessonService.getLessonsByCourse(courseId);
        Course course = courseService.getCourseById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));
        model.addAttribute("lessons", lessons);
        model.addAttribute("course", course);
        return "lessons/list"; // Create lessons/list.html
    }

    @GetMapping("/{id}")
    public String getLesson(@PathVariable Long id, Model model) {
        Lesson lesson = lessonService.getLessonById(id)
                .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));
        model.addAttribute("lesson", lesson);
        return "lessons/detail"; // Create lessons/detail.html
    }

    @GetMapping("/course/{courseId}/add")
    public String showAddForm(@PathVariable Long courseId, Model model) {
        Lesson lesson = new Lesson();
        Course course = courseService.getCourseById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));
        lesson.setCourse(course);
        model.addAttribute("lesson", lesson);
        model.addAttribute("course", course);
        return "lessons/add"; // Create lessons/add.html
    }

    @PostMapping("/course/{courseId}/add")
    public String addLesson(@PathVariable Long courseId, @ModelAttribute Lesson lesson) {
        Course course = courseService.getCourseById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));
        lesson.setCourse(course);
        lessonService.saveLesson(lesson);
        return "redirect:/lessons/course/" + courseId;
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Lesson lesson = lessonService.getLessonById(id)
                .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));
        model.addAttribute("lesson", lesson);
        model.addAttribute("course", lesson.getCourse());
        return "lessons/edit"; // Create lessons/edit.html
    }

    @PostMapping("/{id}/edit")
    public String editLesson(@PathVariable Long id, @ModelAttribute Lesson lesson) {
        Lesson existing = lessonService.getLessonById(id)
                .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));
        lesson.setId(id);
        lesson.setCourse(existing.getCourse());
        lessonService.saveLesson(lesson);
        return "redirect:/lessons/course/" + existing.getCourse().getId();
    }

    @PostMapping("/{id}/delete")
    public String deleteLesson(@PathVariable Long id) {
        Lesson lesson = lessonService.getLessonById(id)
                .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));
        Long courseId = lesson.getCourse().getId();
        lessonService.deleteLesson(id);
        return "redirect:/lessons/course/" + courseId;
    }
}