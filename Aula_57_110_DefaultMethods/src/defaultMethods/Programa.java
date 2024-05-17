package defaultMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* DEFAULT METHODS 
 * => São metodos completos implementados em Interfaces. 
 * Os métodos como são concretos e possuem implementação e não carece de 
 * serem implementados por interfaces.
 * */
public class Programa {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		// ADICIONADO PALAVRAS
		palavras.add("Paulo");
		palavras.add("Reginaldo");
		palavras.add("Cardoso");
		palavras.add("Deus");
		palavras.add("Jesus");
		palavras.add("Corinthians");
		palavras.add("Brasil");
		System.out.println(palavras + "\n");

		// ORDENAR A LISTA EM ORDEM ALFABÉTICA
		Collections.sort(palavras);
		System.out.println("Ordem Alfabética: " + palavras + "\n");

		// VERIFICAR O TAMANHO DA PALAVRA
		for (int i = 0; i < palavras.size(); i++) {
			System.out.println("A palavra: " + palavras.get(i) + " => tem o tamanho " + palavras.get(i).length() + " letras");
		}
		System.out.println();
		
		// INSTANCIANDO UM OBJETO TIPO COMPARADOR
		Comparator<String> comparador = new ComparadorPorTamanho(); 
		
		// ORDENAR PELO TAMANHO DA PALAVRA
		Collections.sort(palavras, comparador);
		System.out.println("Usando o método Colelections ComparadorPorPalavras (Pelo tamanho): " + palavras + "\n");
		
		palavras.sort(comparador);
		System.out.println("Usando o método sem Collections ComparadorPorPalavras (Pelo tamanho): " + palavras + "\n");
	}
}