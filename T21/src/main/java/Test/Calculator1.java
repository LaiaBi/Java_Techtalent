package Test;

import java.util.ArrayList;

public class Calculator1;

public static void main(String[] args) {
	
	   //Creacion de Objeto Circulo
	   Geometry gm=new Geometry(2);
	   double areaCirc= gm.areaCirculo(2);
	   gm.setArea(areaCirc);    
	   System.out.println(gm);
	 //Creacion de Objeto Triangulo
	   Geometry gm1=new Geometry(3);
	   double areaTri= gm1.areatriangulo(3, 4);
	   gm1.setArea(areaTri);    
	   System.out.println(gm1);
	 //Creacion de Objeto Rectangulo
	   Geometry gm2=new Geometry(8);
	   double areaTrap= gm2.areatrapecio(8, 4, 5);
	   gm1.setArea(areaTri);    
	   System.out.println(gm1);

}

}