package calculo;

import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		System.out.println( "Faça um programa para calcular as seguintes sequência:" + "1 - 2 + 3 - 4 + 5 + ... + (2n - 1)");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de n: ");
		int n = sc.nextInt();

		int soma = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				soma -= i;
				System.out.print(" - " + i);
			} else {
				soma += i;
				if (i == 1) {
					System.out.print(i);
				} else {
					System.out.print(" + " + i);
				}
			}
		}
		System.out.println();
		System.out.println("\nA soma da sequência é: " + soma);

		sc.close();
	}
}
