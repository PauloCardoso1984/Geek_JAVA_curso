// While e Do While

// Receba dados do usuario enquanto a idade for maior que 0
package aula21;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		// Variaveis
		int idade = 1;
		String nome;
		int ano;

		// Receber dados do usuário via teclado
		Scanner sc = new Scanner(System.in);

		while (idade > 0) {
			System.out.print("Informe seu nome: ");
			nome = sc.nextLine();

			System.out.print("Qual sua idade: ");
			idade = Integer.parseInt(sc.nextLine()); // tem que fazer desse jeito para não dar erro

			ano = 2024 - idade;

			System.out.println(nome + " tem " + "anos e nasceu no ano de " + ano + ".");
			System.out.println();
		}
		System.out.println("Programa encerrado...");

		sc.close();
	}
}