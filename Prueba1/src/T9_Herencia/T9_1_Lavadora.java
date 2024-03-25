package T9_Herencia;

public class T9_1_Lavadora extends T9_1_Elecrtrodomestico1 {
	// Atributos
	protected double carga;
	protected final static double CARGA_PRED = 5;

	// Por defecto
	public T9_1_Lavadora() {
		super();
		this.preciobase = preciobase;
		this.color = color;
		this.consumenergetico = consumenergetico;
		this.peso = peso;
	}

	// Precio base y peso
	public T9_1_Lavadora(double precioBase, double peso) {
		super();
		this.carga = CARGA_PRED;
	}

	// Precio base, color, consumo energetico, peso y carga
	public T9_1_Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super();
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	// Precio final
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}

}
