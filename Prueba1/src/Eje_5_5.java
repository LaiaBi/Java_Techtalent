import java.util.Scanner;
public class Eje_5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // Lee un número por teclado e indica si es divisible entre 2.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Porfavor, introduce un numero entero:");
		
		String introNUM = sc.nextLine();
	
		sc.close();
		
		// es divisible entre 2 (resto = 0). Si no lo es, también indicarlo.
        double num = Double.parseDouble(introNUM);
		if (num % 2 == 0) {
            System.out.println(num + " es divisible por 2.");
        } else {
            System.out.println(num + " no es divisible por 2.");
        }
	}
}