public class Test2{
	public static void main (String args[]){
		//Creación de un objeto Integer usando el segundo constructor
		Integer num1=new Integer("125");
		//Creación de un objeto Integer usando el primer constructor
		Integer num2=new Integer("20");
		
		//Obtención del entero que almacena cada objeto Integer.
		//Si no se hace esto, las líneas siguientes causarían error
		//de complicación
		int n1=num1.invalue();
		int n2=num2.invalue();
		System.out.println ("Suma de "+n1+" y "+n2" vale "+(n1+n2));
		if (n1+n2>130) n1++;
		else n1--;
		System.out.println(n1);
	}
}