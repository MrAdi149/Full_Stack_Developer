package com.jsp.spring.backbencher.ems.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.jsp.spring.backbencher.ems.entity.User;
import com.jsp.spring.backbencher.ems.repository.UserRepository;
import com.jsp.spring.backbencher.ems.service.RatingService;

@Controller
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/pdf/{pdfId}")
    public String ratePdf(@PathVariable Long pdfId,
                          @RequestParam int value,
                          Principal principal) {
        User user = userRepository.findByEmail(principal.getName())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        ratingService.ratePdf(pdfId, user.getId(), value);
        return "redirect:/pdf/" + pdfId;
    }

    @PostMapping("/article/{articleId}")
    public String rateArticle(@PathVariable Long articleId,
                              @RequestParam int value,
                              Principal principal) {
        User user = userRepository.findByEmail(principal.getName())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        ratingService.rateArticle(articleId, user.getId(), value);
        return "redirect:/articles/" + articleId;
    }
}