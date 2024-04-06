package com.example.adminecommerce.Modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class ObtenerProductos {
    public static ArrayList<Producto> obtenerProductos(){
        ArrayList<Producto> productos = new ArrayList<>();
        Gson json = new Gson();

        try (BufferedReader reader = new BufferedReader(new FileReader("DatosPrueba/productos.json"))) {
            Type listType = new TypeToken<ArrayList<Producto>>() {
            }.getType();
            productos = json.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productos;
    }
}
