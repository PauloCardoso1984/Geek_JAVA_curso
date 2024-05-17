package defaultMethods;

import java.util.Comparator;

/**
 * Criando o próprio compador de Objetos (String) para que seja possivel desta
 * forma ordenar a String por tamanho, ao inves de ordem alfabética.
 * Possibilidade de comparação, será somente 3.
 * 
 * s1 == s2 = Retornar 0 s1 > s2 = Retornar 1 s1 < s2 = Retornar -1
 */
// Comparador por palavra, por isso String
public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// Verificando de s1 é menor que s2
		if (s1.length() < s2.length()) {
			return -1;
		}
		// Verificando se s1 é maioer que s2
		if(s1.length() > s2.length()) {
			return 1;
		}
		// Se acaso s1 e s2 serem iguais
			return 0;		
	}
}
