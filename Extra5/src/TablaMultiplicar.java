public class TablaMultiplicar {

    public static void main(String[] args) {
        // Número para la tabla de multiplicar;
        int numero = 5;

        System.out.println("Tabla de multiplicar del " + numero + ":");

        // Imprimir la tabla de multiplicar del 5 desde 0 hasta 10;
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}