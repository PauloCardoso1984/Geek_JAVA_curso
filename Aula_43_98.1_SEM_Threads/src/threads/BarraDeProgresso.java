package threads;

public class BarraDeProgresso {
	
	public void executa() {
		
		// Fazer um For de número de 0 até 5000
		for (int i = 0; i < 500; i ++) {
			System.out.println("Barra de Progresso... aguarde " + (i + 1));
		}
	}
}
