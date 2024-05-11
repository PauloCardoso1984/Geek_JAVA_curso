package listasSequencial;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int total = 0; // CONTADOR

	/** Método que adiciona um objeto no inicio da lista 
	 * @param elemento -> adicionaNoComeco */
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, this.primeira);
		this.primeira = nova;
		if (this.total == 0) {
			this.ultima = this.primeira;
		}
		this.total = this.total + 1;
	}

	/** Método que adiciona um objeto no final da lista  
	 * @param elemento -> adiciona */
	public void adiciona(Object elemento) {
		if (this.total == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento, null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.total = this.total + 1;
		}
	}

	

	/** Método que adiciona um objeto na posição indicada 
	 * @param elemento -> adiciona na posição indicada */
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.total) {
			this.adiciona(elemento);
		} else {
		Celula anterior = this.pegaCelula(posicao - 1);
		Celula nova = new Celula(elemento, anterior.getProximo());
		anterior.setProximo(nova);
		this.total = this.total + 1;
		}
	}
	// METODO PARA VERIFICAR SE A POSIÇÃO ESTÁ OCUPADA
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.total;
	}	
	// METODO PARA VERIFICAR A CELULA
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inexistente");
		}
		Celula atual = this.primeira;
		for (int i = 0; i < posicao; i ++) {
			atual = atual.getProximo();
		}
		return atual;
	}

		
	/** Mostra a posição do elemento
	 * @param pega */
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	
	/** Removendo n meio da lista
	 * @param remova */	
	public void remova(int posicao) {
	}
	
	
	/** Removendo do inicio da lista
	 * @param removaDoComeco */
	public void removaDoComeco() {
		if(this.total == 0) {
			throw new IllegalArgumentException("Lista vazia...");
		}
		this.primeira = this.primeira.getProximo();
		this.total = this.total - 1;
		
		if (this.total == 0 ) {
			this.ultima = null;
		}
	}
	
	

	/** 
	 * Mostra o tamanho da lista
	 * @param tamanho 
	 */
	public int tamanho() {
		return this.total;
	}

	
	public boolean contem(Object obj) {
		return false;
	}
	
	

	// METODO ------------------ LEGALLLLLLLLLLLLLL
	@Override
	public String toString() {
		if (total == 0) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("["); // StringBuilder -> montando uma String

		for (int i = 0; i < total; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");

			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}
}
