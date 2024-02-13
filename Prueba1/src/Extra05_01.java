import java.util.Scanner;

public class Extra05_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las dos cadenas 
        System.out.println("Ingrese la primera cadena:");
        String cadena1 = scanner.nextLine();

        System.out.println("Ingrese la segunda cadena:");
        String cadena2 = scanner.nextLine();

        // Verificar si  son iguales
        if (sonPrimerosCaracteresIguales(cadena1, cadena2)) {
            System.out.println("Los dos primeros caracteres son iguales.");
        } else {
            System.out.println("Los dos primeros caracteres NO son iguales.");
        }

        scanner.close();
    }

    	// Método para verificar si  son iguales
    private static boolean sonPrimerosCaracteresIguales(String str1, String str2) {
        // Verificar si ambas tienen al menos dos caracteres
        if (str1.length() >= 2 && str2.length() >= 2) {
            // Comparar 
            return str1.substring(0, 2).equals(str2.substring(0, 2));
        } else {
            // Si alguna de las cadenas no tiene al menos dos caracteres, no se pueden comparar
            System.out.println("Ambas cadenas deben tener al menos dos caracteres.");
            return false;
        }
    }
}