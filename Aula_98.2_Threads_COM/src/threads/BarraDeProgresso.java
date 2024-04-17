package threads;

public class BarraDeProgresso implements Runnable {

	@Override
	// Implementado o método Runnable que faz o Thread funcionar
	public void run() {
		// Fazer um For de número de 0 até 10 mil 
		for (int i = 0; i < 1000; i ++) {
			System.out.println(i + " - Barra de Progresso... aguarde ");
		}
	}
}
