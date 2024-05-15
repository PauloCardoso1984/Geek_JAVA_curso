package pilhas;

// PILHAS
/* 
 São estruturas de dados onde o elemento que está visivel/ disponivel é o que 
 esta seempre no topo.
 => Os elementos, ao serem adicionados em uma pilha, são adicionados sempre no topo.
 => Para remover elementos da pilha, só podemos remover do topo.
 => Será visivel quem estiver no topo 
 */ 
public class Programa {
	public static void main(String[] args) {
		
		// INSTANCIANDO
		Pilha pilha = new Pilha();
		System.out.println(pilha);
		
		// ADICIONADO
		pilha.insere("Paulo");
		System.out.println(pilha);
		
		pilha.insere("Reginaldo");
		System.out.println(pilha);
		
		pilha.insere("Cardoso");
		System.out.println(pilha);
		
		// REMOVIDO
		pilha.remove();
		System.out.println(pilha);		
		
		// VERIFICANDO SE A PILHA ESTÁ VAZIA
		System.out.println("A pilha está vazia? " + pilha.vazia());
		
		// REMOVIDO
		pilha.remove();
		System.out.println(pilha);	
		
		pilha.remove();
		System.out.println(pilha);	
		
		// VERIFICANDO SE A PILHA ESTÁ VAZIA
		System.out.println("A pilha está vazia? " + pilha.vazia());
	}
}