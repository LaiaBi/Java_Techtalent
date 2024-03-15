package T8_POO;

public class T8_4_Serie {
	// Atributos
	private String Titulo;
	private double NumTemporada;
	private char entregado;
	private String genero;
	private String creador;

	// defecto
	public T8_4_Serie() {
		Titulo = "";
		NumTemporada = 3;
		this.entregado = 'false';
		this.genero = "";
		this.creador = "";
	}
	//Dos atributos
	public T8_4_Serie(String titulo, String creador) {
		Titulo = titulo;
		NumTemporada = 3;
		this.entregado = 'false';
		this.genero = "";
		this.creador = creador;
	}
	//Todos los atributos menos entregado
	public T8_4_Serie(String titulo, double numTemporada, String genero, String creador) {
		Titulo = titulo;
		NumTemporada = numTemporada;
		this.entregado = 'false';
		this.genero = genero;
		this.creador = creador;
	}
	
}
