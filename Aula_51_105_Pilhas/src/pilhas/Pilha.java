package pilhas;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes = new LinkedList<String>(); 	
	
	/**
	 * Em uma pilha, inserimos elementos sempre no topo.
	 * @param nome
	 */
	public void insere(String nome) {
		this.nomes.add(nome);
	}
	
	
	/**
	 * Em uma pilha, remove sempre o elemento que está no topo.
	 * @return
	 */
	public String remove() {
		return nomes.remove(nomes.size() - 1);		
	}
	
	/**
	 * Mostrará o elemento do topo.
	 * @return
	 */
	public String pegaTopo() {
		return nomes.get(nomes.size() - 1);	
	}
	
	/**
	 * Mostrará falso ou verdadeiro se a pilha estiver vazia.
	 * @return
	 */
	public boolean vazia() {
		return nomes.size() == 0;		
	}


	@Override
	public String toString() {
	//	return "Pilha [nomes=" + nomes + "]";
		return this.nomes.toString();
	}	
}
