package T9_Herencia;

public class T9_2Videojuego {
	// Atributos
	protected String Titulo;
	protected double HorasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;

	// Defecto
	public T9_2Videojuego() {
		Titulo = "";
		HorasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	// Titulo y horas emitidas, demas defecto
	public T9_2Videojuego(String titulo, double horasEstimadas) {
		Titulo = titulo;
		HorasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	// Todo menos entregado
	public T9_2Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
		Titulo = titulo;
		HorasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compañia = compañia;
	}

	// Getters y setters excepto entregado
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public double getHorasEstimadas() {
		return HorasEstimadas;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		HorasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "T9_2Videojuego [Titulo=" + Titulo + ", HorasEstimadas=" + HorasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

}
