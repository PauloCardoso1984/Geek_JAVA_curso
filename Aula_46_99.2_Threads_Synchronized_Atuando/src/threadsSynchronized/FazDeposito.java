package threadsSynchronized;

public class FazDeposito implements Runnable {

	private Conta conta;

	public FazDeposito(Conta conta) {
		this.conta = conta;
	}

	// METODO DO Runnable
	@Override
	public void run() {
		this.conta.depositar(1500.0f);
	}
}
