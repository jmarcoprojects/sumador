package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;
/**
 * Clase JUnit para los test de pruebas
 * @author J M
 * @version: 1.0
 * 
 */
public class TestASumar {
	/**
	 * Test para un número de un sólo dígito
	 */
	@Test
	public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("5");
        assertEquals("5 = 5",resultado );
    }
	
	/**
	 * Test para número negativo
	 */
	@Test
	public void testValorNegativo() {
		ASumar sumi = new ASumar();
		String resultado = sumi.mostrar("-5");
		assertNull(resultado);
	}
	/**
	 * Test para numeros mayores de 9
	 * 
	 */
	@Test 
	public void testMayor9() {
		 ASumar sumi = new ASumar();
	     String resultado = sumi.mostrar("1234");
	     assertEquals("1234 = 1+2+3+4=10",resultado );
		
	}
}
