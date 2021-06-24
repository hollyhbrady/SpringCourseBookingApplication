package com.example.codeclan.CourseBooking.components;

import com.example.codeclan.CourseBooking.models.Booking;
import com.example.codeclan.CourseBooking.models.Course;
import com.example.codeclan.CourseBooking.models.Customer;
import com.example.codeclan.CourseBooking.repositories.BookingRepository;
import com.example.codeclan.CourseBooking.repositories.CourseRepository;
import com.example.codeclan.CourseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import org.springframework.boot.ApplicationRunner;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Course drag = new Course("Drag Queen 101", "Edinburgh", 5);
        courseRepository.save(drag);

        Course pole = new Course("Basics of Pole-dancing", "Glasgow", 3);
        courseRepository.save(pole);

        Customer colin = new Customer("Colin", "Bellhaven", 35);
        customerRepository.save(colin);

        Booking booking1 = new Booking("26-06-2021", drag, colin);
        bookingRepository.save(booking1);
    }


}
