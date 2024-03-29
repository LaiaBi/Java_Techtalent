package T9_Herencia;

public class T9_4Raices {
	private double a;
    private double b;
    private double c;

    // Constructor
    public T9_4Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //  Discriminante
    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Comprobar si tiene dos soluciones
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    // Comprobar si tiene una única solución
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    // Calcular e imprimir las posibles soluciones
    public void calcular() {
        double discriminante = getDiscriminante();
        if (tieneRaices()) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: " + raiz1 + " y " + raiz2);
        } else if (tieneRaiz()) {
            double raizUnica = -b / (2 * a);
            System.out.println("Solo és: " + raizUnica);
        } else {
            System.out.println("No hay solución.");
        }
    }

    // Imprimir las dos posibles soluciones
    public void obtenerRaices() {
        double discriminante = getDiscriminante();
        if (tieneRaices()) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else {
            System.out.println("No se ven raíces reales.");
        }
    }

    // Imprimir la única raíz
    public void obtenerRaiz() {
        double discriminante = getDiscriminante();
        if (tieneRaiz()) {
            double raizUnica = -b / (2 * a);
            System.out.println("La única raíz es: " + raizUnica);
        } else {
            System.out.println("No tiene una única raíz real.");
        }
    }
}
