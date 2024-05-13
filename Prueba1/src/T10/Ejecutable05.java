package T10;
import java.util.Scanner;

public class Ejecutable05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, longitud = 0;
		boolean error = true;
		while (error) {
			try {
				System.out.print("Tamaño de la array: ");
				n = sc.nextInt();
				System.out.print("Longitud de las contraseñas: ");
				longitud = sc.nextInt();
				Password05[] passwords = new Password05[n];
				boolean[] esfuerte = new boolean[n];

				for (int i = 0; i < passwords.length; i++) {
					passwords[i] = new Password05(longitud);
					esfuerte[i] = passwords[i].esFuerte();
					System.out.println(passwords[i].getPass() + " " + esfuerte[i]);
				}
				error = false;
			} catch (Exception e) {
				System.out.println("Error de input. Debes introducir números.");
				sc.next();
			}
		}

		sc.close();
	}

}