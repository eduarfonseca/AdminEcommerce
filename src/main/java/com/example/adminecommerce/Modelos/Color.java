package com.example.adminecommerce.Modelos;

public class Color {
    public int id;
    private String code;
    private String name;

    public Color(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    private void setCode(String code) {
        this.code = code;
    }

}
