package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		List<Cliente> clientes = new ArrayList<Cliente>();

		// Instanciando um objeto
		Cliente cli1 = new Cliente (18, "Paulo Reginaldo", "Rua 1");
		Cliente cli2 = new Cliente (49, "Paulo Cardoso", "Rua 10");
		Cliente cli3 = new Cliente (42, "Cardoso Paulo", "Rua 5");
		
		// Adicionar o cliente
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		// Imprimir os cliente da forma cadastrada
		for (Cliente cliente : clientes){
			System.out.println(cliente);
		}
		System.out.println();
		
		// Imprimir em ordem alfabetica crescente
		
		Collections.sort(clientes);
				
		for (Cliente cliente : clientes){
			System.out.println(cliente);
		}
		System.out.println();
		
		System.out.print(clientes);		

		teclado.close();
	}
}