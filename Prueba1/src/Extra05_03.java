import java.util.Scanner;

public class Extra05_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cadena 
        System.out.println("Ingrese una cadena:");
        String input = scanner.nextLine();

        // Verificar si "abc" se encuentra en la cadena, pero no al comienzo ni al final
        if (contieneABCEnMedio(input)) {
            System.out.println("La cadena contiene 'abc' en algún lugar que no "
            		+ "sea al comienzo ni al final.");
        } else {
            System.out.println("La cadena NO contiene 'abc' en algún lugar que no "
            		+ "sea al comienzo ni al final.");
        }

        scanner.close();
    }

    // Método para verificar si "abc" se encuentra en la cadena, pero no al comienzo ni al final
    private static boolean contieneABCEnMedio(String str) {
        // Verificar si "abc" se encuentra en la cadena
        if (str.contains("abc")) {
            // Verificar que "abc" no esté al comienzo ni al final
            return !str.startsWith("abc") && !str.endsWith("abc");
        }
        return false;
    }
}