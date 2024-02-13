import java.util.Scanner;

public class Extra05_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cadena 
        System.out.println("Ingrese una cadena:");
        String input = scanner.nextLine();

        // Leer el índice 
        System.out.println("Ingrese un índice dentro del rango de la cadena:");
        int indice = scanner.nextInt();

        // Verificar si el carácter anterior y el posterior son iguales o no
        if (verificarCaracteresVecinos(input, indice)) {
            System.out.println("El carácter anterior y el posterior al índice son iguales.");
        } else {
            System.out.println("El carácter anterior y el posterior al índice NO son iguales.");
        }

        scanner.close();
    }

    	// Método para verificar si el carácter anterior y el posterior al índice son iguales o no
    	private static boolean verificarCaracteresVecinos(String str, int indice) {
        // Verificar que el índice esté dentro del rango de la cadena
        if (indice >= 1 && indice < str.length() - 1) {
            // Obtener el carácter en el índice y sus vecinos
            char caracterActual = str.charAt(indice);
            char caracterAnterior = str.charAt(indice - 1);
            char caracterPosterior = str.charAt(indice + 1);

            // Verificar si el carácter anterior y el posterior son iguales
            return caracterAnterior == caracterPosterior;
        } else {
            System.out.println("El índice debe estar dentro del rango de la cadena.");
            return false;
        }
    }
}