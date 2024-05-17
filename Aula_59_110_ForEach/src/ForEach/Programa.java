package ForEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* DEFAULT METHODS 
 * => São metodos completos implementados em Interfaces. 
 * Os métodos como são concretos e possuem implementação e não carece de 
 * serem implementados por interfaces.
 * */
public class Programa {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		
		System.out.println(palavras);

		// ADICIONADO PALAVRAS
		palavras.add("Paulo");
		palavras.add("Reginaldo");
		palavras.add("Cardoso");
		palavras.add("Deus");
		palavras.add("Jesus");
		palavras.add("Corinthians");
		palavras.add("Brasil");
		System.out.println(palavras + "\n");
		
		// IMPRIMINDO DE OUTRA FORMA
		System.out.println("Imprimindo com for");
		for (int i = 0; i < palavras.size(); i++) {
			System.out.println(palavras.get(i));
		} 
		
		// IMPRINDO COM FOR EACH
		System.out.println("\nImprimindo com For Each");
		for (String p : palavras) {
			System.out.println(p);
		}
		
		// UTILIZANDO A CLASSE ImprineNaLinha
		Consumer<String> consumidor = new ImprimeNaLinha();
		System.out.println("\nImprimindo com a classe ImprimeNaLinha e For Each");
		palavras.forEach(consumidor);
	}
}