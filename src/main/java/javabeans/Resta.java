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

    public void MenuResta() {

        int opcion;
        do {
            System.out.println("**** MENU DE RESTAS ***");
            System.out.println("1. Resta de enteros");
            System.out.println("2. Resta de reales");
            System.out.println("3. Resta de tres números reales");
            System.out.println("4. Resta acumulada");
            System.out.println("5. Salir");
            opcion = Main.entrada.nextInt();  // ✅ Usamos Main.entrada en lugar de entrada

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Ingresa dos números enteros para la resta: ");
                        System.out.println("Resultado: " + restar(Main.entrada.nextInt(), Main.entrada.nextInt()));
                    } catch (Exception e) {
                        System.out.println("Error en la entrada.");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Ingresa dos números reales para la resta: ");
                        System.out.println("Resultado: " + restar(Main.entrada.nextDouble(), Main.entrada.nextDouble()));
                    } catch (Exception e) {
                        System.out.println("Error en la entrada.");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Ingresa tres números reales para la resta: ");
                        System.out.println("Resultado: " + restar(Main.entrada.nextDouble(), Main.entrada.nextDouble(), Main.entrada.nextDouble()));
                    } catch (Exception e) {
                        System.out.println("Error en la entrada.");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Ingresa un número para restarlo del acumulado: ");
                        System.out.println("Nuevo acumulado: " + restarAcumulado(Main.entrada.nextDouble()));
                    } catch (Exception e) {
                        System.out.println("Error en la entrada.");
                    }
                    break;
            }
        } while (opcion != 5);
    }
}