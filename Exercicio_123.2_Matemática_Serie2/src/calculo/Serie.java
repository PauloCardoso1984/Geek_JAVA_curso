package calculo;

import java.util.Scanner;

public class Serie {

	public static void main(String[] args) {
		System.out.println("Escreva um programa para calcular o valor da série, solicitando a quantidade de termos. "
							+ "S = 0 + 1/2! + 2/4! + 3/6! + ...");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		double soma = 0;
		
		System.out.print("Qual a quantidade de termos que deseja: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int denominador = 1;

			for (int j = 1; j <= 2 * i; j++) {
				denominador *= j;
			}

			double termo = (double) i / denominador;
			soma += termo;
		}

		System.out.println("O valor da série para 5 termos é: " + soma);
	}
}
