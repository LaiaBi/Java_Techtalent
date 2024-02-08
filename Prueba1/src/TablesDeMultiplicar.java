public class TablesDeMultiplicar {
	 public static void main(String[] args) {
	        // Imprimir todas las tablas de multiplicar del 1 al 9
	        for (int numero = 1; numero <= 9; numero++) {
	            System.out.println("Tabla de multiplicar del " + numero + ":");
	            for (int i = 0; i <= 10; i++) {
	                int resultado = numero * i;
	                System.out.println(numero + " * " + i + " = " + resultado);
	            }
	            System.out.println(); // Agregar línea en blanco entre las tablas
	        }
	    }
	}