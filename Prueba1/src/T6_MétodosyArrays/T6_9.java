package T6_MétodosyArrays;
import java.util.Scanner;
public class T6_9 {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Porfavor,da el tamaño de l'array: ");
	int size = scanner.nextInt();
	scanner.close();
	int array9 []=new int [size];
	
	for (int i=0; i<array9.lenght; i++) {
		array9[i]=(int)(Math.random()*10);
	}
	for (int i=0; i<array9.lenght; i++) {
		System.out.print( array9[i]+",");
		}
	 
}

}