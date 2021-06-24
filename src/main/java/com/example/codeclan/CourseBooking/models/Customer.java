package com.example.codeclan.CourseBooking.models;

public class Customer {

    private Long id;

    private String name;

    private String town;

    private Integer age;

    public Customer(String name, String town, Integer age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public Customer() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
