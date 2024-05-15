package pilhas;

import java.util.Stack;

// PILHAS - IMPLEMENTAÇÃO DO JAVA
/* 
 São estruturas de dados onde o elemento que está visivel/ disponivel é o que 
 esta seempre no topo.
 => Os elementos, ao serem adicionados em uma pilha, são adicionados sempre no topo.
 => Para remover elementos da pilha, só podemos remover do topo.
 => Será visivel quem estiver no topo 
 
 => Para adicionar uma push
 => Para remover usa-se pop
 => Para retornar o elemento do top.
 */ 
public class Programa {
	public static void main(String[] args) {
		
		Stack<String> nomes = new Stack<String>();
		System.out.println(nomes);
		
		// PARA INSERIR UM NOME NA LISTA
		nomes.push("Paulo"); 
		System.out.println(nomes);
		
		nomes.push("Reginaldo"); 
		System.out.println(nomes);
		
		nomes.push("Cardoso"); 
		System.out.println(nomes);
		
		// REMOVER UM NOME DA LISTA
		nomes.pop();
		System.out.println(nomes);
		
		// RETORNA O ELEMENTO DO TOP
		System.out.println("Retorna o elemento do topo: " + nomes.peek());
		
		// REMOVER UM NOME DA LISTA
		nomes.pop();
		System.out.println(nomes);
	}
}