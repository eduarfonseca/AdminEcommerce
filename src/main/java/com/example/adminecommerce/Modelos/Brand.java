package com.example.adminecommerce.Modelos;

public class Brand {
    public int id;

    public Brand(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public String title;

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
}
