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
		cuentaA.transferirMontoHacia(300, cuentaB);
		Assert.assertEquals(300, cuentaB.consultarSaldo(), 0);

	}

}
