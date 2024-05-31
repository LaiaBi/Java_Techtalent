package Test;

import org.junit.Test;

import C4.T21.Geometry;

public class GeometryTest {

	public static void main(String[] args) {
	@Test
		   Geometry gm=new Geometry(2);
		   double areaCirc= gm.areaCirculo(2);
		   gm.setArea(areaCirc);    
		   System.out.println(gm);
	 @Test
		   Geometry gm1=new Geometry(3);
		   double areaTri= gm1.areatriangulo(3, 4);
		   gm1.setArea(areaTri);    
		   System.out.println(gm1);
	@Test
		   Geometry gm2=new Geometry(8);
		   double areaTrap= gm2.areatrapecio(8, 4, 5);
		   gm1.setArea(areaTri);    
		   System.out.println(gm1);

	}

}