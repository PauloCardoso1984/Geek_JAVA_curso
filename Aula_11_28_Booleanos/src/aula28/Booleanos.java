// Tipos de dados Booleanos
package aula28;

public class Booleanos {
	public static void main(String[] args) {

		

		// Tipos primários
		boolean verdadeiro = true;
		boolean falso = false;

		// Tipos não primários / primitivos
		Boolean verdadeiros = true;
		Boolean falsos = false;
		
		Boolean ativo = true;
		
		System.out.println("verdadeiro 	→ " + verdadeiro);
		System.out.println("falso 		→ " + falso);
		System.out.println("verdadeiros 	→ " + verdadeiros);
		System.out.println("falsos 		→ " + falsos);

		System.out.println();

		if (verdadeiro == false) {
			System.out.println("Verdadeiro - TESTE");
		} else {
			System.out.println("Falso - TESTE");
		}

		if (verdadeiro == true) {
			System.out.println("Verdadeiro - TESTE");
		} else {
			System.out.println("Falso - TESTE");
		}

		if (1 == 2) {
			System.out.println("Verdadeiro - TESTE NUMERO");
		} else {
			System.out.println("Falso - TESTE NUMERO");
		}

		if (1 == 1) {
			System.out.println("Verdadeiro - TESTE NUMERO");
		} else {
			System.out.println("Falso - TESTE NUMERO");
		}

		if (ativo) {
			System.out.println("Acesso permitido....");
		} else {
			System.out.println("Acesso negado...");
		}
	}
}