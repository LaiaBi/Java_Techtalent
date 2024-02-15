package T6_MétodosyArrays;
import java.util.Scanner;
public class T6_sorteo {
	
	Scanner scanner = new Scanner(System.in);
    String[] participantes = new String[3];{
 
    	//Introducir nombres
    	for (int i = 0; i < 3; i++) {
            System.out.print("Introduzca el nombre aquí " + (i + 1) + ": ");
            participantes[i] = scanner.nextLine();
        }
	}
    	//Seleccion de nombre
    System.out.println("\nLos seleccionados:"));
    for (String participante : participantes) {
        System.out.println("- " + participante);
    }
    	// Sorteo
        int indiceGanador = (int) (Math.random() * participantes.length);
        String ganador = participantes[indiceGanador];
        System.out.println("\n¡Enorabuena: " + ganador + "!");
    }
}