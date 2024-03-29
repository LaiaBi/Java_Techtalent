package T9_Herencia;
import java.util.Random;
public class T9_5Profesor {
	private String nombre;
    private int edad;
    private String sexo;
    private String materia;

    // Constructor
    public T9_5Profesor(String nombre, int edad, String sexo, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.materia = materia;
    }

    // Disponibilidad del profesor (20% no esta disponible)
    public boolean estaDisponible() {
        Random random = new Random();
        return random.nextDouble() > 0.2;
    }

    // Getter
    public String getMateria() {
        return materia;
    }
}
