package javabeans;

import ClaseSuma.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    Suma sumaTest;

    @BeforeEach
    void setUp() {
        sumaTest = new Suma();
    }

    @Test
    void testSumarDosEnteros() {
        // Test normal
        assertEquals(4, sumaTest.sumar(2,2));
        // Test con 0
        assertEquals(5, sumaTest.sumar(5,0));
        // Test con número negativo
        assertEquals(-1, sumaTest.sumar(-2,1));
    }

    @Test
    void testSumarDosReales() {
        // Test normal
        assertEquals(5.5, sumaTest.sumar(2.2,3.3), 0.0001);
        // Test con 0
        assertEquals(3.5, sumaTest.sumar(3.5,0), 0.0001);
        // Test con número negativo
        assertEquals(-1.0, sumaTest.sumar(-2.5,1.5), 0.0001);
    }

    @Test
    void testSumarTresReales() {
        // Test normal
        assertEquals(9.9, sumaTest.sumar(3.3,3.3,3.3), 0.0001);
        // Test con 0
        assertEquals(4.4, sumaTest.sumar(4.4,0,0), 0.0001);
        // Test con número negativo
        assertEquals(-1.2, sumaTest.sumar(-2.0,0.5,0.3), 0.0001);
    }

    @Test
    void testSumarAcumulado() {
        // Test normal
        assertEquals(3.5, sumaTest.sumarAcumulado(3.5), 0.0001);
        assertEquals(8.0, sumaTest.sumarAcumulado(4.5), 0.0001);
        // Test con 0 (no cambia el acumulado)
        assertEquals(8.0, sumaTest.sumarAcumulado(0), 0.0001);
    }
}