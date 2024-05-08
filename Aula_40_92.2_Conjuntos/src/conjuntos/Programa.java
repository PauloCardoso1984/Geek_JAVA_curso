package conjuntos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* Conjuntos
 Os conjuntos são implementados com a interface Set e uma das classes
 que implementamesta interface e a HahSet.
 
 A maioria das coleções possuem os mesmos métodos já conhecidos e 
 utilizados com as listas, mas o comportamento desses objetos é um
 pouco diferente a performace é melhor em conjuntos do que nas Listas.
 
 Características dos conjuntos:
 - Não aceitam valores repetidos (aceita mas não incluem).
 - A ordem de inserção não é respeitada e faz uma semi-ordenação.
 - Não aceita ordenação.
 - Não possui índice (nome.get(algumaCoisa)).
 
 */
public class Programa {
	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		boolean res;

		// Modelo de CONJUNTO
		Set<String> nomes = new HashSet<String>();

		// Colocar 5 nomes na lista
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o " + (i + 1) + "/5 nome: ");
			String nome = tc.nextLine();
			res = nomes.add(nome);
			if (!res) {
				System.out.println("O nome já contém na lista, insira outro nome... ");
				i--; // Não será incremmentado quando for igual
				System.out.println();
			}
		}
		System.out.println();

		// Verificar o tamanho do conjunto
		System.out.println("No conjunto nomes temos " + nomes.size() + " elementos");
		System.out.println();

		System.out.println("Impressão dos elementos um abaixo do outro:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println();

		System.out.println("Impressão um a frente do outro: ");
		System.out.println(nomes);

		tc.close();
	}
}