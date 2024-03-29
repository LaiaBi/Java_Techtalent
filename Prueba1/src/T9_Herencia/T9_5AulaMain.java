package T9_Herencia;

public class T9_5AulaMain {
	public static void main(String[] args) {
        // Crear profesor y estudiantes
    	T9_5Profesor profesor = new T9_5Profesor("Profesor1", 35, "masculino", "matemáticas");
    	T9_5Estudiante estudiante1 = new T9_5Estudiante("Estudiante1", 20, "masculino", 9);
    	T9_5Estudiante estudiante2 = new T9_5Estudiante("Estudiante2", 21, "femenino", 7);
    	T9_5Estudiante estudiante3 = new T9_5Estudiante("Estudiante3", 11, "masculino", 6);

        // Aula
    	T9_5Aula aula = new T9_5Aula(2, 20, "matemáticas", profesor);

        // Agregar estudiantes 
        aula.agregarEstudiante(estudiante1);
        aula.agregarEstudiante(estudiante2);
        aula.agregarEstudiante(estudiante3);

        // Ver si puede dar clase
        if (aula.puedeDarClase()) {
            System.out.println("Se puede dar clase.");
            // Contar estudiantes aprobados
            aula.contarEstudiantesAprobados();
        } else {
            System.out.println("No se puede dar clase.");
        }
    }
}
