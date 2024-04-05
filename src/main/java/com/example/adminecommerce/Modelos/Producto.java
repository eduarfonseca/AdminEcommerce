package com.example.adminecommerce.Modelos;

public class Producto {
    public int id;
    public String title;
    public double price;
    public String description;
    public int stock;
    public String image;
    public double rating;
    public Color color;
    public Brand brand;

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

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}

