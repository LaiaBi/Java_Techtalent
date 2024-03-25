package T9_Herencia;

public class T9_3Libro {
	// Atributos
	protected String Titulo;
	protected double ISBN;
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
		return ISBN;
	}

	public void setIsbn(double ISBN) {
		this.ISBN = ISBN;
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
		return "El libro con ISBN " + ISBN + " creado por " + autor + " tiene " + numeropaginas + " páginas.";
	}

}
