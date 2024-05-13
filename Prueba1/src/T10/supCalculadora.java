package T10;
public class supCalculadora {

    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCubica(double numero) {
        return Math.cbrt(numero);
    }
    public class Raices {

        public double raizCuadrada(double numero) {
            return Math.sqrt(numero);
        }
    }
}