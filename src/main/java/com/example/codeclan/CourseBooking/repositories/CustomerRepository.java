package com.example.codeclan.CourseBooking.repositories;

import com.example.codeclan.CourseBooking.models.Booking;
import com.example.codeclan.CourseBooking.models.Course;
import com.example.codeclan.CourseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAllByName(String name);

    List<Customer> findAllByTown(String town);

    List<Customer> findAllByAge(Integer age);

    List<Customer> findAllByBookingsCourseName(String name);

    List<Customer> findAllByTownAndBookingsCourseId(String town, Long courseId);

    List<Customer> findAllByAgeAndTownAndBookingsCourseId(Integer age, String town, Long courseId);

}

