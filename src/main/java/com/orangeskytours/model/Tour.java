package com.orangeskytours.model;

public class Tour {
    private String name;
    private int days;
    private int nights;
    private double price;
    private String image;

    // Constructors
    public Tour() {}

    public Tour(String name, int days, int nights, double price, String image) {
        this.name = name;
        this.days = days;
        this.nights = nights;
        this.price = price;
        this.image = image;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getDays() { return days; }
    public void setDays(int days) { this.days = days; }

    public int getNights() { return nights; }
    public void setNights(int nights) { this.nights = nights; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}