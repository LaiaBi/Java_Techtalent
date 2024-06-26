package T10;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinanum01 {
    private int numeroAdivinar;
    private int intentos;

    public Adivinanum01() {
        Random rand = new Random();
        this.numeroAdivinar = rand.nextInt(500) + 1;
        this.intentos = 0;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean adivinado = false;

        System.out.println("¿Quieres jugar a un juego?");
        System.out.println("Intenta adivinar el número entre 1 y 500.");

        while (!adivinado) {
            System.out.print("Introduce tu intento: ");
            try {
                int intento = scanner.nextInt();
                this.intentos++;

                if (intento < 1 || intento > 500) {
                    System.out.println("El número debe estar entre 1 y 500.");
                    continue;
                }

                if (intento < this.numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else if (intento > this.numeroAdivinar) {
                    System.out.println("El número a adivinar es menor.");
                } else {
                    adivinado = true;
                    System.out.println("¡Felicidades! ¡Has sobrevivido! " + this.numeroAdivinar + "!");
                    System.out.println("Número de intentos: " + this.intentos);
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo debes ingresar un número.");
                scanner.next(); 
            // Limpiar el buffer del scanner
                this.intentos++;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Adivinanum01 juego = new Adivinanum01();
        juego.jugar();
    }
}