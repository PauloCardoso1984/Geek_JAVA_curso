package conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjuntos {

	// LISTA DE LISTAS
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

	public Conjuntos() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}

	/**
	 * Calculando o indice.
	 * 
	 * @param nome
	 * @return
	 */
	// METODO PARA CALCULAR O INDICE DA TABELA
	public int calculaIndice(String nome) {
		return nome.toUpperCase().charAt(0) % 26;
	}

	/**
	 * Adiciona o nome na lista.
	 * 
	 * @param nome
	 */
	public void adiciona(String nome) {
		// 1 - Verifica se o nome tem na lista
		if (!contem(nome)) {
			// 2 - Calculando o índice do nome
			int indice = calculaIndice(nome);
			// 3 - Pegando a lista de acrodo com o índice
			List<String> lista = tabela.get(indice);
			// 4 - Adicionando o nome na lista correta
			lista.add(nome);
		}
		System.out.println("Nome não adicionado, pois já está na lista =>  " + nome);
	}

	/**
	 * Método contem, para verificar se tem na lista.
	 * 
	 * @param nome
	 * @return
	 */
	private boolean contem(String nome) {
		// 1 - Calculando o indice do nome
		int indice = calculaIndice(nome);
		// 2 - Buscando na tabela especifica do índice
		return tabela.get(indice).contains(nome);
	}
	
	
	/**
	 * Remover o nome da lista.
	 * @param nome
	 */
	public void remove(String nome) {
		// 1 - Verificar se o nome existe em alguma lista
		if(contem(nome)) {
			// 2 - Calcular o indicie do nome
			int indice = calculaIndice(nome);
			// 3 - Pegamos a lista especifica do nome
			List<String> lista = tabela.get(indice);
			// 4 - Removemos da lista o nome
			lista.remove(nome);
		}
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}
}
