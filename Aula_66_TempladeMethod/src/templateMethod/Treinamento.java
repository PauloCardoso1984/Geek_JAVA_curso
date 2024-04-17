package templateMethod;

// CLASSE ABSTRATA
// Template Method
public abstract class Treinamento {

	/* final É UM MODIFICADOR DE ACESSO QUE O ELEMENTO QUE ESTEJA UTILIZANDO,
	NÃO POSSA SER EXTENDIDO/REESCRITO */
	// Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();		
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino tático...");
	}
}
