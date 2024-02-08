import java.util.Scanner;
public class Eje_5_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lee un número por teclado (puede tener decimales)
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Añade el precio del producto: ");
				
				String initialPROD = sc.nextLine();
				
				sc.close();
				
		//IVA
				double prod = Double.parseDouble(initialPROD);
				final double IVA = 0.21;
				double preciofinal = prod*(1+IVA);
				
				System.out.println ("El precio final con IVA es: "+ preciofinal);
	}
}