package Apuntes;
public class Vol1 {
	import java.util.Enumeration;
	import java.util.Iterator;

	package 0;
	public class escritos {
	int num [] = new int [10];
	for (int i=0, multiplo=5; i<num.length;i++, multiplo+=5) {
		num[i]= multiplo;
		System.out.println(num[i]);
	}
	//ADD
	lista.add(1);
	lista.add(2);
	lista.add(3);
	System.out.println("ADD");
	System.out.println(lista.toString());
	//REMOVE
	lista.remove(2);
	System.out.println("REMOVE");
	System.out.println(lista.toString());
	//SIZE
	System.out.println("SIZE");
	System.out.println(lista.size());
	//GET
	System.out.println("GET");
	System.out.println(lista.get(0));
	//ITERATOR
	System.out.println("ITERATOR");
	Iterator<Integer> it = lista.iterator ();
	int num;
	while (it.hasNext()) {
		num = it.next();
		System.out.println(num);
	}
	//INDEXOF
	System.out.println("INDEXOF");
	System.out.println(lista.indexOf(1));
	//CLEAR
	lista.clear();
	System.out.println("CLEAR");
	System.out.println(lista.toString());
	while (enumeration.hasMoreElements()) {
		System.out.println(""+"hastable valores: " + Enumeration.nextElement());
	}
	---
	Enumeration<String> llaves = contenedor.Key();
	while (llaves.hasMoreElements()) {
		System.out.println(""+"hastable llaves: " + llaves.nextElement());
		}
	}
}
//pag.5 tema8
public class Empleado{
	private String nombre;
	private String apellido;
	private String edad;
	private String salario;
}
//pag.6 tema8
public boolean plus (double sueldoPlus) {
	boolean aumento = false;
	if (edad>40); {
	salario+=sueldoPlus;
	aumento=true;
	}
	return aumento;
	}
}