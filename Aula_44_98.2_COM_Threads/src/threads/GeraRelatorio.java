package threads;

/*
Implementado o método Runnable que faz o Thread funcionar. 

Para executar métodos em paralelo, nossa classe deve 
implementar a interface runnable, e o método que precisa ser 
executado em paralelo deve ser executado dentro do métoro RUN
*/ 
public class GeraRelatorio implements Runnable {

	@Override
	// MÉTODO ABSTRATO
	public void run() {
		// Fazer um For de número de 0 até 1 mil
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " - Gerando relatório... aguarde ");
		}
	}
}
