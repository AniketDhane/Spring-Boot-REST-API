package com.example.courseApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courseApp.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
