// For

// Receba dados do usuario enquanto a idade for maior que 0
package aula22;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {

		// Variaveis
		int idade = 1;
		String nome;
		int ano;

		// Receber dados do usuário via teclado
		Scanner sc = new Scanner(System.in);

		// Variavél de ; condição de parada; forma de encremento
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Informe seu nome: ");
			nome = sc.nextLine();

			System.out.print("Qual sua idade: ");
			idade = Integer.parseInt(sc.nextLine()); // tem que fazer desse jeito para não dar erro

			ano = 2024 - idade;

			System.out.println(nome + " tem " + "anos e nasceu no ano de " + ano + ".");
			System.out.println();
		}
		System.out.println("Programa concluído...");
		System.out.println("Programa encerrado...");

		sc.close();
	}
}