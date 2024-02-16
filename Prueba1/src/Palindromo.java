import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cadena de texto 
        System.out.println("Ingrese posible palíndromo:");
        String input = scanner.nextLine();

        // Verificar si la cadena es un palíndromo
        if (esPalindromo(input)) {
            System.out.println("¡Guau! es un palíndromo.");
        } else {
            System.out.println("Lastima... NO es un palíndromo.");
        }

        scanner.close();
    }

    	// Método para verificar si una cadena es un palíndromo
    private static boolean esPalindromo(String str) {
        // Eliminar espacios y convertir a minúsculas para ignorar mayúsculas y minúsculas
        str = str.replaceAll("\\s", "").toLowerCase();

        // Comparar la cadena original con su reverso
        String reverso = new StringBuilder(str).reverse().toString();
        return str.equals(reverso);
    }
}