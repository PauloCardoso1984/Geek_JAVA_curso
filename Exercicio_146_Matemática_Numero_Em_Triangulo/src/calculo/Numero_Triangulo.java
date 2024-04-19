package calculo;

import java.util.Scanner;

public class Numero_Triangulo {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que leia um número inteiro positivo n e em seguida imprina n linhas "
				+ "do chamado Triangulo de Floyd. Para n = 6.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro positivo: ");
		int n = sc.nextInt();

		int num = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		sc.close();
	}
}