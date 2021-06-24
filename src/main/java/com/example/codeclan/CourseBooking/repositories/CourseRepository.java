package com.example.codeclan.CourseBooking.repositories;


import com.example.codeclan.CourseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByName(String name);

    List<Course> findByTown(String town);

    List<Course> findByRating(Integer rating);

    List<Course> findByBookingsCustomerName(String customerName);

}
