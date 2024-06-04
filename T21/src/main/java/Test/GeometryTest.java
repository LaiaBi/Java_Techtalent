package Test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GeometryTest {
	
	private GeometryTest g;
	
	@Before
	public void setUp() throws Exception {
		g = new GeometryTest();
	}

	@Test
	public void testCuadrado() {
		int resultado = g.areaTrinagulo(6);
		int expected = 16;
		assertEquals(expected, resultado);
	}
	
	private int areaTrinagulo(int i) {
		return 0;
	}

	@Test
	public void testFigura() {
		String resultado = g.figura(8);
		String expected = "Rombo";
		assertEquals(expected, resultado);
	}
	
	private String figura(int i) {
		return null;
	}

	@Test
	public void testRectangulo() {
		int resultado = g.arearectangulo(11, 2);
		int expected = 50;
		assertEquals(expected, resultado);
	}

	private int arearectangulo(int i, int j) {
		return 0;
	}

}