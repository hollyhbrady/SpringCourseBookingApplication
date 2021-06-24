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
        Course strip = new Course("Strip-teasing Tessies", "Glasgow", 2);
        courseRepository.save(strip);
        Course burlesque = new Course("Burlesque Beauties", "Edinburgh", 5);
        courseRepository.save(burlesque);

        Customer colin = new Customer("Colin", "Bellhaven", 35);
        customerRepository.save(colin);
        Customer sam = new Customer("Sam", "Liverpoooool", 31);
        customerRepository.save(sam);
        Customer dan = new Customer("Dan", "Glasgow", 39);
        customerRepository.save(dan);
        Customer spencer = new Customer("Spencer", "London", 29);
        customerRepository.save(spencer);
        Customer niall = new Customer("Niall", "Glasgow", 32);
        customerRepository.save(niall);
        Customer kieran = new Customer("Kieran", "The moon", 31);
        customerRepository.save(kieran);
        Customer john = new Customer("John", "Funfermline", 37);
        customerRepository.save(john);
        Customer gordon = new Customer("Gordon", "The distant past", 41);
        customerRepository.save(gordon);
        Customer andrew = new Customer("Andrew", "unknown", 35);
        customerRepository.save(andrew);
        Customer allen = new Customer("Allen", "Bellhaven", 59);
        customerRepository.save(allen);
        Customer josh = new Customer("Josh", "Ibiza", 26);
        customerRepository.save(josh);
        Customer steven = new Customer("Steven", "Inverness", 103);
        customerRepository.save(steven);
        Customer giuliano = new Customer("Giuliano", "Dubai", 328);
        customerRepository.save(giuliano);
        Customer umair = new Customer("Umair", "Glasgow", 35);
        customerRepository.save(umair);
        Customer wellington = new Customer("Wellington", "Bellhaven", 35);
        customerRepository.save(wellington);
        Customer aaron = new Customer("Aaron", "Linlithgow", 25);
        customerRepository.save(aaron);
        Customer craig = new Customer("Craig", "York", 32);
        customerRepository.save(craig);
        Customer mark = new Customer("Mark", "Auckland", 33);
        customerRepository.save(mark);
        Customer sky = new Customer("Sky", "Meadows", 28);
        customerRepository.save(sky);

        Booking booking1 = new Booking("26-06-2021", drag, colin);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("26-06-2021", drag, sam);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("26-06-2021", drag, dan);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("26-06-2021", drag, spencer);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("26-06-2021", drag, niall);
        bookingRepository.save(booking5);
        Booking booking6 = new Booking("26-06-2021", strip, kieran);
        bookingRepository.save(booking6);
        Booking booking7 = new Booking("26-06-2021", strip, john);
        bookingRepository.save(booking7);
        Booking booking8 = new Booking("26-06-2021", strip, gordon);
        bookingRepository.save(booking8);
        Booking booking9 = new Booking("26-06-2021", strip, andrew);
        bookingRepository.save(booking9);
        Booking booking10 = new Booking("26-06-2021", strip, giuliano);
        bookingRepository.save(booking10);
        Booking booking11 = new Booking("26-06-2021", pole, allen);
        bookingRepository.save(booking11);
        Booking booking12 = new Booking("26-06-2021", pole, josh);
        bookingRepository.save(booking12);
        Booking booking13 = new Booking("26-06-2021", pole, steven);
        bookingRepository.save(booking13);
        Booking booking14 = new Booking("26-06-2021", pole, umair);
        bookingRepository.save(booking14);
        Booking booking15 = new Booking("26-06-2021", pole, wellington);
        bookingRepository.save(booking15);
        Booking booking16 = new Booking("26-06-2021", burlesque, aaron);
        bookingRepository.save(booking16);
        Booking booking17 = new Booking("26-06-2021", burlesque, craig);
        bookingRepository.save(booking17);
        Booking booking18 = new Booking("26-06-2021", burlesque, mark);
        bookingRepository.save(booking18);
        Booking booking19 = new Booking("26-06-2021", burlesque, sky);
        bookingRepository.save(booking19);

    }


}
