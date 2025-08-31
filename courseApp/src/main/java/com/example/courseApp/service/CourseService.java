package com.example.courseApp.service;



import com.example.courseApp.entity.Course;
import com.example.courseApp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // 1. Add new course
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    // 2. Get all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // 3. Get course by Id
    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    // 4. Update course
    public Course updateCourse(int id, Course courseDetails) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            course.setCourseName(courseDetails.getCourseName());
            course.setDescription(courseDetails.getDescription());
            course.setFees(courseDetails.getFees());
            return courseRepository.save(course);
        }
        return null;
    }

    // 5. Delete course
    public String deleteCourse(int id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
            return "Course deleted successfully!";
        }
        return "Course not found!";
    }
}
