package filas;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> nomes = new LinkedList<String>();

	/**
	 * Metodo para adionar nome.
	 * 
	 * @param nome
	 */
	public void adiciona(String nome) {
		this.nomes.add(nome);
	}

	/**
	 * Remove do inicio da lista.
	 * 
	 * @return
	 */
	public String remove() {
		try {
			return nomes.remove(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===== A lista já está vazia =====");
			return " ";
		}
	}

	/**
	 * Mosta verdadeiro se vazia, e false se tiver elemento
	 * 
	 * @return
	 */
	public boolean vazia() {
		return this.nomes.size() == 0;
	}

	@Override
	public String toString() {
		return this.nomes.toString();
	}
}
