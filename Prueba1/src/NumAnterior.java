import java.util.Scanner;
public class NumAnterior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Calcular y mostrar los números anteriores
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("La suma de los números anteriores a " + numero + " es: " + suma);
        // Cerrar el scanner
        scanner.close();
    }
}