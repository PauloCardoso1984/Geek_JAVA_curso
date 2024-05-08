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
 - Aceitam repetiçaõ de valores
 - Possuem tamanho "infinito" (até o maximo da memória)
 - Podemos adicionar valores de qualquer tipo
 
 */

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(99);
		numeros.add(10);
		numeros.add(32);
		numeros.add(62);
		numeros.add(1);
		numeros.add(19);
		numeros.add(25);
		numeros.add(15);
		numeros.add(19);

		System.out.println("Escolher uma posição para imprimir = " + numeros.get(5));
		System.out.println();

		System.out.println("Imprimir todos um abaixo do outro.");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		System.out.println();

		System.out.println("Imprimir um a frente do outro = " + numeros);
		System.out.println();

		// Colocando em ordem numérica

		// CRESCENTE
		Collections.sort(numeros);
		System.out.println("Imprimir todos um abaixo do outro ordenado crescente.");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		System.out.println();

		System.out.println("Imprimir um a frente do outro ordenado = " + numeros);
		System.out.println();

		// DECRESCENTE === ATENÇÃO ===
		System.out.println("Imprimir todos um abaixo do outro ordenado decrecente.");
		for (int i = numeros.size() - 1; i >= 0; i--) {
			System.out.println(numeros.get(i));
		}
		System.out.println();

		System.out.println("Imprimir um a frente do outro ordenado decrecente.");
		for (int i = numeros.size() - 1; i >= 0; i--) {
			System.out.print(numeros.get(i) + " - ");
		}
		teclado.close();
	}
}