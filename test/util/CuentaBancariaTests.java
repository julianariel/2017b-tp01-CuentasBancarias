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
		cuentaA = new CuentaBancaria(1000);
		cuentaB = new CuentaBancaria(0);
	}
	
	@Test
	public void transfiereSaldoHacia() {		
		cuentaA.transferirMontoHacia(100, cuentaB);
		Assert.assertEquals(100, cuentaB.consultarSaldo(), 0);

		Assert.assertEquals(900, cuentaA.consultarSaldo(), 0);
	}

}
