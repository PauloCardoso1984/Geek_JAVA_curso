package threads;

public class GeraRelatorio implements Runnable {

	@Override
	public void run() {
		// Fazer um For de número de 0 até 10 mil
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " - Gerando relatório... aguarde ");
		}
	}
}
