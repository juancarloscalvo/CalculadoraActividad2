package ClaseSuma;

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

    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * ClaseSuma.Suma de dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return La suma de a y b.
     */

    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * ClaseSuma.Suma tres números reales.
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número
     * @return La suma de a, b y c.
     */

    public double sumar(double a, double b, double c) {
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
}
