package threads;

public class GeraRelatorio {
	
	public void executa () {
	
	// Fazer um For de número de 0 até 10 mil
	for (int i = 0; i < 10000; i ++) {
		System.out.println("Gerando relatório... aguarde " + (i + 1));
		}
	}
}
