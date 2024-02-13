import java.util.Scanner;

public class Extra05_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cadena 
        System.out.println("Ingrese una cadena:");
        String input = scanner.nextLine();

        // Encontrar el índice de la segunda y tercera ocurrencia del carácter 'a'
        int segundaOcurrencia = encontrarIndiceOcurrencia(input, 'a', 2);
        int terceraOcurrencia = encontrarIndiceOcurrencia(input, 'a', 3);

        // Mostrar los resultados
        System.out.println("Índice de la segunda ocurrencia de 'a': " + segundaOcurrencia);
        System.out.println("Índice de la tercera ocurrencia de 'a': " + terceraOcurrencia);

        scanner.close();
    }

    // Método para encontrar el índice de la ocurrencia de un carácter en una cadena
    private static int encontrarIndiceOcurrencia(String str, char caracter, int n) {
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == caracter) {
                contador++;
                if (contador == n) {
                    return i;
                }
            }
        }
        // Si no se encuentra la ocurrencia, devolver -1
        return -1;
    }
}