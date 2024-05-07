package object;

// CLASSE DE OBJETOS GENÉRICO POR CONTA DO Object
public class Caixa {
	
	private Object[] objetos;
	private int posicaoLivre;
	
	public Caixa() {
		objetos = new Object[100]; // até 100 contas
		posicaoLivre = 0;
	}
	
	// MÉTODOS AUXILIARES  
	// INCREMENTAR POSICAO DA CONTA
	public void adicionar(Conta nova) {
		this.objetos[this.posicaoLivre] = nova;
		this.posicaoLivre ++;
	}
	
	// BUSCAR A CONTA PELA POSIÇÃO INFORMADA
	public Object pegar(int posicao) {
		return this.objetos[posicao];
	}
}
