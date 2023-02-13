package clases;

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
		assertEquals(4, Calculadora.divide(8, 2),
				"La división debe dar 4");
		
		assertEquals(3.5, Calculadora.divide(7, 2),
				"La división debe dar 3.5");
		
		assertEquals(-4, Calculadora.divide(-8, 2),
				"La división debe dar -4");
		
//		assertEquals(Float.POSITIVE_INFINITY, Calculadora.divide(7, 0),
//				"La división debe dar 0");
		
		assertThrows(ArithmeticException.class,
				()->Calculadora.divide(7, 0),
				"Debería devolver una excepción de tipo ArithmeticException");
	}

	@Test
	void testEsPar() {
		assertTrue(Calculadora.esPar(2), "Error en el test: el resultado debería de haber sido par.");
	assertFalse(Calculadora.esPar(3), "Error en el test: el resultado debería de haber sido impar.");
	assertFalse(Calculadora.esPar(0), "Error en el test: el resultado debería de haber sido impar-0.");
	}

	@Test
	void testEsPrimo() {
		assertTrue(Calculadora.esPrimo(7),
				 "El 7 es primo");
				assertFalse(Calculadora.esPrimo(8),
						 "El 8 NO es primo");
				assertFalse(Calculadora.esPrimo(-7),
					"Los números primos no son negativos");
				assertFalse(Calculadora.esPrimo(-8),
					"Los números primos no son negativos");
				assertTrue(Calculadora.esPrimo(7),
						 "El 7 es primo");
				assertTrue(Calculadora.esPrimo(2),
						"El 2 es primo");
				assertFalse(Calculadora.esPrimo(1),
						 "El 1 NO es primo");
	}

	@Test
	void testFactorial() {
		assertEquals(120, Calculadora.factorial(5), "El factorial de 5 es 120");
		
		assertThrows(ArithmeticException.class,
			()->Calculadora.factorial(-5),
			"El factorial no está definido en números negativos");
		assertEquals(1, Calculadora.factorial(0), "El factorial de 0 es 1");
		assertEquals(1, Calculadora.factorial(1), "El factorial de 1 es 1");
	}

	@Test
	void testRotarDerecha() {
		int original [] = {1,2,3,4,5};
		int rotado [] = {5,1,2,3,4};
		Calculadora.rotarDerecha(original);
		assertArrayEquals(original, rotado, "Vector no rotado correctamente.");
		
	}

}
