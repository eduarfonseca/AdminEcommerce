package com.example.adminecommerce.Modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class ObtenerProductos {
    public static Productos obtenerProductos(){

        Gson json = new Gson();
        Productos productos = null;

        try (BufferedReader reader = new BufferedReader(new FileReader("DatosPrueba/productos.json"))) {
            Type listType = new TypeToken<Productos>() {
            }.getType();
            productos = json.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productos;
    }
}
