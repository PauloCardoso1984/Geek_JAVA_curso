
package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um número indeterminado de idades de indivíduos "
				+ "(pare quando for informada a idade 0 ou negativa), e calcule a média desse grupo.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int idade, soma = 0, quantidade = 0;
		double media;

		do {
			System.out.println("Digite 0 ou um número negativo para encerrar");
			System.out.print("Digite as idades dos indivíduos: ");
			idade = sc.nextInt();
			if (idade > 0) {
				soma += idade;
				quantidade++;
			}
			System.out.println();
		} while (idade > 0);

		if (quantidade > 0) {
			media = (double) soma / quantidade;
			System.out.println("A média das idades é: " + media);
		} else {
			System.out.println("Você não informou nenhuma idade válida.");
		}
		System.out.println("Programa encerrado...");

		sc.close();
	}
}
