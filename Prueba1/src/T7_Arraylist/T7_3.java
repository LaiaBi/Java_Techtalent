package T7_Arraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import javax.swing.*;

public class T7_3 {

	public static void main(String[] args) {
		////10 ARTICULOS////
	        // Creamos una instancia de la clase que maneja la base de datos
	        BaseDeDatosArticulos baseDeDatos = new BaseDeDatosArticulos();

	        // Creamos diez artículos de ejemplo
	        for (int i = 1; i <= 10; i++) {
	            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del artículo " + i + ":");
	            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo " + i + ":"));
	            Articulo articulo = new Articulo(nombre, precio);
	            baseDeDatos.agregarArticulo(articulo);
	        }

	        // Mostramos la información almacenada
	        baseDeDatos.mostrarInformacion();
	    }
	}

	// Clase para manejar la base de datos de artículos
	class BaseDeDatosArticulos {
	    private java.util.List<Articulo> listaArticulos = new java.util.ArrayList<>();

	    // Método para agregar un nuevo artículo a la base de datos
	    public void agregarArticulo(Articulo articulo) {
	        listaArticulos.add(articulo);
	    }

	    // Método para mostrar la información almacenada
	    public void mostrarInformacion() {
	        if (listaArticulos.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "La base de datos está vacía.");
	        } else {
	            StringBuilder mensaje = new StringBuilder("Información almacenada:\n");
	            for (Articulo articulo : listaArticulos) {
	                mensaje.append("Nombre: ").append(articulo.getNombre()).append(", Precio: ").append(articulo.getPrecio()).append("\n");
	            }
	            JOptionPane.showMessageDialog(null, mensaje.toString());
	        }
	    }
	}

	// Clase para representar un artículo
	class Articulo {
	    private String Producto;
	    private double cobro;

	    public Articulo(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    // Getters y setters
	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }
		//// AÑADIR ARTICULOS CON INTERFAZ///
		// Creamos una instancia de la clase que maneja la base de datos
		BaseDeDatosArticulos baseDeDatos = new BaseDeDatosArticulos();

		// Interfaz para ingresar un nuevo artículo
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del artículo:");
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

		// Creamos un objeto Articulo con la información ingresada
		Articulo nuevoArticulo = new Articulo(nombre, precio);

		// Agregamos el nuevo artículo a la base de datos
		baseDeDatos.agregarArticulo(nuevoArticulo);{

		// Mostramos un mensaje indicando que el artículo se ha agregado
		JOptionPane.showMessageDialog(null, "Artículo agregado correctamente.");
	}

// Clase para representar un artículo
class Articulo {
	private String nombre;
	private double precio;

	public Articulo(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	// Getters y setters (puedes generarlos automáticamente en algunos IDE)
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
}

// Clase para manejar la base de datos de artículos
class BaseDeDatosArticulos {
	// Aquí podrías tener una lista, base de datos real, etc.
	// Usaremos una lista simple.
	private java.util.List<Articulo> listaArticulos = new java.util.ArrayList<>();

	// Método para agregar un nuevo artículo a la base de datos
	public void agregarArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
	}
////INFORMACIÓN DEL ALMACEN////
	// Creamos una instancia de la clase que maneja la base de datos
    BaseDeDatosArticulos baseDeDatos = new BaseDeDatosArticulos();

    // Interfaz para ingresar un nuevo artículo
    String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer artículo:");
    double precio1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del primer artículo:"));
    Articulo articulo1 = new Articulo(nombre1, precio1);
    baseDeDatos.agregarArticulo(articulo1);

    // Agregamos más artículos para demostrar la funcionalidad
    String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo artículo:");
    double precio2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del segundo artículo:"));
    Articulo articulo2 = new Articulo(nombre2, precio2);
    baseDeDatos.agregarArticulo(articulo2);

    // Mostramos la información almacenada
    baseDeDatos.mostrarInformacion();
}

//Clase para manejar la base de datos de artículos
class BaseDeDatosArticulos {
	private java.util.List<Articulo> listaArticulos = new java.util.ArrayList<>();

// Método para agregar un nuevo artículo a la base de datos
	public void agregarArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
	}

// Método para mostrar la información almacenada
	public void mostrarInformacion() {
		if (listaArticulos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "La base de datos está vacía.");
		} else {
			StringBuilder mensaje = new StringBuilder("Información almacenada:\n");
			for (Articulo articulo : listaArticulos) {
				mensaje.append("Nombre: ").append(articulo.getNombre()).append(", Precio: ")
						.append(articulo.getPrecio()).append("\n");
			}
			JOptionPane.showMessageDialog(null, mensaje.toString());
		}
	}
}

//Clase para representar un artículo
class Articulo {
	private String nombre;
	private double precio;

	public Articulo(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
}
