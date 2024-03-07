package T8_POO;

import javax.swing.Spring;

public class Frutas {
	// Atributos
	Spring nombre;
	Spring color;
	double precio;

	// Constructores
public Frutas () {
	this.nombre="";
	this.color="";
	this.precio=0,0
	}

public Frutas (String param1) {
	this.nombre=param1;
	this.color="";
	this.precio=0,0
	}

public Frutas (String param1, double param2) {
	this.nombre=param1;
	this.color=param2;
	this.precio=0,0
	}

public Frutas (String param1, sting param2, double param3) {
	this.nombre=param1;
	this.color=param2;
	this.precio=param3
	}
	// Métodos

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frutas manzana= new Frutas();
Frutas platano= new Frutas("platano");
Frutas arandano= new Frutas("arandanos","lila");
Frutas albaricoque= new Frutas("albaricoque","naranja", 10.15);
System.out.print("Mi primera manzana, tiene un color igual y con un precio);
                            ]
	}

}
