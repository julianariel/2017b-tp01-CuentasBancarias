package tp01;

public class CuentaBancaria {

	private double n = 0;
	
	
	public CuentaBancaria(double n) {		
		this.n = n;
	}


	public double consultarSaldo() {
		return n;
	}
	
	public void transferirMontoHacia(double n, CuentaBancaria cuentaDestino) {
		this.n = 0;
		cuentaDestino.n += n;
	}
}
