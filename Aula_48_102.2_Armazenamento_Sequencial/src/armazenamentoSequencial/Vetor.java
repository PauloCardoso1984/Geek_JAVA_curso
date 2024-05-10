package armazenamentoSequencial;

import java.util.Arrays;

public class Vetor {
	
	// Neste Array podemos colocar até 50 alunos
	private Aluno alunos[] = new Aluno[50];
	private int total = 0;
	// METODO -> garantir espaço no Array
	private void garatirEspaço() {
		// verifica se o Array alunos esteja cheio
		if(total == alunos.length) {
			// caso o array esteja cheio - criará mais espaço com o dobro de espaço
			Aluno novoArray[] = new Aluno[alunos.length * 2];
			// Copia os dados do Array anterior para o novo Array
			for (int i = 0; i < alunos.length; i ++) {
				novoArray[i] = alunos[i];
			}
			// Por fim, atribuimos o novoArray ao Array original
			this.alunos = novoArray;
		}	
	}
	
	
	// Forma 1 - Adicionar aluno na lista
/*	public void adiciona(Aluno aluno) {
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] == null) {
				alunos[i] = aluno;
				break;
			}
		}
	}
*/ // Forma 2 - Adicionar aluno na lista
	public void adiciona(Aluno aluno) {
		this.garatirEspaço();
		this.alunos[total] = aluno;
		total = total + 1;
	}	
	public void adiciona(int posicao, Aluno aluno) {
		this.garatirEspaço();
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida...");
		}
		for (int i = total; i >= posicao; i -= 1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	}
	
	
	// Pega posição do aluno
	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!!");
		}
		return this.alunos[posicao];
	}	// METODO
	private boolean posicaoOcupada(int posicao) { // Tratando excessão de posição menor que 0 ou maior que total
		return posicao >=0 && posicao < total;
	}
	
	
	// Remove aluno pela posição
	public void remove(int posicao) {
		for (int i = posicao; i < this.total; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		total--;
	}
	
	
	// Verificar se o Aluno está no Array
	public boolean contem(Aluno aluno) {
		for (int i=0; i < total; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		} 
		return false;
	}
	
	
	// Verificar o tamanho do Array
	public int tamanho() {
		return this.total;
	}
	
	
	@Override
	// Facilita a visualização do Array
	public String toString() {
		return Arrays.toString(this.alunos);
	}
}
