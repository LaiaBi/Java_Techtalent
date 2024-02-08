import java.util.Scanner;

public class Eje_5_10 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de ventas al usuario
        System.out.print("Ingrese el número de ventas: ");
        int numVentas = scanner.nextInt();

        // Inicializar la variable para la suma de ventas
        double sumaVentas = 0;

        // Pedir las ventas por teclado y sumarlas
        for (int i = 1; i <= numVentas; i++) {
            System.out.print("Ingrese la venta " + i + ": ");
            double venta = scanner.nextDouble();
            sumaVentas += venta;
        }

        // Mostrar la suma de todas las ventas
        System.out.println("\nLa suma de todas las ventas es: " + sumaVentas);

        // Cerrar el scanner
        scanner.close();
    }
}