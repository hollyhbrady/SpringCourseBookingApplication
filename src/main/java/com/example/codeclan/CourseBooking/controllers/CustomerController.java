package com.example.codeclan.CourseBooking.controllers;

import com.example.codeclan.CourseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity getAllCustomersAndFilters(
        @RequestParam(required = false, name = "name") String name,
        @RequestParam(required = false, name = "town") String town,
        @RequestParam(required = false, name = "age") Integer age,
        @RequestParam(required = false, name = "courseName") String courseName,
        @RequestParam(required = false, name = "courseId") Long courseId
    ) { // http://localhost:8080/customers?town=Glasgow&courseId=1
        if (age != null && town != null && courseId != null) {
            return new ResponseEntity<>(customerRepository.findAllByAgeAndTownAndBookingsCourseId(age, town, courseId), HttpStatus.OK);
        } // http://localhost:8080/customers?town=Glasgow&courseId=1&age=32
        if (town != null && courseId != null) {
            return new ResponseEntity<>(customerRepository.findAllByTownAndBookingsCourseId(town, courseId), HttpStatus.OK);
        } // http://localhost:8080/customers/?name=Colin
        if (name != null) {
            return new ResponseEntity<>(customerRepository.findAllByName(name), HttpStatus.OK);
        } // http://localhost:8080/customers/?town=Glasgow
        if (town != null) {
            return new ResponseEntity<>(customerRepository.findAllByTown(town), HttpStatus.OK);
        } // http://localhost:8080/customers/?age=35
        if (age != null) {
            return new ResponseEntity<>(customerRepository.findAllByAge(age), HttpStatus.OK);
        } // http://localhost:8080/customers/?courseName=Drag+Queen+101
        if (courseName != null) {
            return new ResponseEntity(customerRepository.findAllByBookingsCourseName(courseName), HttpStatus.OK);
        } // http://localhost:8080/customers
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
}
