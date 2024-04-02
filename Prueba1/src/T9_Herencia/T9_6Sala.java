package T9_Herencia;

public class T9_6Sala<Peli> {
	private Peli pelicula;
	private double precio;
	private int filas;
	private int columnas;
	private Peli peli;

	public T9_6Sala() {
		this.peli = new Peli();
		this.precio = 10;
		this.filas = 8;
		this.columnas = 8;
	}

	public T9_6Sala(Peli peli, double precio, int filas, int columnas) {
		this.peli = peli;
		this.precio = precio;
		this.filas = filas;
		this.columnas = columnas;
	}

	public Peli getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peli peli) {
		this.peli = peli;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + precio + ", filas=" + filas + ", columnas=" + columnas
				+ "]";
	}

}
}
