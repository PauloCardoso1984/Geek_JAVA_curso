package templateMethod;

// CLASSE ABSTRATA
// Template Method
public abstract class Treinamento {

	/*
	 * final É UM MODIFICADOR DE ACESSO QUE O ELEMENTO QUE ESTEJA UTILIZANDO, NÃO
	 * POSSA SER EXTENDIDO/REESCRITO
	 */
	// Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		preparo();
		treinoTatico();
	}

	public abstract void preparoFisico();

	public abstract void jogoTreino();
	
	public abstract void preparo();

	public final void treinoTatico() {
		System.out.println("VAI CORINTHIANS...\n");
	}
}
