package T10;
import java.util.Scanner;

public class SimplesCalcul04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora Simple");

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz Cuadrada (para el primer número)");
        System.out.println("7. Raíz Cúbica (para el segundo número)");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("La división es: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            case 5:
                System.out.println("La potencia de " + num1 + " elevado a " + num2 + " es: " + Math.pow(num1, num2));
                break;
            case 6:
                System.out.println("La raíz cuadrada de " + num1 + " es: " + Math.sqrt(num1));
                break;
            case 7:
                System.out.println("La raíz cúbica de " + num2 + " es: " + Math.cbrt(num2));
                break;
            default:
                System.out.println("Impossible.");
        }

        scanner.close();
    }
}
