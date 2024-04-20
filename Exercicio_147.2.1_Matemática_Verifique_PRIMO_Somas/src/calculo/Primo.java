package calculo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um número inteiro e não negativo n e imprima "
				+ "a soma dos n primeiros números primos.");
		System.out.println();

		Scanner input = new Scanner(System.in);

		int n;
		do {
			System.out.print("Digite um número inteiro não negativo (ou 0 para sair): ");
			n = input.nextInt();

			if (n > 0) {
				int soma = 0;
				int count = 0;
				int numero = 0;

				while (count < n) {
					if (isPrimo(numero)) {
						soma += numero;
						count++;
					}
					numero++;
				}
				System.out.println("A soma dos " + n + " primeiros números primos é: " + soma);
				System.out.println();
			}
			else { 
				System.out.println("Programa encerrado...");
				break;
			}
		} while (n != 0);

		input.close();
	}
	// M[ETODO
	public static boolean isPrimo(int numero) {
		if (numero < 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}