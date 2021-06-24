package com.example.codeclan.CourseBooking.controllers;

import com.example.codeclan.CourseBooking.repositories.CourseRepository;
import com.example.codeclan.CourseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity getAllCustomersAndFilters(
            @RequestParam(required = false, name = "name") String name,
            @RequestParam(required = false, name = "town") String town,
            @RequestParam(required = false, name = "rating") Integer rating,
            @RequestParam(required = false, name = "courseName") String customerName
    ) {
        if (name != null) {
            return new ResponseEntity<>(courseRepository.findByName(name), HttpStatus.OK);
        }
        if (town != null) {
            return new ResponseEntity<>(courseRepository.findByTown(town), HttpStatus.OK);
        }
        if (rating != null) {
            return new ResponseEntity<>(courseRepository.findByRating(rating), HttpStatus.OK);
        }
        // http://localhost:8080/customers/?courseName=Drag+Queen+101
        if (customerName != null) {
            return new ResponseEntity(courseRepository.findByCustomerName(customerName), HttpStatus.OK);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }
}
