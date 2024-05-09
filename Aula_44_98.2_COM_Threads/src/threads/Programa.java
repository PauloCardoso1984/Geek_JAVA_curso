package threads;

/* Simulação de geração de relatório + barra de tarefa COM utilização de threads. */

public class Programa {
	public static void main(String[] args) {
				
		BarraDeProgresso barra = new BarraDeProgresso();
		// Criando e iniciando o Thread
		Thread t1 = new Thread(barra);
		t1.start();		
		
		GeraRelatorio relatorio = new GeraRelatorio();
		// Criando e iniciando o Thread
		Thread t2 = new Thread(relatorio);
		t2.start();		
	}
}