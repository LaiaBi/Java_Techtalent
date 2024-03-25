package T9_Herencia;

public class T9_3Libro {
	// Atributos
	protected String Titulo;
	protected double isbn;
	protected double numeropaginas;
	protected String autor;

	// Getters y setters de cada atributo
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public double getIsbn() {
		return isbn;
	}

	public void setIsbn(double isbn) {
		this.isbn = isbn;
	}

	public double getNumeropaginas() {
		return numeropaginas;
	}

	public void setNumeropaginas(double numeropaginas) {
		this.numeropaginas = numeropaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "T9_3Libro [isbn=" + isbn + "]";
	}
	

}
