package T9_Herencia;

import java.util.Random;

public class T9_6Peli {
	protected String titulo;
	protected int duración;
	protected int minEdad;
	protected String Director;

	// Constructor
	public T9_6Peli(String titulo, int duración, int minEdad, String director) {
		this.titulo = titulo;
		this.duración = duración;
		this.minEdad = minEdad;
		Director = director;
	}

	// Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuración() {
		return duración;
	}

	public void setDuración(int duración) {
		this.duración = duración;
	}

	public int getMinEdad() {
		return minEdad;
	}

	public void setMinEdad(int minEdad) {
		this.minEdad = minEdad;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

}
