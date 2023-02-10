package utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void testSuma() {
		assertEquals(3, Calculadora.suma(2,1), "Error en el test: el resultado debería de haber sido 3");
		assertEquals(0,Calculadora.suma(0, 0), "Error en el test: el resultado debería de haber sido 0");
	}

	@Test
	void testDivide() {
		assertEquals(-2, Calculadora.divide(4, -2), "Error en el test: el resultado debería de haber sido 2");
		assertEquals(2, Calculadora.divide(6,3), "Error en el test: el resultado debería de haber sido 2");
		assertThrows(ArithmeticException.class,
				()-> Calculadora.divide(3, 0));
	}

	@Test
	void testEsPar() {
		assertTrue(Calculadora.esPar(2), "Error en el test: el resultado debería de haber sido par.");
	assertFalse(Calculadora.esPar(3), "Error en el test: el resultado debería de haber sido impar.");
	assertFalse(Calculadora.esPar(0), "Error en el test: el resultado debería de haber sido impar-0.");
	}

	@Test
	void testEsPrimo() {
		fail("Not yet implemented");
	}

	@Test
	void testFactorial() {
		fail("Not yet implemented");
	}

	@Test
	void testRotarDerecha() {
		int original [] = {1,2,3,4,5};
		int rotado [] = {5,1,2,3,4};
		Calculadora.rotarDerecha(original);
		assertArrayEquals(original, rotado, "Vector no rotado correctamente.");
		
	}

}
