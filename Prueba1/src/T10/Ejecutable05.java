package T10;
import java.util.Scanner;

public class Ejecutable05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array de contraseñas: ");
        int tamañoArray = scanner.nextInt();

        Password05[] contraseñas = new Password05[tamañoArray];

        for (int i = 0; i < tamañoArray; i++) {
            contraseñas[i] = new Password05();
        }

        System.out.println("Array de contraseñas generado:");

        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Contraseña " + (i + 1) + ": " + contraseñas[i].getContraseña());
        }

        scanner.close();
    }
}
