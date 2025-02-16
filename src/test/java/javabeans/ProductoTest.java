package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductoTest {

    Producto productoTest;
    @BeforeEach
    void setUp() {
        productoTest = new Producto();
    }

    @Test
    void productoEnteros() {
        // Test normal
        assertEquals(4, productoTest.productoEnteros(2,2));
        // Test por 0
        assertEquals(0, productoTest.productoEnteros(0,0));
        // Test Negativo
        assertEquals(-4, productoTest.productoEnteros(-2,2));
    }

    @Test
    void productoReales() {
        // Test normal
        assertEquals(6.25, productoTest.productoReales(2.5,2.5));
        // Test por 0
        assertEquals(0, productoTest.productoReales(0.0,0.0));
        // Test Negativo
        assertEquals(-5, productoTest.productoReales(-2.5,2));
    }

    @Test
    void productoVariosReales() {
        // Test normal
        assertEquals(8, productoTest.productoVariosReales(2,2,2));
        // Test por 0
        assertEquals(0, productoTest.productoVariosReales(0.0,0.0, 0.0));
        // Test Negativo
        assertEquals(-25, productoTest.productoVariosReales(-2.5,2, 5));

    }

    @Test
    void potencia() {
        // Test normal
        assertEquals(4, productoTest.potencia(2,2));
        // Test por 0
        assertEquals(1, productoTest.potencia(0,0));
        // Test negativo
        assertEquals(0.25, productoTest.potencia(-2,-2));
    }
}