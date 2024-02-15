package T6_MétodosyArrays;
import java.util.Scanner;
public class T6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solicitar al usuario que ingrese un número
        System.out.print("Introduzca su número: ");
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