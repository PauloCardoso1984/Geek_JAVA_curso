package lambdas;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println("\nIMPRIMINDO USANDO LAMBDAS FORMA 1");
		palavras.forEach((String s) -> {
			System.out.println(s);
		});

		// USANDO LAMBDAS - FORMA 2
		System.out.println("\nIMPRIMINDO USANDO LAMBDAS FORMA 2");
		palavras.forEach(s -> System.out.println(s));

		// USANDO LAMBDAS - FORMA 3
		System.out.println("\nIMPRIMINDO USANDO LAMBDAS FORMA 3");
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			}
			if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});
		palavras.forEach(s -> System.out.println(s));
		
		// USANDO LAMBDAS - FORMA 4
		System.out.println("\nIMPRIMINDO USANDO LAMBDAS FORMA 4");
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.forEach(s -> System.out.println(s));
		
	}		
}