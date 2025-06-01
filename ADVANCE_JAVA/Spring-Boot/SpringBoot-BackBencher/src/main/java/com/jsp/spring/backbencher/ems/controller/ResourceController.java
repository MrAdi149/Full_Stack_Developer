package com.jsp.spring.backbencher.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jsp.spring.backbencher.ems.entity.Lesson;
import com.jsp.spring.backbencher.ems.entity.Resource;
import com.jsp.spring.backbencher.ems.service.LessonService;
import com.jsp.spring.backbencher.ems.service.ResourceService;

@Controller
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @Autowired
    private LessonService lessonService;

    @GetMapping("/lesson/{lessonId}")
    public String listResources(@PathVariable Long lessonId, Model model) {
        model.addAttribute("resources", resourceService.getResourcesByLesson(lessonId));
        model.addAttribute("lessonId", lessonId);
        return "resources/list"; // Create resources/list.html
    }

    @GetMapping("/lesson/{lessonId}/add")
    public String showAddForm(@PathVariable Long lessonId, Model model) {
        Resource resource = new Resource();
        Lesson lesson = lessonService.getLessonById(lessonId)
                .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));
        resource.setLesson(lesson);
        model.addAttribute("resource", resource);
        model.addAttribute("types", Resource.ResourceType.values());
        return "resources/add"; // Create resources/add.html
    }

    @PostMapping("/lesson/{lessonId}/add")
    public String addResource(@PathVariable Long lessonId, @ModelAttribute Resource resource) {
        Lesson lesson = lessonService.getLessonById(lessonId)
                .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));
        resource.setLesson(lesson);
        resourceService.saveResource(resource);
        return "redirect:/resources/lesson/" + lessonId;
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Resource resource = resourceService.getResourceById(id)
                .orElseThrow(() -> new IllegalArgumentException("Resource not found"));
        model.addAttribute("resource", resource);
        model.addAttribute("types", Resource.ResourceType.values());
        return "resources/edit"; // Create resources/edit.html
    }

    @PostMapping("/{id}/edit")
    public String editResource(@PathVariable Long id, @ModelAttribute Resource resource) {
        Resource existing = resourceService.getResourceById(id)
                .orElseThrow(() -> new IllegalArgumentException("Resource not found"));
        resource.setId(id);
        resource.setLesson(existing.getLesson());
        resourceService.saveResource(resource);
        return "redirect:/resources/lesson/" + existing.getLesson().getId();
    }

    @PostMapping("/{id}/delete")
    public String deleteResource(@PathVariable Long id) {
        Resource resource = resourceService.getResourceById(id)
                .orElseThrow(() -> new IllegalArgumentException("Resource not found"));
        Long lessonId = resource.getLesson().getId();
        resourceService.deleteResource(id);
        return "redirect:/resources/lesson/" + lessonId;
    }
}