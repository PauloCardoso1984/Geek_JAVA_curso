package methodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/* METHOS REFERENCES
 * => Podems ser consideradas simplicações da expressões lambdas
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
		
		// FORMA 1
		System.out.println("FORMA 1");
		Function<String, Integer> tamanho = new Function<String, Integer>(){
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};	
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);
		System.out.println(palavras + "\n");
		
		
		// FORMA 2
		System.out.println("FORMA 2");
		Comparator<String> comparador1 = Comparator.comparing(new Function<String, Integer>(){
			@Override
			public Integer apply(String s) {
				return s.length();				
			}
		});	
		palavras.sort(comparador1);
		System.out.println(palavras + "\n");
		
		
		// FORMA 3
		System.out.println("FORMA 3");
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras + "\n");

		// FORMA 4 - METHOD REFERENCE 1 
		System.out.println("FORMA 4");
		palavras.sort(Comparator.comparing(String :: length));
		System.out.println(palavras + "\n");
		
		// FORMA 5 - METHOD REFERENCE 2
		System.out.println("FORMA 5");
		Function<String, Integer> tamanho1 = String :: length;
		Comparator<String> comparador2 = Comparator.comparing(tamanho1);
		palavras.sort(comparador2);
		System.out.println(palavras + "\n");
		
		// FORMA 6 - LAMBDA
		System.out.println("FORMA 6");
		palavras.forEach(s -> System.out.println(s)); 
		System.out.println();
		
		// FORMA 7 - METHOD REFERENCE 2
		System.out.println("FORMA 7");
		palavras.forEach(System.out::println);

		
		

	}		
}