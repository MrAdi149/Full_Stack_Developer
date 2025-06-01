package com.jsp.spring.backbencher.ems.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jsp.spring.backbencher.ems.entity.PdfUpload;
import com.jsp.spring.backbencher.ems.service.PdfService;
import com.jsp.spring.backbencher.ems.service.RatingService;
import com.jsp.spring.backbencher.ems.repository.UserRepository;
import com.jsp.spring.backbencher.ems.entity.User;

@Controller
@RequestMapping("/pdf")
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @Autowired
    private RatingService ratingService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/upload")
    public String uploadPdf(@RequestParam("file") MultipartFile file,
                           @RequestParam Long courseId,
                           Principal principal) {
        try {
            Long userId = getCurrentUserId(principal);
            PdfUpload pdfUpload = pdfService.processPdfUpload(file, userId, courseId);
            return "redirect:/course/" + courseId;
        } catch (Exception e) {
            return "redirect:/error";
        }
    }

    @PostMapping("/{id}/rate")
    public String ratePdf(@PathVariable Long id, 
                         @RequestParam int ratingValue,
                         Principal principal) {
        ratingService.ratePdf(id, getCurrentUserId(principal), ratingValue);
        return "redirect:/pdf/" + id;
    }

    private Long getCurrentUserId(Principal principal) {
        String username = principal.getName();
        User user = userRepository.findByEmail(username)
            .orElseThrow(() -> new IllegalArgumentException("User not found"));
        return user.getId();
    }
}