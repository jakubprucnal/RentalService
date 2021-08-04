package com.example.rentalservice.model;


public class Movie {
    private Long id;
    private String name;
    private Category category;
    private Boolean isAvailable = false;


    public Movie() {
    }

    public Movie(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public Movie(String name, Category category, Boolean isAvailable) {
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
