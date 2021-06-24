package com.example.codeclan.CourseBooking.controllers;

import com.example.codeclan.CourseBooking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity getAllCoursesAndFilters(
            @RequestParam(required = false, name = "date") String date,
            @RequestParam(required = false, name = "courseId") Long courseId,
            @RequestParam(required = false, name = "customerId") Long customerId
    ) { // http://localhost:8080/bookings?date=26-06-2021
        if (date != null) {
            return new ResponseEntity<>(bookingRepository.findByDate(date), HttpStatus.OK);
        } // http://localhost:8080/courses/?rating=5
        if (courseId != null) {
            return new ResponseEntity<>(bookingRepository.findByCourseId(courseId), HttpStatus.OK);
        } // http://localhost:8080/bookings?courseId=3
        if (customerId != null) {
            return new ResponseEntity(bookingRepository.findByCustomerId(customerId), HttpStatus.OK);
        } // http://localhost:8080/bookings?customerId=8
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }
}
