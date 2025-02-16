package javabeans;

import java.util.Scanner;

/**
 * Proyecto de la Actividad 2 de ED
 * Calculadora con las siguientes operaciones:
 * Suma, Resta, Producto, Cociente
 *
 * @author Juan Carlos Calvo
 * @version 0.2
 */

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static Cociente cociente = new Cociente();
    static Producto producto = new Producto();

    public static void main(String[] args) {
            int opcion;

            do {
                    opcion = MenuCalculadora();
                    switch (opcion) {
                        case 0:
                                System.out.println("Gracias por usar la calculadora");
                                break;
                        case 1:
                        case 2:
                        case 3:
                                producto.MenuProducto();
                                break;
                        case 4:
                                cociente.MenuDivision();
                                break;
                    }

            } while (opcion != 0);
    }

    private static int MenuCalculadora() {
            System.out.println("Calculadora con las siguientes opciones disponibles: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("Por favor, elige una opción: ");
            return entrada.nextInt();
    }
}