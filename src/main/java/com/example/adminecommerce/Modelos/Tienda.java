package com.example.adminecommerce.Modelos;

import java.util.ArrayList;

public class Tienda {
   private ArrayList<Producto> productos;

    public Tienda(ArrayList<Producto> productos) {
        this.productos = ObtenerProductos.obtenerProductos();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
