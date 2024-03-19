package T8_POO;

public class T8_1_Persona {
	// Atributos
	private String nombre;
	private int edad;
	private char genero;
	protected String dni;
	private double peso;
	private double altura;

	// Constructor base
	public T8_1_Persona() {
		this.nombre = "";
		this.edad = 0;
		this.genero = 'H';
		dni = "67452843O";
		this.peso = 0;
		this.altura = 0;
	}

	// Constructor con 3 atributos
	public T8_1_Persona(String nombre, int edad, char genero) {
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	// Constructor al completo
	public T8_1_Persona(String nombre, int edad, char genero, String dNI, double peso, double altura, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		dni = dni;
		this.peso = peso;
		this.altura = altura;
	}
	// Getters y setters

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

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
