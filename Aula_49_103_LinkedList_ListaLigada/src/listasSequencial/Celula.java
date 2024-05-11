package listasSequencial;
/**
 *Classe que representa uma célula (container) onde teremos o objeto (valor)
 *e uma célula que será a ligação para o proximo 
 *
 *@author Paulo 
 *
 */

public class Celula {
	
	private Object elemento;
	private Celula proximo;
	
	// CONSTRUTOR
	public Celula(Object elemento, Celula proximo) {
		this.elemento= elemento;
		this.proximo = proximo;
		}

	// GET e SET
	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
}
