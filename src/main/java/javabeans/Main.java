package javabeans;

import java.util.Scanner;

/**
 * Proyecto de la Actividad 2 de ED
 * Calculadora con las siguientes operaciones:
 * Suma, Resta, Producto, Cociente
 *
 * @version 0.1
 */

public class Main {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Calculadora con las siguientes opciones disponibles: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("Por favor, elige una opción: ");
            int opcion = entrada.nextInt();

            switch (opcion) {
                    case 0:
                            System.out.println("Gracias por usar la calculadora");
                            return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
            }
    }
}