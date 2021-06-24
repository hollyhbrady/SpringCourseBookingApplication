package com.example.codeclan.CourseBooking.models;

public class Booking {

    private Long id;

    private String date;

    private Booking booking;

    private Customer customer;

    public Booking(String date, Booking booking, Customer customer) {
        this.date = date;
        this.booking = booking;
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
