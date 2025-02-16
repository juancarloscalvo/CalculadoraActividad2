package javabeans;

import static javabeans.Main.entrada;

/**
 * Clase suma que implementa métodos para realizar sumas con disferentes tipos de datos.
 * Autor: Aida Reyes Galván
 * Github: aChaoticAida
 */

public class Suma {
    private double acumulado = 0; //Para la suma con acumulador

    /**
     * ClaseSuma.Suma dos números reales.
     * @param a Primer número.
     * @param b Segundo número.
     * @return La suma de a y b.
     */

    public double sumaReales(double a, double b) {
        return a + b;
    }

    /**
     * ClaseSuma.Suma de dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return La suma de a y b.
     */

    public int sumaEnteros(int a, int b) {
        return a + b;
    }

    /**
     * ClaseSuma.Suma tres números reales.
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número
     * @return La suma de a, b y c.
     */

    public double sumaVariosReales(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * ClaseSuma.Suma un número al valor acumulado.
     * @param a Número para sumar al acumulado.
     * @return Valor acumulado.
     */

    public double sumarAcumulado(double a) {
        return acumulado += a;
    }

    public void MenuSuma() {

        int opcion;
        double acumulado = 0; // Variable para almacenar la suma acumulada
        do {
            System.out.println("**** MENU DE SUMAS ***");
            System.out.println("1. Suma de dos números enteros");
            System.out.println("2. Suma de dos números reales");
            System.out.println("3. Suma de tres números reales");
            System.out.println("4. Ver suma acumulada");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Ingrese dos números enteros para la suma: ");
                        int resultado = sumaEnteros(entrada.nextInt(), entrada.nextInt());
                        System.out.println("Resultado: " + resultado);
                        acumulado += resultado;  // Acumulamos el resultado
                    } catch (Exception e) {
                        System.out.println("Error en la entrada.");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Ingrese dos números reales para la suma: ");
                        double resultado = sumaReales(entrada.nextDouble(), entrada.nextDouble());
                        System.out.println("Resultado: " + resultado);
                        acumulado += resultado;  // Acumulamos el resultado
                    } catch (Exception e) {
                        System.out.println("Error en la entrada.");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Ingrese tres números reales para la suma: ");
                        double resultado = sumaVariosReales(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble());
                        System.out.println("Resultado: " + resultado);
                        acumulado += resultado;  // Acumulamos el resultado
                    } catch (Exception e) {
                        System.out.println("Error en la entrada.");
                    }
                    break;
                case 4:
                    System.out.println("Suma acumulada hasta ahora: " + acumulado);
                    break;

            }
        } while (opcion != 5);

    }