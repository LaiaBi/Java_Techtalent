package T6_MétodosyArrays;
import java.util.Scanner;
public class T6_8 {

public static void main(String[] args) {
		int num[]= new int [10]; 
		
		rellenarValores(num); 
		mostrarValores(num); 

		}
		public static void rellenarValores(int[] array) {
		
			Scanner sc= new Scanner(System.in);
			
			for (int i = 0; i < array.length; i++) {
				System.out.println("Porfavor,inserte un Valor" +(i+1)+": ");
				array[i] = sc.nextInt();
			}
			
			sc.close();
		}
			public static void mostrarValores(int[] array) {
				 System.out.println("Estos son los valores introducidos:");
			        for (int i = 0; i < array.length; i++) {
			            System.out.println("Índice " + i + ": " + array[i]);
			}
		}
}