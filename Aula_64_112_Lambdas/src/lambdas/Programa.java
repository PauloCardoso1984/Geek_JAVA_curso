package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* LAMBDAS
 * => ESPRESSÕES LAMBAS SÃO FUNÇÕES ANÔNIMAS
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
		
		// USANDO LAMBDAS - FORMA 1
		System.out.println("IMPRIMINDO USANDO LAMBDAS FORMA 1");
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.forEach(s -> System.out.println(s));
		
		// USANDO LAMBDAS - FORMA 2
		System.out.println("\nIMPRIMINDO USANDO LAMBDAS FORMA 2");
		Consumer<String> consumer = s -> System.out.println(s);
		palavras.forEach(consumer);		
	}		
}