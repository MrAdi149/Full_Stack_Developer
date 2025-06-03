package com.jsp.spring.backbencher.ems.controller;

import java.io.IOException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jsp.spring.backbencher.ems.entity.PdfUpload;
import com.jsp.spring.backbencher.ems.entity.User;
import com.jsp.spring.backbencher.ems.repository.UserRepository;
import com.jsp.spring.backbencher.ems.service.PdfService;
import com.jsp.spring.backbencher.ems.service.RatingService;

@RestController
@RequestMapping("/api/pdf")
public class PdfRestController {

    @Autowired
    private PdfService pdfService;

    @Autowired
    private RatingService ratingService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadPdf(@RequestParam("file") MultipartFile file,
                                       @RequestParam Long courseId,
                                       Principal principal) {
        Long userId = getCurrentUserId(principal);
        try {
            PdfUpload pdfUpload = pdfService.processPdfUpload(file, userId, courseId);
            return ResponseEntity.ok(pdfUpload);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to upload PDF: " + e.getMessage());
        }
    }

    @PostMapping("/{id}/rate")
    public ResponseEntity<?> ratePdf(@PathVariable Long id,
                                     @RequestParam int ratingValue,
                                     Principal principal) {
        ratingService.ratePdf(id, getCurrentUserId(principal), ratingValue);
        return ResponseEntity.ok().build();
    }

    private Long getCurrentUserId(Principal principal) {
        String username = principal.getName();
        User user = userRepository.findByEmail(username)
            .orElseThrow(() -> new IllegalArgumentException("User not found"));
        return user.getId();
    }
}