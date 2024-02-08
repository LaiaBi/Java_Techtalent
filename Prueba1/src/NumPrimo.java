import java.util.Scanner;

public class NumPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número entero mayor que 1: ");
        int numero = scanner.nextInt();

        // Verificar si el número es primo
        boolean esPrimo = verificarPrimo(numero);

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean verificarPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si es divisible por algún número, no es primo
            }
        }
        return true; // Si no fue divisible por ningún número, es primo
    }
}