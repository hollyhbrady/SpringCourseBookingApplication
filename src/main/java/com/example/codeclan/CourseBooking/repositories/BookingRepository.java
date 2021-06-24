package com.example.codeclan.CourseBooking.repositories;


import com.example.codeclan.CourseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
