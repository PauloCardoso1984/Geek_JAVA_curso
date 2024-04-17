package calculo;

import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		System.out.println("Faça um programa para calcular as seguintes sequência: 1 + 3 + 5 + 7 + ... + (2n + 1)");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor para n: ");
		int n = sc.nextInt();

		int soma = 0;
		int valor = 1;

		System.out.print("Sequência: ");
		for (int i = 0; i <= n; i++) {
			System.out.print(valor + " - ");
			soma += valor;
			valor += 2;
		}
		System.out.println();
		System.out.println("\nSoma encontrada: " + soma);

		sc.close();
	}
}
