package com.example.codeclan.CourseBooking.repositories;


import com.example.codeclan.CourseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
