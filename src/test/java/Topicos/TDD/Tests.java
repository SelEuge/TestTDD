package Topicos.TDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	//@Test
	//public void test() {
		//fail("Not yet implemented");
		
//	}
	@Test
	public void saldoInicialcerotest() {
		cuentaBancaria cuenta = new cuentaBancaria();
		assertEquals(0, cuenta.saldoInicial());	
		
	}

}
