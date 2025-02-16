package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocienteTest {

    private Cociente cociente = new Cociente();

    @Test

   // @org.junit.jupiter.api.Test
    void dividir() {

    }

    private void assertEquals(double v, double dividir, double v1) {
    }

    private void assertEquals(int i, int dividir) {
    }
    @Test
    void testDividir() {
        //División de dos números reales
        assertEquals(2.5, cociente.dividir(5.0,2.0),0.001);
        // División de dos números enteros
        assertEquals(3, cociente.dividir(9,3));
        // Pueba especial: División por 0 (debe dar error)

    }

    @org.junit.jupiter.api.Test

    void testInverso() {
        //Inverso de un número positivo
        assertEquals(0.5, cociente.inverso(2.0), 0.0001);
        //Inverso de un número negativo
        assertEquals(-0.2, cociente.inverso(-5.0), 0.0001);
    }

    @org.junit.jupiter.api.Test
    void testRaiz() {
        //Raíz cuadrada de un número positivo
        assertEquals(4.0, cociente.raiz(16.0), 0.0001);
    }


}