import java.util.Scanner;
public class Eje_5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Haz una aplicación que calcule el área de un circulo (pi*R2). 
		//El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
		//Usa la constante PI y elmétodo pow de Math.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Porfavor, introduce el radio del círculo: ");
		
		String introRADIO = sc.nextLine();
		
		sc.close();
		
		double radio = Double.parseDouble(introRADIO);
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El área del círculo con radio " + introRADIO + " es " + area );	
	}
}