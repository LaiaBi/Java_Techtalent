package T8_POO;

public class T8_3_Electrodomestico1 {
	// Atributos
	protected double preciobase;
	protected String color;
	protected char consumenergetico;
	protected double peso;

	// Por defecto
	public T8_3_Electrodomestico1() {
		this.preciobase = 100;
		this.color = "blanco";
		this.consumenergetico = 'F';
		this.peso = 5;
	}

	// Dos valores
	public T8_3_Electrodomestico1(double preciobase, double peso) {
		this.preciobase = preciobase;
		this.color = "blanco";
		this.consumenergetico = 'F';
		this.peso = peso;
	}
	//Todo
	public void T8_3_Electrodomestico(double preciobase, String color, char consumenergetico, double peso) {
		this.preciobase = preciobase;
		if (!color.equalsIgnoreCase("Blanco")&&!color.equalsIgnoreCase("Negro")&&!color.equalsIgnoreCase("Rojo")
				&&!color.equalsIgnoreCase("Azul")&&!color.equalsIgnoreCase("Gris")) {
			this.color = "blanco";
		}
		else {
			this.color=color;
		}
		this.consumenergetico = consumenergetico;
		this.peso = peso;
	}
}
