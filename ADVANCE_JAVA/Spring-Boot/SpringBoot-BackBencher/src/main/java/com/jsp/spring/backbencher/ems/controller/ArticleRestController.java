package com.jsp.spring.backbencher.ems.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.spring.backbencher.ems.entity.Article;
import com.jsp.spring.backbencher.ems.entity.Course;
import com.jsp.spring.backbencher.ems.entity.User;
import com.jsp.spring.backbencher.ems.service.ArticleService;
import com.jsp.spring.backbencher.ems.service.CourseService;
import com.jsp.spring.backbencher.ems.service.UserService;

@RestController
@RequestMapping("/api/articles")
public class ArticleRestController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Article> listArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getArticle(@PathVariable Long id) {
        return articleService.getArticleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Article> addArticle(@RequestBody Article article,
                                              @RequestParam Long courseId,
                                              Principal principal) {
        User user = userService.findByEmail(principal.getName())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Course course = courseService.getCourseById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));
        article.setAuthor(user);
        article.setCourse(course);
        Article saved = articleService.saveArticle(article);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Article> editArticle(@PathVariable Long id,
                                               @RequestBody Article article,
                                               @RequestParam Long courseId) {
        Article existing = articleService.getArticleById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id));
        article.setId(id);
        article.setAuthor(existing.getAuthor());
        Course course = courseService.getCourseById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));
        article.setCourse(course);
        Article saved = articleService.saveArticle(article);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search")
    public List<Article> searchArticles(@RequestParam String query) {
        return articleService.searchArticles(query);
    }
}