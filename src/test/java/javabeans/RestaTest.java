package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CLase de prueba para la clase Resta
 * @author enriquemaestre
 */
class RestaTest {

    Resta RestaTest;
    @BeforeEach
    void setUp(){
        RestaTest = new Resta();
    }

    @Test
    void restar(){
        // Test normal
        assertEquals(1, RestaTest.restar(3,2));
        // Test resultado 0
        assertEquals(0, RestaTest.restar(2,2));
        // Test negativo
        assertEquals(-1, RestaTest.restar(2,3));
    }

    double restarAcumulado(){
        // Test acumulado
        return RestaTest.restarAcumulado(3);
    }
    @Test
    void restarReales(){
        // Test normal
        assertEquals(2.5, RestaTest.restar(5,2.5));
        // Test resultado 0
        assertEquals(0, RestaTest.restar(2.5,2.5));
        // Test resultado negativo
        assertEquals(-1, RestaTest.restar(2.5,3.5));
    }
    void restarVariosReales(){
        // Test normal
        assertEquals(2.5, RestaTest.restar(10,2.5,5));
        // Test resultado 0
        assertEquals(0, RestaTest.restar(10,2.5,7.5));
        // Test resultado negativo
        assertEquals(-1, RestaTest.restar(10,2.5,8.5));
    }









}