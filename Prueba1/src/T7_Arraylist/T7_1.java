package T7_Arraylist;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class T7_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        Map<String, Double> notasAlumnos = new HashMap<>();
        //Indicar las Key(alumnos)
        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + i + ": ");
            String nombreAlumno = scanner.next();
        //Indicar las Value(nota)
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = scanner.nextDouble();

        // Almacenar la nota en el HashMap
            notasAlumnos.put(nombreAlumno, nota);
        }

        double sumaNotas = 0;

        // Calcular la suma de las notas
        for (double nota : notasAlumnos.values()) {
            sumaNotas += nota;
        }

        double notaMedia = sumaNotas / cantidadAlumnos;

        System.out.println("La nota media de los " + cantidadAlumnos + " alumnos es: " + notaMedia);

        scanner.close();
    }
}