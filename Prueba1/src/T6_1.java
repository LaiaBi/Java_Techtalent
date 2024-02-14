import java.util.Scanner;

public class T6_1 {

    	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Selección
        System.out.println("Seleccione la figura para calcular el área:");
        System.out.println("1. Triángulo");
        System.out.println("2. Círculo");
        System.out.println("3. Cuadrado");
        int opcion = scanner.nextInt();

        double area = 0.0;

        switch (opcion) {
            case 1:
                area = calcularAreaTriangulo();
                break;
            case 2:
                area = calcularAreaCirculo();
                break;
            case 3:
                area = calcularAreaCuadrado();
                break;
            default:
                System.out.println("Opción no válida.Elija:");
                return;
        }

        System.out.println("El área de la figura  es: " + area);
    }
    	 //Triangulo
    public static double calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        return (base * altura) / 2;
    }
    	//Circulo
    public static double calcularAreaCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        return Math.PI * Math.pow(radio, 2);
    }
    	//Cuadrado
    public static double calcularAreaCuadrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        return (lado * lado);
    }
}