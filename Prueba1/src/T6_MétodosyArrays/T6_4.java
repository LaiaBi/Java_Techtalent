package T6_MétodosyArrays;
import java.util.Scanner;
public class T6_4 {
	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in); 
			System.out.println("Porfavor, introduzca un numero");  
			String num = sc.nextLine(); 
		
			int numero =Integer.parseInt(num);
			System.out.println(Factorial(numero));
			
			sc.close();
			System.out.println("El binario generado es: " +Factorial(numero));
		}
		
		public static int Factorial(int fact) {
			int resultado=1; 
			
			while (fact>1) {
				resultado = resultado *= fact;
				fact--;
			}
		
			return resultado; 
		}
	}