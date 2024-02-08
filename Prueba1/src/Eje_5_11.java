import java.util.Scanner;
public class Eje_5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea una aplicación que nos pida un día de la semana y 
		//que nos diga si es un día laboral o no.
		Scanner sc = new Scanner(System.in);
		System.out.println("Porfavor, introduce un dia de la semana:");
		String dia = sc.nextLine();
		sc.close();
		switch (dia) {
		
		case "Lunes":
			System.out.println("Hoy es "+ dia + " y es un dia laboral.");
			break;
		case "Martes":
			System.out.println("Hoy es "+ dia + " y es un dia laboral");
			break;
		case "Miercoles":
			System.out.println("Hoy es "+ dia + " y es un dia laboral");
			break;
		case "Jueves":
			System.out.println("Hoy es "+ dia + " y es un dia laboral");
			break;
		case "Viernes":
			System.out.println("Hoy es "+ dia + " y es un dia laboral");
			break;
		case "Sabado":
			System.out.println("Hoy es "+ dia + " y no es un dia laboral");
			break;
		case "Domingo":
			System.out.println("Hoy es "+ dia + " y no es un dia laboral");
			break;
		default:
			System.out.println ("No has introducido un dia correcto");		
		}
	}
}