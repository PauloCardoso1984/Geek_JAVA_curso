package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println(
				"EM JAVA, Faça um programa que some os números impares contidos em um intervalo definido pelo usuário. "
						+ "O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar todos os "
						+ "números pares contidos neste intervalo. Caso o usuário digite um intervalo inválido "
						+ "(começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela. "
						+ "Intervalo de valores inválidos e o programa reinicia.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Digite o valor inicial do intervalo: ");
			int inicio = sc.nextInt();

			System.out.print("Digite o valor final do intervalo: ");
			int fim = sc.nextInt();

			if (inicio >= fim) {
				System.out.println("Intervalo inválido. O valor inicial deve ser menor que o valor final.");
				continue;
			}
			int soma = 0;

			System.out.print("Os números pares somados são: ");
			for (int i = inicio; i <= fim; i++) {
				if (i % 2 == 0) {
					System.out.print(i + ", ");
					soma += i;
				}
			}
			System.out.println("\nA soma dos números pares é: " + soma);

			break; // Sai do loop infinito
		}
		sc.close();
	}
}