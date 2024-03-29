package T9_Herencia;

import java.util.Scanner;

public class T9_3MainLibro {
	// dos libros diferentes
	public static void main(String[] args) {

		T9_3Libro libroA = new T9_3Libro("9788401337208", "El nombre del viento", "Patrick Rothfuss", 880);
		T9_3Libro libroB = new T9_3Libro("9780375869020", "Wonder", "Palacio, R. J.", 300);

		System.out.println("-------------------");
		System.out.println("Libro 1");
		System.out.println(libroA.toString());

		System.out.println("------------------");
		System.out.println("Libro 2");
		System.out.println(libroB.toString());
	}

	// Comparación de cantidad de páginas
	public static T9_3Libro libroConMasPaginas(T9_3Libro libro1, T9_3Libro libro2) {
		if (libro1.getNumeropaginas() > libro2.getNumeropaginas()) {
			return libro1;
		} else if (libro1.getNumeropaginas() < libro2.getNumeropaginas()) {
			return libro2;
		} else {
			return null;
		}
	}
}
