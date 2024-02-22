package T6_MétodosyArrays;
import java.util.Scanner;
public class T6_3 {

	public static void main(String[] args) {
	      // Leer la entrada del teclado
	        Scanner scanner = new Scanner(System.in);

	      // Solicitar un número por teclado
	        System.out.print("Introduzca número: ");

	      // Leer el número ingresado
	        int numero = scanner.nextInt();
	        
	     // Verificar si el número es primo utilizando el método esPrimo
	        if (esPrimo(numero)) {
	            System.out.println(numero + " es un número primo.");
	        } else {
	            System.out.println(numero + " no es un número primo.");
	        }

	     // Cerrar el Scanner
	        scanner.close();}
	     // Método para verificar si un número es primo
	        public static boolean esPrimo(int num) {
	            if (num <= 1) {
	                return false;
	            }
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        }
}