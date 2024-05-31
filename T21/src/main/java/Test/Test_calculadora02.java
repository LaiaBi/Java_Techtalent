package Test;
import org.junit.Test;

class CalculadoraTest {
    
    @Test
    void testAdd() {
        CalculadoraTest calculator = new CalculadoraTest();
        assertEquals(5, calculator.add(2, 3), "2 + 3 debería ser 5");
    }

    @Test
    void testSubtract() {
    	CalculadoraTest calculator = new CalculadoraTest();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 debería ser 1");
    }
}