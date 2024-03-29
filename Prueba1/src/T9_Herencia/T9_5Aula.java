package T9_Herencia;

public class T9_5Aula {
	 private int id;
	    private int capacidadMaxima;
	    private String asignatura;
	    private T9_5Profesor profesor;
	    private T9_5Estudiante[] estudiantes;
	    private int numEstudiantes;

	    // Constructor
	    public T9_5Aula(int id, int capacidadMaxima, String asignatura, T9_5Profesor profesor) {
	        this.id = id;
	        this.capacidadMaxima = capacidadMaxima;
	        this.asignatura = asignatura;
	        this.profesor = profesor;
	        this.estudiantes = new T9_5Estudiante[capacidadMaxima];
	        this.numEstudiantes = 0;
	    }

	    // Añadir un estudiante al aula
	    public void agregarEstudiante(T9_5Estudiante estudiante) {
	        if (numEstudiantes < capacidadMaxima) {
	            estudiantes[numEstudiantes++] = estudiante;
	        } else {
	            System.out.println("No hay mas espacio...");
	        }
	    }

	    // Se puede dar clase en el aula
	    public boolean puedeDarClase() {
	        // Verificar disponibilidad del profesor
	        if (!profesor.estaDisponible()) {
	            return false;
	        }

	        // Verificar si el profesor da la asignatura adecuada
	        if (!profesor.getMateria().equalsIgnoreCase(asignatura)) {
	            return false;
	        }

	        // Verificar si hay más del 50% de estudiantes
	        int numAsistentes = 0;
	        for (T9_5Estudiante estudiante : estudiantes) {
	            if (estudiante != null && !estudiante.haceNovillos()) {
	                numAsistentes++;
	            }
	        }
	        return numAsistentes > (capacidadMaxima / 2);
	    }

	    // Estudiantes aprobados
	    public void contarEstudiantesAprobados() {
	        int numAprobadosHombres = 0;
	        int numAprobadasMujeres = 0;

	        for (T9_5Estudiante estudiante : estudiantes) {
	            if (estudiante != null && estudiante.getCalificacion() >= 5) {
	                if (estudiante.getSexo().equalsIgnoreCase("masculino")) {
	                    numAprobadosHombres++;
	                } else if (estudiante.getSexo().equalsIgnoreCase("femenino")) {
	                    numAprobadasMujeres++;
	                }
	            }
	        }

	        System.out.println("Estudiantes aprobados:");
	        System.out.println("Hombres: " + numAprobadosHombres);
	        System.out.println("Mujeres: " + numAprobadasMujeres);
	    }
}
