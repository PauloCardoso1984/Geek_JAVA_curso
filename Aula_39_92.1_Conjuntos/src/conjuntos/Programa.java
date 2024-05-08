package conjuntos;

import java.util.HashSet;
import java.util.Set;

/* CONJUNTOS
 Os conjuntos são implementados com a interface Set e uma das classes
 que implementamesta interface e a HahSet.
 
 A maioria das coleções possuem os mesmos métodos já conhecidos e 
 utilizados com as listas, mas o comportamento desses objetos é um
 pouco diferente a PERFORMACE é melhor em conjuntos do que nas Listas.
 
 Características dos conjuntos:
 - Não aceitam valores repetidos (aceitam mas não incluem).
 - A ordem de inserção não é respeitada e faz uma semi-ordenação.
 - Não aceita ordenação pelo => collections.sort.
 - Não possui índice (nome.get(algumaCoisa)). 
 */

public class Programa {

	public static void main(String[] args) {

		// Modelo de CONJUNTO
		Set<String> nomes = new HashSet<String>();

		// Adicionando objetos
		nomes.add("Paulo");
		nomes.add("Reginaldo");
		nomes.add("Cardoso");
		nomes.add("Corinthians");
		nomes.add("Timão");
		nomes.add("Indaiatuba");
		nomes.add("Paulo"); // não será inserido por conta da repetição

		// Imprimir o conjunto um baixo do outro
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println();

		// Ver o tamanho do conjunto
		System.out.println("Tamanho da lista: " + nomes.size());
		System.out.println();

		// Imprimir o conjunto um a frente do outro
		System.out.println(nomes);
		System.out.println();

		// Verificar se contém um nome
		System.out.println("Se true está na lista, e se false não está na lista (Paulo) -> " + nomes.contains("Paulo"));
		System.out.println();

		System.out.println("Tentar adicionar um nome que já existe (Paulo) -> " + nomes.add("Paulo"));
		System.out.println("Tentar adicionar um nome que não existe no conjunto -> " + nomes.add("Indaiatuba"));
		System.out.println();

		// Lista atualizada
		System.out.println("Lista atualizada: \n" + nomes);
	}
}