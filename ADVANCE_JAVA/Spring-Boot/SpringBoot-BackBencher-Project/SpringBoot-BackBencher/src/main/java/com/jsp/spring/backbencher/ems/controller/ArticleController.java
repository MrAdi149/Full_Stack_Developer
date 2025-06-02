package com.jsp.spring.backbencher.ems.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jsp.spring.backbencher.ems.entity.Article;
import com.jsp.spring.backbencher.ems.entity.Course;
import com.jsp.spring.backbencher.ems.entity.User;
import com.jsp.spring.backbencher.ems.service.ArticleService;
import com.jsp.spring.backbencher.ems.service.CourseService;
import com.jsp.spring.backbencher.ems.service.UserService;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String listArticles(Model model) {
        List<Article> articles = articleService.getAllArticles();
        model.addAttribute("articles", articles);
        return "articles/list";
    }

    @GetMapping("/{id}")
    public String getArticle(@PathVariable Long id, Model model) {
        Article article = articleService.getArticleById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id));
        model.addAttribute("article", article);
        return "articles/detail";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("article", new Article());
        model.addAttribute("courses", courseService.getAllCourses());
        return "articles/add";
    }

    @PostMapping("/add")
    public String addArticle(@ModelAttribute Article article, @RequestParam Long courseId, Principal principal) {
        User user = userService.findByEmail(principal.getName())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Course course = courseService.getCourseById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));
        article.setAuthor(user);
        article.setCourse(course);
        articleService.saveArticle(article);
        return "redirect:/articles";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Article article = articleService.getArticleById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id));
        model.addAttribute("article", article);
        model.addAttribute("courses", courseService.getAllCourses());
        return "articles/edit";
    }

    @PostMapping("/{id}/edit")
    public String editArticle(@PathVariable Long id, @ModelAttribute Article article, @RequestParam Long courseId) {
        Article existing = articleService.getArticleById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id));
        article.setId(id);
        article.setAuthor(existing.getAuthor());
        Course course = courseService.getCourseById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));
        article.setCourse(course);
        articleService.saveArticle(article);
        return "redirect:/articles";
    }

    @PostMapping("/{id}/delete")
    public String deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
        return "redirect:/articles";
    }

    @GetMapping("/search")
    public String searchArticles(@RequestParam String query, Model model) {
        List<Article> articles = articleService.searchArticles(query);
        model.addAttribute("articles", articles);
        model.addAttribute("query", query);
        return "articles/search";
    }
}