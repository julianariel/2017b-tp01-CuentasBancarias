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
		cuentaA = new CuentaBancaria(100);
		cuentaB = new CuentaBancaria(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void transfiereSaldoHacia() {		
		cuentaA.transferirMontoHacia(200, cuentaB);
		Assert.assertEquals(200, cuentaB.consultarSaldo(), 0);

	}

}
