package com.example.adminecommerce.Modelos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ObtenerProductosTest {

    @Test
    void obtenerProductosTest(){
        assertEquals(20, ObtenerProductos.obtenerProductos().size());
    }
}