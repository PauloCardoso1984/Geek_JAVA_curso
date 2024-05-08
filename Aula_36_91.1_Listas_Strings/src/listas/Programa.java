package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Arrays [Vetores/Matrizes]
 - Um Array tem um tamanho fixo.
 - Um Array tem tipo de dado fixo, se criamos um Array de inteiros, somente poderá ser inseridos inteiros.
 - Dificil encontrar um determinado elemento no Array, nesse caso é necessário varrer o Array pelo indice até encontrar o solicitado.
  
 -> Collections (coleção)
 - JAVA possuem diversas classes / interfaces que facilitam muito o trabalho quando se trata
 de coleções de dados. Essas classes / interfaces são chamadas de Collections (coleção)
 
 - Listas
 - Aceitam repetição de valores
 - Possuem tamanho "infinito" (até o máximo da memória)
 - Podemos adicionar valores de qualquer tipo desde que não especificamos um tipo 
   na declaração (String, Char, Integer, etc)
 */

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Sem definir tipo de dado, podemos colocar qualquer tipo de dado
//		ArrayList nomes = new ArrayList();

		// Neste caso vamos somente dar atenção ao tipo String pois definimos o tipo de
		// dado
		ArrayList<String> nomes = new ArrayList<String>();

		// Adicionar nomes na lista
		nomes.add("Paulo");
		nomes.add("Reginaldo");
		nomes.add("Cardoso");
		nomes.add("Análise");
		nomes.add("Sistemas");
		nomes.add("Paulo");
		nomes.add("Reginaldo");
		nomes.add("Cardoso");
		
		/* nomes.add(1984); nomes.add(12.4); nomes.add('e'); nomes.add(true);
		 */
		// (1.0) Imprimir todos os nomes
		System.out.println("Imprimir todos os nomes -> " + nomes);
		System.out.println();

		// For Eacht - Outra maneira de imprimir
		for (Object palavra : nomes) { // Se usar apenas String podemos substituir Object por String
			System.out.println(palavra);
		}
		System.out.println();

		// (1.1) Imprimirá o tamanho da Lista
		System.out.println("Imprimirá o tamanho da Lista .size -> " + nomes.size());
		System.out.println();

		// (1.2) Imprimir todos os nomes em abaixo do outro
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println();

		// Escolher a posição para imprimir
		System.out.println("Imprimir apenas o solicitado -> " + nomes.get(0));
		System.out.println("Imprimir apenas o solicitado -> " + nomes.get(2));
		System.out.println();

		// Remover um nome da lista pela posição
		nomes.remove(3);

		// Remover um nome da lista pelo nome
		nomes.remove("Sistemas");

		// Adicionar um nome na lista
		nomes.add("Corinthians");

		// Imprimirá o tamanho da Lista (alterada)
		System.out.println("Imprimirá o tamanho da Lista .size -> " + nomes.size());
		System.out.println();

		// (1.0) Imprimir todos os nomes - retirado o excluido
		System.out.println("Imprimir todos os nomes já alteradas -> " + nomes);
		System.out.println();

		// Colocar em ordem alfabética utilizando -> Collections.sort();
		Collections.sort(nomes);

		System.out.println("Em ordem alfabética.");
		for (Object palavra : nomes) {
			System.out.println(palavra);
		}
		System.out.println();

		teclado.close();
	}
}