package javabeans;

import java.util.Scanner;

/**
 * Clase para las funciones de división de la calculadora
 *
 * Se ha modificado el menú para que cada clase tenga su propio submenu de funciones.
 *
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

    /**
     * Submenu de la parte de Divisiones de la calculadora
     */
    public void MenuDivision() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. División de reales");
            System.out.println("2. División de enteros");
            System.out.println("3. Inverso");
            System.out.println("4. Raiz cuadrada");
            System.out.println("0. Volver al menu");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce dos números reales a dividir:");
                    System.out.println("Resultado: " + dividir(entrada.nextDouble(), entrada.nextDouble()));
                    System.out.println("--------");
                    break;
                case 2:
                    System.out.println("Introduce dos números enteros a dividir:");
                    System.out.println("Resultado: " + dividir(entrada.nextInt(), entrada.nextInt()));
                    System.out.println("--------");
                    break;
                case 3:
                    System.out.println("Introduce un número para obtener su inverso:");
                    System.out.println("Resultado: " + inverso(entrada.nextDouble()));
                    System.out.println("--------");
                    break;
                case 4:
                    System.out.println("Introduce un número para obtener su raiz cuadrada:");
                    System.out.println("Resultado: " + raiz(entrada.nextDouble()));
                    System.out.println("--------");
                    break;
            }
        } while (opcion != 0);
    }
}
