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
}
