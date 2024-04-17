package aula_36;

public class Funcao {

	public static void main(String[] args) {

		int valor1 = 6, valor2 = 4, res;

		// chamando a mensagem
		System.out.println(mensagem_inicial());
		System.out.println();

		// chamando o método soma
		res = soma_1(valor1, valor2);
		System.out.println("O resultado da soma dos número é (res): " + res);

		System.out.println();

		// outra forma de imprimir
		System.out.println("O resultado da soma dos número é: (soma_1): " + soma_1(valor1, valor2));		
		System.out.println("O resultado da soma dos número é: (soma_2): " + soma_2(valor1, valor2, "Ola"));

	}

	// METODO SOMA
	static int soma_1(int v1, int v2) {
		return v1 + v2;
	}	
	static int soma_2(int v1, int v2, String msg) {
		System.out.println("Dentro do método soma_2: " + msg);
		return v1 + v2;
	}

	// METODO MENSAGEM
	static String mensagem_inicial() {
		return "Olá usuário seja bem-vindo!!!";
	}
}
