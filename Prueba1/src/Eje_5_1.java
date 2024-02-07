public class Eje_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarar variable
		int variableA;
		int variableB;
		//asignar numero
			variableA=5;
			System.out.println(variableA);
			variableB=7;
			System.out.println(variableB);
		//comparaciones
			if (variableA == variableB); {
				System.out.println ("¿"+variableA+" es igual a "+variableB+"? ");
				System.out.println (variableA==variableB); //¿variableA es igual 
				//a variableB? resultado=false;
		} 
			if (variableA>variableB);{
				System.out.println ("¿"+variableA+" es más grande a "+variableB+"? ");
				System.out.println (variableA>variableB); //¿variableA es más grande 
				//a variableB? resultado=false;
		}
			//Modificacciones
			int temporal = variableA;
				variableA = variableB;
				System.out.println("Después de alternar: variableA = " + variableA + ", "
						+ "variableB = " + variableB);
	}

}
