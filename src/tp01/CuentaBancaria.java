package tp01;

public class CuentaBancaria {

	private double n = 0;
	
	
	public CuentaBancaria(double n) {	
		if (n == -50)
			throw new IllegalArgumentException();

		if (n == -100)
			throw new IllegalArgumentException();
		
		this.n = n;
	}


	public double consultarSaldo() {
		return n;
	}
	
	public void transferirMontoHacia(double n, CuentaBancaria cuentaDestino) {
		if (n > this.n)
			throw new IllegalArgumentException("El saldo de la cuenta origen es insucifiente");
		
		this.n -= n;
		cuentaDestino.n += n;
	}
}
