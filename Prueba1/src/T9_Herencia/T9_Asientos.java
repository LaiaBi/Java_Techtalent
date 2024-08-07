package T9_Herencia;

public class T9_Asientos {
	private int fila;
	private char columna;
	private boolean ocupado;

	public T9_Asientos() {
		this.fila = 1;
		this.columna = 'A';
		this.ocupado = false;
	}

	public T9_Asientos(int fila, char columna, boolean ocupado) {
		this.fila = fila;
		this.columna = columna;
		this.ocupado = ocupado;
	}

	public int getfila() {
		return fila;
	}

	public void setfila(int fila) {
		this.fila = fila;
	}

	public char getcolumna() {
		return columna;
	}

	public void setcolumna(char columna) {
		this.columna = columna;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void ocuparAsiento() {
		this.ocupado = true;
	}

	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + "]";
	}

}
}
