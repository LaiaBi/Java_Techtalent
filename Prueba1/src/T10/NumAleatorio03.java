package T10;
import java.util.Random;

public class NumAleatorio03 {
	//bases del generador
    public static void main(String[] args) {
        int cantidadNumeros = 10;
        int minimo = 1;
        int maximo = 999;

        int[] numerosAleatorios = generarNumerosAleatorios(cantidadNumeros, minimo, maximo);
     //escritos(resultado)
        System.out.println("Números aleatorios generados y su paridad:");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " es ");
            if (esPar(numero)) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }
    }
    	//comando
    public static int[] generarNumerosAleatorios(int cantidad, int minimo, int maximo) {
        int[] numerosAleatorios = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            numerosAleatorios[i] = random.nextInt(maximo - minimo + 1) + minimo;
        }
        //Resultado
        return numerosAleatorios;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
