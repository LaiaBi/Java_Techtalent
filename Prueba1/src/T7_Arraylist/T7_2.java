package T7_Arraylist;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class T7_2 {
	public static void main(String[] args) {
		//Ingresar cantidad que hay en el objeto inicial
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos de el carro: ");
        int cantidadProductos = scanner.nextInt();
        //calcular IVA 
        int precioProducto=20;
        System.out.println("El precio en bruto,  es "+(precioProducto));
		final double IVA= 0.21;System.out.println("El precio del producto, incluyendo el IVA, es "+(precioProducto+(precioProducto*IVA)));
		//
	}
}
