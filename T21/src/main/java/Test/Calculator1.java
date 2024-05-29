package Test;

import java.util.ArrayList;

public class Calculator1;

public static void main(String[] args) {
	
	   //Creacion de Objeto Circulo
	   Calculator1 gm=new Calculator1();
	   double areaCirc= gm.areaCirculo();
	   gm.setArea(areaCirc);    
	   System.out.println(gm);
	 //Creacion de Objeto Triangulo
	   Calculator1 gm1=new Calculator1();
	   double areaTri= gm1.areatriangulo(3, 4);
	   gm1.setArea(areaTri);    
	   System.out.println(gm1);
	 //Creacion de Objeto Rectangulo
	   Calculator1 gm2=new Calculator1();
	   double areaTrap= gm2.areatrapecio(8, 4, 5);
	   gm2.setsuma(areaTri);    
	   System.out.println(gm1);

}

}