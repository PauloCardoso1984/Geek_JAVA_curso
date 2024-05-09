package threads;
/* Simulação da geração de relatório + barra de tarefa sem 
a utilização de threads */

public class GeraRelatorio {
	
	public void executa () {
	
	// Fazer um For de número de 0 até 500
	for (int i = 0; i < 500; i ++) {
		System.out.println("Gerando relatório... aguarde " + (i + 1));
		}
	}
}
