package T9_Herencia;

import java.util.Random;

public class T9_6Espectador {
	protected String nombre;
	protected int edad;
	protected int dinero;

	// Constructor
	public T9_6Espectador(String nombre, int edad, int dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

}
