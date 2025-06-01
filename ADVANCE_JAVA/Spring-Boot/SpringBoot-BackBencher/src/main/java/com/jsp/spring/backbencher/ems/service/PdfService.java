package com.jsp.spring.backbencher.ems.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jsp.spring.backbencher.ems.entity.Course;
import com.jsp.spring.backbencher.ems.entity.PdfUpload;
import com.jsp.spring.backbencher.ems.entity.User;
import com.jsp.spring.backbencher.ems.repository.CourseRepository;
import com.jsp.spring.backbencher.ems.repository.PdfUploadRepository;
import com.jsp.spring.backbencher.ems.repository.UserRepository;

@Service
public class PdfService {

    @Value("${file.upload-dir}")
    private String uploadDir;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private PdfUploadRepository pdfUploadRepository;

    public PdfUpload processPdfUpload(MultipartFile file, Long userId, Long courseId) throws IOException {
        // 1. Create upload directory if not exists
        Path uploadPath = Paths.get(uploadDir);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        // 2. Generate unique filename
        String originalFilename = file.getOriginalFilename();
        String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
        String uniqueFilename = UUID.randomUUID() + fileExtension;
        Path filePath = uploadPath.resolve(uniqueFilename);

        // 3. Save file to disk
        Files.copy(file.getInputStream(), filePath);

        // 4. Extract text from PDF (updated PDFBox 3.x syntax)
        String extractedText = "";
        try (PDDocument document = PDDocument.load(filePath.toFile())) {  // Changed here
            if (!document.isEncrypted()) {
                PDFTextStripper stripper = new PDFTextStripper();
                extractedText = stripper.getText(document);
            }
        }

        // 5. Create and populate PdfUpload entity
        PdfUpload pdfUpload = new PdfUpload();
        pdfUpload.setFileName(originalFilename);
        pdfUpload.setFilePath("/uploads/" + uniqueFilename);
        pdfUpload.setExtractedText(extractedText);

        // 6. Set relationships
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));
        pdfUpload.setUser(user);
        pdfUpload.setCourse(course);

        // 7. Save to database
        return pdfUploadRepository.save(pdfUpload);
    }
}
