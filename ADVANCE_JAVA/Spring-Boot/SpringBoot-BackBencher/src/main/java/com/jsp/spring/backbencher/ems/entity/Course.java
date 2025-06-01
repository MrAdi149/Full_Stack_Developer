package com.jsp.spring.backbencher.ems.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CourseType type; // JFS or PFS

    @Column(columnDefinition = "TEXT")
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // Relationships
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Article> articles = new ArrayList<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PdfUpload> pdfUploads = new ArrayList<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lesson> lessons = new ArrayList<>();

    // Enum for course type
    public enum CourseType {
        JFS, PFS
    }

    // Helper methods
    public void addArticle(Article article) {
        articles.add(article);
        article.setCourse(this);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CourseType getType() {
		return type;
	}

	public void setType(CourseType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<PdfUpload> getPdfUploads() {
		return pdfUploads;
	}

	public void setPdfUploads(List<PdfUpload> pdfUploads) {
		this.pdfUploads = pdfUploads;
	}

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}    
}
