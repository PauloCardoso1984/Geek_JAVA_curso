package armazenamentoSequencial;

/* ARMAZENAMENTO SEQUENCIAL
 int numeros [] = new int[5];
 
 numeros[0] = 1;
 numeros[1] = 3;
 numeros[2] = 5;
 numeros[3] = 7;
 numeros[4] = 9; 
 */

public class Programa {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Paulo");
		Aluno a2 = new Aluno("Cardoso");
		Aluno a3 = new Aluno("Reginaldo");
		
		// Implementar um vetor (Classe Vetor)
		Vetor lista = new Vetor();
		
		System.out.println("Total de Alunos (vazia) : " + lista.tamanho() + "\n");
		
		// Adicionando no Vetor
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		// Imprimir a lista
		System.out.println("Lista: " + lista + "\n");
		
		// Imprimir total de alunos
		System.out.println("Total de Alunos (incluido) : " + lista.tamanho() + "\n");
		
		// Verificar se tem o aluno mencionado na lista
		System.out.println("Verificar se tem esse aluno na lista: " + lista.contem(a1) + "\n");
		
		// Pegar aluno pela posição
		System.out.println("Buscar aluno pela posição: " + lista.pega(0) + "\n");
		try {
			System.out.println("Buscar aluno pela posição: " + lista.pega(101) + "\n");
		} catch (IllegalArgumentException e) {
			System.out.println("Esse aluno na posição não existe!");
			System.out.println("Mostrando qual é o erro: " + e.getMessage() + "\n");
		}
	
		// Adicionando no Vetor
		lista.adiciona(1, a3);
		try {
			lista.adiciona(101, a3);
		} catch (IllegalArgumentException e) {
			System.out.println("A posição que tentou inserir é inválida...\n");
		}
		// Imprimir a lista
		System.out.println("Lista (adicionada): " + lista + "\n");
		
		// Remover algém da lista
		lista.remove(1);
		
		// Imprimir a lista
		System.out.println("Lista (removida): " + lista + "\n");	
	}
}