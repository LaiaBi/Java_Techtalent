package T9_Herencia;

public class T9_1_Elecrtrodomestico1 {
	// Atributos
	protected double preciobase;
	protected String color;
	protected char consumenergetico;
	protected double peso;
	public static final char[] LETRAS_CONSUMO = { 'A', 'B', 'C', 'D', 'E', 'F' };
	public static final String[] COLORES = { "blanco", "negro", "rojo", "azul", "gris" };

	// Por defecto
	public T9_1_Elecrtrodomestico1() {
		this.preciobase = 100;
		this.color = "Blanco";
		this.consumenergetico = 'F';
		this.peso = 5;

	}

	// Precio y peso.Lo demas defecto
	public void T9_1_Elecrtrodomestico(double preciobase, double peso) {
		this.preciobase = preciobase;
		this.color = "Blanco";
		this.consumenergetico = 'F';
		this.peso = peso;
	}

	// Todo
	public void T9_1_Elecrtrodomestico11(double preciobase, String color, char consumenergetico, double peso) {
		this.preciobase = preciobase;
		if (!color.equalsIgnoreCase("Blanco") && !color.equalsIgnoreCase("Negro") && !color.equalsIgnoreCase("Rojo")
				&& !color.equalsIgnoreCase("Azul") && !color.equalsIgnoreCase("Gris")) {
		} else {
			this.color = color;
		}
		if (!color.equalsIgnoreCase("Blanco") && !color.equalsIgnoreCase("Negro") && !color.equalsIgnoreCase("Rojo")
				&& !color.equalsIgnoreCase("Azul") && !color.equalsIgnoreCase("Gris")) {
		} else {
			this.color = color;
		}
		this.consumenergetico = consumenergetico;
		this.peso = peso;
	}

	// Getters y setters
	public double getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(double preciobase) {
		this.preciobase = preciobase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumenergetico() {
		return (char) consumenergetico;
	}

	public void setConsumenergetico(char consumenergetico) {
		this.consumenergetico = consumenergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Comprobar el consumo
	private boolean comprobarconsumenergetico(char letra) {
		for (int i = 0; i < LETRAS_CONSUMO.length; i++) {
			if (letra == LETRAS_CONSUMO[i]) {
				return true;
			}
		}
		return false;
	}

	// Comprobar color
	private boolean comprobarColor(String color) {
		for (int i = 0; i < COLORES.length; i++) {
			if (color.equalsIgnoreCase(COLORES[i])) {
				return true;
			}
		}
		return false;
	}

	// Calculo precio final
	public double precioFinal() {
		double precioFinal = preciobase;

		switch (consumenergetico) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 10;
			break;
		}

		if (peso >= 0 && peso < 19) {
			precioFinal += 10;
		} else if (peso >= 20 && peso < 49) {
			precioFinal += 50;
		} else if (peso >= 50 && peso < 79) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}
		return precioFinal;
	}

}
