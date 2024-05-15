package listasSequencial;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int total = 0; // CONTADOR

	/** Método que adiciona um objeto no inicio da lista 
	 * @param elemento -> adicionaNoComeco */
	
	public void adicionaNoComeco(Object elemento) {
		if(this.total == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(elemento, this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.total = this.total + 1;
	}
	
	
	
	/** Método que adiciona um objeto no final da lista  
	 * @param elemento -> adiciona */
	public void adiciona(Object elemento) {
		if (this.total == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
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
		Celula proxima = anterior.getProximo();
		Celula nova = new Celula(elemento, anterior.getProximo());
		anterior.setProximo(nova);
		nova.setAnterior(anterior);
		proxima.setAnterior(proxima);
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

	
	
	/** Removendo do meio da lista
	 * @param remova */	
	public void remova(int posicao) {
		// Se só tiver um elemento
		if(posicao == 0) {
			// Se for o ultimo elemento
			this.removaDoComeco();
		} else if(posicao == this.total - 1) {
			this.removaDoFim();
			// Se for um elemento do meio
		} else {	
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);			
			this.total = this.total - 1;
		}
	}
	
	
	
	// => METODO PARA REMOVER - DO FIM
	public void removaDoFim() {
		if(this.total == 1) {
			this.removaDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.total = this.total - 1;
		}
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
		Celula atual = this.primeira;
		while (atual != null) {
			if(atual.getElemento().equals(obj)) {
				return true;
			}
			atual = atual.getProximo();
		}
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
