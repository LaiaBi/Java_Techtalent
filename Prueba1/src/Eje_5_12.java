import java.util.Scanner;

public class Eje_5_12 {

    public static void main(String[] args) {
        // Definir la contraseña
        String contraseñaCorrecta = "contraseña123";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Intentos permitidos
        int intentosMaximos = 3;

        // Variable para indicar si se acertó la contraseña
        boolean contraseñaCorrectaIngresada = false;

        // Ciclo para solicitar la contraseña con límite de 3 intentos
        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.print("Introduce la contraseña (Intento " + intento + "): ");
            String contraseñaIngresada = scanner.nextLine();

            // Verificar si la contraseña es correcta
            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                contraseñaCorrectaIngresada = true;
                System.out.println("Enhorabuena. Contraseña correcta. Acceso concedido.");
                break; // Salir del bucle si la contraseña es correcta
            } else {
                System.out.println("Contraseña incorrecta. Intenta de nuevo.");
            }
        }

        // Si no se acertó la contraseña, mostrar mensaje
        if (!contraseñaCorrectaIngresada) {
            System.out.println("Has excedido el número de intentos permitidos. Acceso denegado.");
        }
    }
}