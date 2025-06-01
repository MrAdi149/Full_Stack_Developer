package com.jsp.spring.backbencher.ems.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jsp.spring.backbencher.ems.entity.Article;
import com.jsp.spring.backbencher.ems.entity.Comment;
import com.jsp.spring.backbencher.ems.entity.User;
import com.jsp.spring.backbencher.ems.service.ArticleService;
import com.jsp.spring.backbencher.ems.service.CommentService;
import com.jsp.spring.backbencher.ems.service.UserService;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addComment(@RequestParam Long articleId,
                             @RequestParam String content,
                             @RequestParam(required = false) Long parentCommentId,
                             Principal principal) {
        User user = userService.findByEmail(principal.getName())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Article article = articleService.getArticleById(articleId)
                .orElseThrow(() -> new IllegalArgumentException("Article not found"));

        Comment comment = new Comment();
        comment.setContent(content);
        comment.setAuthor(user);
        comment.setArticle(article);

        if (parentCommentId != null) {
            Comment parent = commentService.getCommentById(parentCommentId)
                    .orElseThrow(() -> new IllegalArgumentException("Parent comment not found"));
            comment.setParentComment(parent);
        }

        commentService.saveComment(comment);
        return "redirect:/articles/" + articleId;
    }

    @PostMapping("/{id}/delete")
    public String deleteComment(@PathVariable Long id, @RequestParam Long articleId) {
        commentService.deleteComment(id);
        return "redirect:/articles/" + articleId;
    }
}