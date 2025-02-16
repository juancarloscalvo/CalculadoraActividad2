package javabeans;

/**
 * Clase Resta que implementa operaciones de resta para la calculadora.
 *
 * @author Angel
 * @version 1.0
 */
public class Resta {
    private double acumulado;

    /**
     * Constructor de la clase Resta.
     * Inicializa el acumulado en 0.
     */
    public Resta() {
        this.acumulado = 0;
    }

    /**
     * Realiza la resta entre dos números reales.
     *
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return Resultado de la resta a - b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la resta entre dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return Resultado de la resta a - b.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Realiza la resta entre tres números reales.
     *
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return Resultado de la resta a - b - c.
     */
    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Realiza la resta acumulada.
     *
     * @param valor Valor a restar del acumulado.
     * @return Nuevo valor acumulado después de la resta.
     */
    public double restarAcumulado(double valor) {
        this.acumulado -= valor;
        return this.acumulado;
    }

    /**
     * Obtiene el valor acumulado.
     *
     * @return El valor acumulado actual.
     */
    public double getAcumulado() {
        return this.acumulado;
    }
}