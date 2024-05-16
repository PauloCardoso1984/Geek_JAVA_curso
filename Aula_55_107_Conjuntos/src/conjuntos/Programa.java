package conjuntos;

// CONJUNTOS 
/* 
Uma das caracteristicas dos conuntos é a não aceitar elementos repetidos.

Gera performace
*/
public class Programa {
	public static void main(String[] args) {

	Conjuntos conjunto = new Conjuntos();
	
	System.out.println(conjunto + "\n");
	
	// ADICIONANDO NOMES NA LISTA
	conjunto.adiciona("Paulo");
	System.out.println(conjunto + "\n");

	conjunto.adiciona("Reginaldo");
	conjunto.adiciona("Cardoso");		
	conjunto.adiciona("Pedro");	
	conjunto.adiciona("Carneiro");
	System.out.println(conjunto + "\n");
	
	// TENTANDO INDICIONAR UM NOME JÁ NA LISTA
	conjunto.adiciona("Paulo");  // NÃO ADIONA NOME REPETIDO
	System.out.println("\nConjunto sem adicionar um nome existente: " + conjunto + "\n");
	
	// REMOVER UM NOME DA LISTA
	conjunto.remove("Pedro");
	System.out.println("Removido Pedro: " + conjunto + "\n");
		
	conjunto.remove("Brasil");
	System.out.println("Tentar remover um nome que não está na lista Brasil: " + conjunto + "\n");
		
	}
}