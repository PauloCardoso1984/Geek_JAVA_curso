package string;
/* 
 Trabalhando com String
 Em JAVA Strings são imutáveis.
 */

public class Programa {

	public static void main(String[] args) {

		String curso = "Programação em Java: Essencial";
		System.out.println("Texto original = " + curso);

		System.out.println("---------------");

		// Alterar algum nome encontrado NOME.replace (Torca Java ou HTML)
		String nova = curso.replace("Java", "HTML"); // ou
		curso = curso.replace("Java", "HTML");
		System.out.println("replace = " + nova);
		System.out.println("replace = " + curso); // A modificação altera o curso também

		System.out.println("---------------");

		// Transformar tudo em minúsculo
		curso = curso.toLowerCase();
		System.out.println("toLowerCase = " + curso);

		System.out.println("---------------");

		// Transformar tudo em maiusculo
		curso = curso.toUpperCase();
		System.out.println("toUpperCase = " + curso);

		System.out.println("---------------");

		// Imprimir um caractere selecionado de uma String
		System.out.println("charAt  = " + (curso.charAt(12)));

		System.out.println("---------------");

		// Imprimir uma letra abaixo da outra -> println
		for (int i = 0; i < curso.length(); i++) {
			System.out.println(curso.charAt(i));
		}

		System.out.println("---------------");

		// Imprimir uma letra a frente da outra -> print
		for (int i = 0; i < curso.length(); i++) {
			System.out.print(curso.charAt(i));
		}
		System.out.println();

		System.out.println("---------------");

		// Imprimir uma letra a frente da outra inverso
		for (int i = (curso.length() - 1); i >= 0; i--) {
			System.out.print(curso.charAt(i));
		}
	}
}