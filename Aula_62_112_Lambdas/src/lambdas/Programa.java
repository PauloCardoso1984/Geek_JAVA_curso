package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* LAMBDAS
 * => ESPRESSÕES LAMBAS SÃO FUNÇÕES ANÔNIMAS
 * */
public class Programa {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		Comparator<String> comparador = new ComparadorPorTamanho();

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

		// ORGANIZANDO PELO TAMANHO
		palavras.sort(comparador);
		System.out.println(palavras);

		// USANDO LAMBDAS - FORMA 1
		System.out.println("\nIMPRIMINDO USANDO LAMBDAS FORMA 1");
		palavras.forEach((String s) -> {
			System.out.println(s);
		});

		// USANDO LAMBDAS - FORMA 2
		System.out.println("\nIMPRIMINDO USANDO LAMBDAS FORMA 2");
		palavras.forEach(s -> System.out.println(s));
	}
}