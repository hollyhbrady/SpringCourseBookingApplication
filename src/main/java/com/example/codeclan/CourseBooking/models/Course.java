package com.example.codeclan.CourseBooking.models;

public class Course {

    private Long id;

    private String name;

    private String town;

    private Integer rating;

    public Course(String name, String town, Integer rating) {
        this.name = name;
        this.town = town;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
