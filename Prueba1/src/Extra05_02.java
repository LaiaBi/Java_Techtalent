import java.util.Scanner;

public class Extra05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las dos cadenas 
        System.out.println("Ingrese la primera cadena:");
        String cadena1 = scanner.nextLine();

        System.out.println("Ingrese la segunda cadena:");
        String cadena2 = scanner.nextLine();

        // Verificar si los dos primeros y los dos últimos caracteres son iguales
        if (sonExtremosIguales(cadena1, cadena2)) {
            System.out.println("Los dos primeros y los dos últimos caracteres son iguales.");
        } else {
            System.out.println("Los dos primeros y los dos últimos caracteres NO son iguales.");
        }

        scanner.close();
    }

    	// Método para verificar si los dos primeros y los dos últimos caracteres 
    	//de dos cadenas son iguales
    private static boolean sonExtremosIguales(String str1, String str2) {
        // Verificar si ambas cadenas tienen al menos cuatro caracteres
        if (str1.length() >= 4 && str2.length() >= 4) {
            // Comparar los dos primeros y los dos últimos caracteres
            return str1.substring(0, 2).equals(str2.substring(0, 2)) &&
                   str1.substring(str1.length() - 2).equals(str2.substring(str2.length() - 2));
        } else {
            // Si alguna de las cadenas no tiene al menos cuatro caracteres, no se pueden comparar
            System.out.println("Ambas cadenas deben tener al menos cuatro caracteres.");
            return false;
        }
    }
}