package T7_Arraylist;
import java.util.HashMap;
public class T7_1 {
	public static void main(String[] args) {
	// Crear un HashMap con clave de tipo String y valor de tipo Integer
        HashMap<String, Integer> notasAlumnos = new HashMap<>();
   
    // Agregar elementos al HashMap
        notasAlumnos.put("Lupita", 3,4,5,8);
        notasAlumnos.put("Eduardo", 6,7,8,9);
        notasAlumnos.put("Juan", 10,8,6,9);
        notasAlumnos.put("Victoria", 5,7,8,6);
	}
	// Iterar sobre las claves del HashMap
    System.out.println("Claves en el notasAlumnos:");
    for (String nombre : notasAlumnos.keySet()) {
        System.out.println(nombre);
    }
    // Iterar sobre los valores del HashMap
    System.out.println("Valores en el notasAlumnos:");
    for (int notas : notasAlumnos.values()) {
        System.out.println(notas);
    }
}
