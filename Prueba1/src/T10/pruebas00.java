package T10;
import java.util.Random;

public class pruebas00 {

    public static void main(String[] args) {
        int cantidadNumeros = 10;
        int minimo = 1;
        int maximo = 100;

        int[] numerosAleatorios = generarNumerosAleatorios(cantidadNumeros, minimo, maximo);

        System.out.println("Números aleatorios generados y su paridad:");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " es ");
            if (esPar(numero)) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }
    }

    public static int[] generarNumerosAleatorios(int cantidad, int minimo, int maximo) {
        int[] numerosAleatorios = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            numerosAleatorios[i] = random.nextInt(maximo - minimo + 1) + minimo;
        }

        return numerosAleatorios;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
