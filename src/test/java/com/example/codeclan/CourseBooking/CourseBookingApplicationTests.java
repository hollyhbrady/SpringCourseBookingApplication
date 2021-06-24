package com.example.codeclan.CourseBooking;

import com.example.codeclan.CourseBooking.models.Booking;
import com.example.codeclan.CourseBooking.models.Course;
import com.example.codeclan.CourseBooking.models.Customer;
import com.example.codeclan.CourseBooking.repositories.BookingRepository;
import com.example.codeclan.CourseBooking.repositories.CourseRepository;
import com.example.codeclan.CourseBooking.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingApplicationTests {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void canFindCustomerByName() {
		List<Customer> foundCustomer = customerRepository.findByName("Colin");
		assertEquals(1, foundCustomer.size());
		assertEquals("Colin", foundCustomer.get(0).getName());
	}

	@Test
	public void canFindCourseByName() {
		List<Course> foundCourse = courseRepository.findByName("Drag Queen 101");
		assertEquals("Drag Queen 101", foundCourse.get(0).getName());
		assertEquals(1, foundCourse.size());
	}

	@Test
	public void canFindBookingByDate() {
		List<Booking> foundBooking = bookingRepository.findByDate("26-06-2021");
		assertEquals("26-06-2021", foundBooking.get(0).getDate());
		assertEquals(1, foundBooking.size());
	}

}
