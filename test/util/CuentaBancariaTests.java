package util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tp01.CuentaBancaria;

public class CuentaBancariaTests {
	
	CuentaBancaria cuentaA;
	CuentaBancaria cuentaB;
	
	@Before
	public void setUp() {
		cuentaA = new CuentaBancaria(0);
		cuentaB = new CuentaBancaria(0);
	}
	
	@Test
	public void transfiereSaldoHacia() {
		
		cuentaA.transferirMontoHacia(10, cuentaB);
		Assert.assertEquals(10, cuentaB.consultarSaldo(), 0);
	}

}
