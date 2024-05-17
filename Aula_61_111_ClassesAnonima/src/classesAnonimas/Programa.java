package classesAnonimas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/* CLASSES ANÔNIMAS
 * => São classes sem nome. Geralmente essas classes com 1 ou poucos
 * metodos e não recisará de reaproveitar o código, ou seja, se não
 * iremos precisar reaproveitar em outra classe em outra parte do sistema
 * podemos utilizar o conceito de classe anônima.
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
		System.out.println(palavras + "\n");

		// IMPRIMINDO USANDO INTERFACE E FOR EACH
		System.out.println("IMPRIMINDO USANDO INTERFACE E FOR EACH");
		Consumer<String> consumidor = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		palavras.forEach(consumidor);
	}
}