package clases;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	private static Empleado e;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		e = new Empleado();
		e = new Empleado("Pepe", "Cuberos", 55, 1500, 5);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		e = null;
	}

	@Test
	void testEmpleado() { //testea el constructor
		e = new Empleado();
		assertAll( //en esta se lanzan todas las acepciones y se comprueban todas aún cuando alguna haya fallado
			()-> assertEquals("", e.nombre),
			()-> assertEquals("", e.apellido),
			()-> assertEquals(0, e.edad),
			()-> assertEquals(0, e.salario),
			()-> assertEquals(0, e.antiguedad)	
				); 
		
		//se lanzan las acepciones por separado y, si alguna falla, no se comprueba la siguiente hasta que no se haya solucionado la que va primero
//		assertEquals("", e.nombre);
//		assertEquals("", e.apellido);
//		assertEquals(0, e.edad);
//		assertEquals(0, e.salario);
//		assertEquals(0, e.antiguedad);
	}

	@Test
	void testEmpleadoStringStringIntDoubleInt() { //comprueba constructor con parámetros
		e = new Empleado("Pepe", "Cuberos", 55, 1500, 5);
		
		assertAll( 
				()-> assertEquals("Pepe", e.nombre),
				()-> assertEquals("Cuberos", e.apellido),
				()-> assertEquals(55, e.edad),
				()-> assertEquals(1500, e.salario),
				()-> assertEquals(5, e.antiguedad)	
					); 
	}

	@Test
	void testEmpleadoEmpleado() {//comprueba el constructor de copia
		e = new Empleado("Pepe", "Cuberos", 55, 1500, 5);
		Empleado copia = new Empleado(e);
		
		assertAll( 
				()-> assertEquals(copia.nombre, e.nombre),
				()-> assertEquals(copia.apellido, e.apellido),
				()-> assertEquals(copia.edad, e.edad),
				()-> assertEquals(copia.salario, e.salario),
				()-> assertEquals(copia.antiguedad, e.antiguedad)	
					); 
	}

	@Test
	void testGetNombre() {
		assertEquals(e.nombre, e.getNombre());
	}

	@Test
	void testSetNombre() {
		e.setNombre("Ana");
		assertEquals("Ana", e.nombre); //distingue mayus y minus
	}

	@Test
	void testGetApellido() {
		assertEquals(e.apellido, e.getApellido());
	}

	@Test
	void testSetApellido() {
		e.setApellido("Martin");
		assertEquals("Martin", e.apellido);
	}

	@Test
	void testGetEdad() {
		assertEquals(e.edad, e.getEdad());
	}

	@Test
	void testSetEdad() {
		e.setEdad(44);
		assertEquals(44, e.edad);
	}

	@Test
	void testGetSalario() {
		assertEquals(e.salario, e.getSalario());
	}

	@Test
	void testSetSalario() {
		e.setSalario(2000);
		assertEquals(2000, e.salario);
	}

	@Test
	void testGetAntiguedad() {
		assertEquals(e.antiguedad, e.getAntiguedad());
	}

	@Test
	void testSetAntiguedad() {
		e.setAntiguedad(4);
		assertEquals(4, e.antiguedad);
	}

	@Test
	void testToString() {
		e = new Empleado("Pepe", "Cuberos", 55, 1500, 5);
		assertEquals("Empleado [nombre=Pepe, apellido=Cuberos, edad=55, salario=1500.0, antiguedad=5]", e.toString(), "Test toString no superado: revisa la representación");
	}

	@Test
	void testCalculaTrienios() { //diferentes valores de antiguedad 
		e = new Empleado("Pepe", "Cuberos", 55, 1500, 5);
		e.salario = 1000;
		e.antiguedad=1;
		assertEquals(0, e.calculaTrienios(),"Debería de tener 0€ en trienios.");
		e.antiguedad=3;
		assertEquals(50, e.calculaTrienios(),"Debería de tener 50€ en trienios.");
		e.antiguedad=4;
		assertEquals(50, e.calculaTrienios(),"Debería de tener 50€ en trienios.");
		e.antiguedad=17;
		assertEquals(250, e.calculaTrienios(),"Debería de tener 250€ en trienios.");
		e.antiguedad=20;
		assertEquals(480, e.calculaTrienios(),"Debería de tener 480€ en trienios.");
	}

	@Test
	void testCalculaSalario() {
		assertEquals(e.calculaSalario(), e.calculaTrienios()+e.salario);
	}

}
