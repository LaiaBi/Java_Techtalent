package T9_Herencia;

public class T9_1_Elecrtrodomestico1 {
	// Atributos
		protected double preciobase;
		protected String color;
		protected char consumenergetico;
		protected double peso;
		
		//Por defecto
		public T9_1_Elecrtrodomestico1(double preciobase, String color, char consumenergetico, double peso) {
			this.preciobase = 100;
			this.color = "Blanco";
			this.consumenergetico = 'F';
			this.peso = 5;
			
		}
		//Precio y peso.Lo demas defecto
		public void T9_1_Elecrtrodomestico(double preciobase, String color, char consumenergetico, double peso) {
			this.preciobase = preciobase;
			this.color = "Blanco";
			this.consumenergetico = 'F';
			this.peso = peso;
		}
		//Todo
		public void T9_1_Elecrtrodomestico11(double preciobase, String color, char consumenergetico, double peso) {
			this.preciobase = preciobase;
			if (!color.equalsIgnoreCase("Blanco") && !color.equalsIgnoreCase("Negro") && !color.equalsIgnoreCase("Rojo")
					&& !color.equalsIgnoreCase("Azul") && !color.equalsIgnoreCase("Gris")) {
			} else {
				this.color = color;
			}
			this.consumenergetico = consumenergetico;
			this.peso = peso;
		}
		//Getters y setters
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
			return consumenergetico;
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
		
		
}
