package T9_Herencia;

public class T9_2Serie implements T9_2Entregable {
	private final int temporadas_default = 3;
	private boolean entrega_default = false;
	// Atributos
	protected String Titulo;
	protected double NumTemporada;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	// Defecto
	public T9_2Serie() {
		Titulo = "";
		NumTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	// Título y creador, demas defecto

	public T9_2Serie(String titulo, String creador) {
		Titulo = titulo;
		NumTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	// Todo menos entregado
	public T9_2Serie(String titulo, double numTemporada, String genero, String creador) {
		Titulo = titulo;
		NumTemporada = numTemporada;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	// Getters y setters menos en el atributo entregado
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
	// Sobrescribir los valores de los atributos utilizando el método toString

	@Override
	public String toString() {
		return "T9_2Serie [Titulo=" + Titulo + ", NumTemporada=" + NumTemporada + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

	// si esta enviado o no las temporadas
	public void entregar() {
		this.entregado = true;
	}

	public void devolver() {
		this.entregado = false;
	}

	public boolean isEntregado() {
		return entregado;
	}

	// comparar temporadas
	public boolean compareTo(Object a) {
		if (a instanceof T9_2Serie) {
			T9_2Serie otra_Serie = (T9_2Serie) a;
			return this.getNumTemporada() > otra_Serie.getNumTemporada();
		} else {
			if (a instanceof T9_2Videojuego) {
				T9_2Videojuego otroJuego = (T9_2Videojuego) a;
				return false;
			} else {
				throw new IllegalArgumentException("No se puede comparar con lo desconocido");
			}
		}
	}
}
