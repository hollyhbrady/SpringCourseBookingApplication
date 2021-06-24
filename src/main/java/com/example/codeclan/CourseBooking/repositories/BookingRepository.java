package com.example.codeclan.CourseBooking.repositories;


import com.example.codeclan.CourseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByDate(String date);

    List<Booking> findByCourseId(Long courseId);

    List<Booking> findByCustomerId(Long customerId);

}
