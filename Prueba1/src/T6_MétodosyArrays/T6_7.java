package T6_MétodosyArrays;
import java.util.Scanner;

public class T6_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de €");
        double euro = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Indica la moneda a la que deseas hacer el cambio: (Dolar, Yen o Libra)");
        String moneda = sc1.next(); // Cambiado de sc.nextLine() a sc.next()

        double qConvertida = conversor(euro, moneda);

        System.out.println("La cantidad " + euro + " convertida a " + moneda + " es: " + qConvertida);

        sc.close();
    }
    public static double conversor(double q, String m) {
        double monedas = 0;

        switch (m.toLowerCase()) {

            case "dolar":
                monedas = q * 1.28611;
                break;

            case "yen":
                monedas = q * 129.852;
                break;

            case "libra":
                monedas = q * 0.86;
                break;
                
            default:
                System.out.println("Moneda introducida no válida");
        }
        return monedas;
    }
}