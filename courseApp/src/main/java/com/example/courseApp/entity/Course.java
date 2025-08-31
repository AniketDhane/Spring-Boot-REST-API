package com.example.courseApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    
    @Id
    private int courseId;
    private String courseName;
    private String description;
    private double fees;

    // Constructors
    public Course() {}

    public Course(int courseId, String courseName, String description, double fees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.fees = fees;
    }

    // Getters & Setters
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getFees() { return fees; }
    public void setFees(double fees) { this.fees = fees; }
}
