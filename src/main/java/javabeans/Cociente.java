package javabeans;

/**
 * Clase para las funciones de división de la calculadora
 * @author Juan Carlos Calvo Villardón
 * @version 0.1
 */

public class Cociente {

    /**
     * Permite dividir dos números reales
     * @param numero1 Primer número real
     * @param numero2 Segundo numero real
     * @return Devuelve la división del primer y segundo número real.
     */
    public double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    /**
     * Permite dividir dos números enteros
     * @param numero1 Primer número real
     * @param numero2 Segundo numero real
     * @return Devuelve la división del primer y segundo número real.
     */
    public int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }

    /**
     * Permite obtener el inverso del número indicado
     * @param numero El número del que se quiere obtener el inverso
     * @return Devuelve el inverso del número del parametro.
     */
    public double inverso(double numero) {
        return 1 / numero;
    }

    /**
     * Permite obtener la raiz cuadrada del número indicado
     * @param numero El número del que se desea obtener la raiz cuadrada
     * @return Devuelve la raíz cuadrada del número pasado por parametro.
     */
    public double raiz(double numero) {
        return Math.sqrt(numero);
    }
}
