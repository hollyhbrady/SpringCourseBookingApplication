package com.example.codeclan.CourseBooking.repositories;

import com.example.codeclan.CourseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
