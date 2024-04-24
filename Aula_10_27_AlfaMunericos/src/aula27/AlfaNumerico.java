// Tipos de dados ALFANUMERICO
// Caracteres e Strings
package aula27;

public class AlfaNumerico {
	public static void main(String[] args) {

		// CHAR usará a tabela ASC II
		// Tipos primários
		char letra1 = 'a';
		char letra2 = 97;
		char letra3 = (char) (letra2 + 1);
		
		// Tipos não primários / primitivos
		Character letra4 = 'A';
		String nome = "Paulo Cardoso";

		
		System.out.println("Letra1 " + letra1);
		System.out.println("Letra2 " + letra2);
		System.out.println("Letra3 " + letra3);
		System.out.println("Letra4 " + letra4);
		System.out.println("Nome " + nome);
		
		System.out.println();
		
		System.out.println("Valor que ocupa da memoria");
		System.out.println("Valor Minimo char/Charecter 	" + Character.MIN_VALUE);
		System.out.println("Valor Máximo char/Character 	" + Character.MAX_VALUE);
		System.out.println();
		System.out.println("Mostrará apenas o tamanh ocupado pela variavel nome = Valor da String " + (Character.SIZE * nome.length()) + " bits");
	}
}