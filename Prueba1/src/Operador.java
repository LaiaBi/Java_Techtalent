public class Operador {
			public static void main(String[] args) {	
				int x=0;
				Operador++; //Operador=11
				Operador++; //Operador=12
				Operador--; //Operador=11
				
				x=Operador++; //x=11, Operador=12
				x=++Operador; //x=13, Operador=13
			}
}
