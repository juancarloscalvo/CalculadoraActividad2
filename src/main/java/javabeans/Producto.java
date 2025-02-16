package javabeans;

import java.util.Scanner;

/**
 * Clase que proporciona la operación de producto.
 * @author enriquemaestre
 * @version 1.0
 */
public class Producto {
    Scanner entrada = new Scanner(System.in);

    /**
     * Permite multiplicar dos números enteros
     * @param multiplicandoEntero Primer número entero
     * @param multiplicadorEntero Segundo número entero
     * @return devuelve la multiplicación entre ambos parámetros con un número entero como resultado.
     */
    public int productoEnteros (int multiplicandoEntero,int multiplicadorEntero) {
        return multiplicandoEntero * multiplicadorEntero;
    }

    /**
     * Permite multiplicar dos números reales
     * @param multiplicandoReal Primer número real
     * @param multiplicadorReal Segundo número real
     * @return devuelve la multiplicación entre ambos parámetros con un número real como resultado.
     */
    public double productoReales (double multiplicandoReal, double multiplicadorReal) {
        return multiplicandoReal * multiplicadorReal;
    }

    /**
     * Permite la multiplicación de tres números reales
     * @param multiplicandoReal Primer número real
     * @param multiplicadorReal Segundo número real
     * @param multiplicador2Real Tercer número real
     * @return devuelve el resultado de multiplicar los tres parámetros en un número real.
     */
    public double productoVariosReales  (double multiplicandoReal, double multiplicadorReal, double multiplicador2Real ) {
        return multiplicandoReal * multiplicadorReal * multiplicador2Real;
    }

    /**
     * Permite realizar la potencia de un número real, siendo:
     * @param base La base de la potencia
     * @param exponente El exponente de la potencia
     * @return
     */
    public double potencia (double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public void MenuProducto() {

        int opcion;
        do {
            System.out.println("**** MENU DE PRODUCTOS ***");
            System.out.println("1. Producto de enteros");
            System.out.println("2. Producto de reales");
            System.out.println("3. Producto varios reales");
            System.out.println("4. Potencia");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    try{
                        System.out.println("Ingrese dos numeros enteros para el producto: ");
                        System.out.println("Resultado: " +productoEnteros(entrada.nextInt(), entrada.nextInt()));
                    }catch(Exception e){}
                break;
                case 2:
                    try{
                        System.out.println("Ingrese dos numeros reales para el producto: ");
                        System.out.println("Resultado: " +(productoReales(entrada.nextDouble(), entrada.nextDouble())));
                    } catch (Exception e) {}
                break;
                case 3:
                    try{
                        System.out.println("Ingrese tres numeros reales para el producto: ");
                        System.out.println("Resultado: "+ productoVariosReales(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble()));
                    } catch (Exception e) {}
                break;
                case 4:
                    try{
                        System.out.println("Ingrese dos numeros reales para la potencia: ");
                        System.out.println("Resulado: "+ potencia(entrada.nextDouble(), entrada.nextDouble()));
                    } catch (Exception e) {}
                break;
            }
        }while (opcion !=5);


    }

}
