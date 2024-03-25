package T9_Herencia;

import java.util.Scanner;

public class T9_3MainLibro {
	// dos libros diferentes
	public static void main(String[] args) {

		Libro libroA = new Libro("9788401337208", "El nombre del viento", "Patrick Rothfuss", 880);
		Libro libroB = new Libro("9780375869020", "Wonder", "Palacio, R. J.", 300);

		System.out.println("---------------------------------");
		System.out.println("··Primer libro··");
		System.out.println(libroA.toString());

		System.out.println("----------------------------------");
		System.out.println("··Segundo libro··");
		System.out.println(libroB.toString());
		// Comparación de cantidad de páginas
		String libroConMasPaginas = (libroA.getNumPag() > libroB.getNumPag()) ? libroA.getTitulo()
				: (libroA.getNumPag() < libroB.getNumPag()) ? libroB.getTitulo()
						: "Los dos libros tienen el mismo número de página!";

		System.out.println("------------------------------------");
		System.out.println("··El libro con más páginas··");
		System.out.println(libroConMasPaginas);
	}
}
