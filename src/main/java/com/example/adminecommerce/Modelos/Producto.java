package com.example.adminecommerce.Modelos;

public class Producto {
    private int id;
    private String title;
    private double price;
    private String description;
    private int stock;
    private String image;
    private double rating;
    private Color color;
    private Brand brand;

    public Producto(int id, String title, double price, String description, int stock, String image, double rating, Color color, Brand brand) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.image = image;
        this.rating = rating;
        this.color = color;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    private void setImage(String image) {
        this.image = image;
    }

    public double getRating() {
        return rating;
    }

    private void setRating(double rating) {
        this.rating = rating;
    }

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    private void setBrand(Brand brand) {
        this.brand = brand;
    }

}

