package tp01;

public class CuentaBancaria {

	private double saldo = 0;
	
	
	public CuentaBancaria(double saldoInicial) {	
		if (saldoInicial < 0)
			throw new IllegalArgumentException("El saldo inicial de la cuenta no puede ser negativo");
		
		this.saldo = saldoInicial;
	}


	public double consultarSaldo() {
		return saldo;
	}
	
	public void transferirMontoHacia(double monto, CuentaBancaria cuentaDestino) {
		if (monto > this.saldo)
			throw new IllegalArgumentException("El saldo de la cuenta origen es insucifiente");
		
		this.saldo -= monto;
		cuentaDestino.saldo += monto;
	}
}
