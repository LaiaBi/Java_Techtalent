package T8_POO;

import java.security.SecureRandom;

public class T8_2_Password {
	private static final String ALLOWED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:',.<>?";
	// Atributos
	private String contraseña;
	private int longitud;

	// Constructores
	public T8_2_Password() {
		this.contraseña = "";
		this.longitud = 0;
	}

	public T8_2_Password(String contraseña, int longitud) {
		super();
		this.contraseña = contraseña;
		this.longitud = longitud;
	}

//Contraseña aleatoria
	public static void main(String[] args) {
		String password = generateRandomPassword(8);
		System.out.println("Password: " + password);
	}

	public static String generateRandomPassword(int length) {
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(ALLOWED_CHARACTERS.length());
			sb.append(ALLOWED_CHARACTERS.charAt(randomIndex));
		}
		return sb.toString();
	}
	// Getters y setters

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}