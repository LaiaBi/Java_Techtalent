package T9_Herencia;

public class T9_4RaicesMain {
	public static void main(String[] args) {
		// Ejemplo
		T9_4Raices ecuacion = new T9_4Raices(6, -9, 12);
        System.out.println("Discriminante: " + ecuacion.getDiscriminante());
        System.out.println("¿Tiene raíces? " + ecuacion.tieneRaices());
        System.out.println("¿Tiene raíz única? " + ecuacion.tieneRaiz());
        ecuacion.calcular();
        ecuacion.obtenerRaices();
        ecuacion.obtenerRaiz();
	}

}
