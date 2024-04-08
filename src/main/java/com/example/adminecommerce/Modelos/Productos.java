package com.example.adminecommerce.Modelos;


import java.util.ArrayList;

public class Productos {
    public static class Producto {
        private final int id;
        private final String title;
        private final double price;
        private final String description;
        private final int stock;
        private final String image;
        private final double rating;
        private final Color color;
        private final Brand brand;

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

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }

        public int getStock() {
            return stock;
        }

        public String getImage() {
            return image;
        }

        public double getRating() {
            return rating;
        }

        public Color getColor() {
            return color;
        }

        public Brand getBrand() {
            return brand;
        }
    }

    private ArrayList<Producto> products;


    public ArrayList<Producto> getProducts() {
        return products;
    }
}




