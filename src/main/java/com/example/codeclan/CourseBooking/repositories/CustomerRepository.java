package com.example.codeclan.CourseBooking.repositories;

import com.example.codeclan.CourseBooking.models.Booking;
import com.example.codeclan.CourseBooking.models.Course;
import com.example.codeclan.CourseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByName(String name);
    List<Customer> findByBookingsCourseName(String name);
}

