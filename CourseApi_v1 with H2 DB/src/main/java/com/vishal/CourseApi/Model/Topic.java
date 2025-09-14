package com.vishal.CourseApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {

    @Id
    private Long id;
    private String title;
    private String description;

    public Topic() {}

    public Topic(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
}
