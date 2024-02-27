package T7_Arraylist;

import java.util.HashMap;

public class Prueba1 {
	public static void main(String[] args) {
	
	// Crear un HashMap con clave de tipo String y valor de tipo Integer
        HashMap<String, Integer> edadesAlumnos = new HashMap<>();
   
    // Agregar elementos al HashMap
        edadesAlumnos.put("Lupita", 34);
        edadesAlumnos.put("Eduardo", 23);
        edadesAlumnos.put("Juan", 20);
        edadesAlumnos.put("Victoria", 40);
        
    // Iterar sobre las claves del HashMap
        System.out.println("Claves en el edadesAlumnos:");
        for (String nombre : edadesAlumnos.keySet()) {
            System.out.println(nombre);
        }

    // Iterar sobre los valores del HashMap
        System.out.println("Valores en el edadesAlumnos:");
        for (int edad : edadesAlumnos.values()) {
            System.out.println(edad);
        }

    // Ingresar dos alumnos
        edadesAlumnos.put("Fatima", 18);
        edadesAlumnos.put("Adam", 22);
        
        System.out.println("Claves en el edadesAlumnos:");
        for (String nombre : edadesAlumnos.keySet()) {
            System.out.println(nombre);

        }
        System.out.println("Valores en el edadesAlumnos:");
        for (int edad : edadesAlumnos.values()) {
            System.out.println(edad);
        }
	}
}
