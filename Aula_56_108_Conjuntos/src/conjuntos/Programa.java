package conjuntos;

import java.util.HashSet;
import java.util.Set;

// CONJUNTOS => IMPLEMENTAÇÃO DO JAVA
/* 
Uma das caracteristicas dos conuntos é a não aceitar elementos repetidos.

Gera performace
*/
public class Programa {
	public static void main(String[] args) {

		Set<String> nomes = new HashSet<String>();
		
		System.out.println(nomes);
		
		// ADICIONADO NA LISTA
		nomes.add("Paulo");
		nomes.add("Anjo");
		nomes.add("Cardoso");
		nomes.add("Jesus");
		
		// TENTEI REPETIR MAS NÃO ACEITOU
		nomes.add("Paulo");
		System.out.println(nomes);	
		
		String nome1 = "Paulo";
		String nome2 = "Anjo";
		String nome3 = "Jesus";
		
		// PASSARÁ UM VALOR NUMÉRICO
		System.out.println(nome1.hashCode());
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		
		System.out.println("Paulo".hashCode());

	}
}