package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Ejercicio1;

class TestCerrojo {

	/*
	 * Test para ver si la combinacion es valida
	 */
	@Test
	public void combinacionValida() {
		Ejercicio1 cerrojo = new Ejercicio1();
		cerrojo.setCombinacion(213);
		assertEquals(213, cerrojo.getCombinacion());
		
	}
	/*
	 * Test para ver si la combinacion no es valida
	 */
	@Test
	public void combinacionNoValida() {
		Ejercicio1 cerrojo = new Ejercicio1();
		cerrojo.setCombinacion(0);
		assertEquals(false, cerrojo.getAbierto());
		
	}


}
