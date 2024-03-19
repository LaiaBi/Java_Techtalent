package T8_POO;

public class T8_4_Serie {
	// Atributos
	private String Titulo;
	private double NumTemporada;
	private boolean entregado;
	private String genero;
	private String creador;

	// defecto
	public T8_4_Serie(double numTemporada, boolean entregado) {
		Titulo = "";
		NumTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	// Dos atributos
	public T8_4_Serie(String titulo, double numTemporada, boolean entregado, String creador) {
		Titulo = titulo;
		NumTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	// Todos los atributos menos entregado
	public T8_4_Serie(String titulo, double numTemporada, String genero, String creador) {
		Titulo = titulo;
		NumTemporada = numTemporada;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	// Getters y setters
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public double getNumTemporada() {
		return NumTemporada;
	}

	public void setNumTemporada(double numTemporada) {
		NumTemporada = numTemporada;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

}