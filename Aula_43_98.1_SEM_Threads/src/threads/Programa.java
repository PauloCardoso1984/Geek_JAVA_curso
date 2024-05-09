package threads;

/* Simulação de geração de relatório + barra de tarefa SEM utilização de threads.
 
 */
public class Programa {
	public static void main(String[] args) {
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa();

		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
	}
}