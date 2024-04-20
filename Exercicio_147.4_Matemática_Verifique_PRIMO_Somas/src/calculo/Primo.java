package calculo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		System.out.println(
				"Faça um programa que conte quantos números primos existes entre a e b, onde a e b são número informados "
				+ "pelo usuario, sendo que b tem que ser maior que a, somente encerra quando apertar em 0.");
		System.out.println();

		Scanner input = new Scanner(System.in);

		int a, b;
		int countPrimos = 0;

		do {
			System.out.print("Informe o valor de a (ou digite 0 para sair): ");
			a = input.nextInt();

			if (a == 0) {
				break;
			}

			System.out.print("Informe o valor de b (b tem que ser maior que a): ");
			b = input.nextInt();

			if (b <= a) {
				System.out.println("b deve ser maior que a. Tente novamente.");
			}

			for (int i = a; i <= b; i++) {
				if (isPrimo(i)) {
					countPrimos++;
				}
			}
			System.out.println("Quantidade de números primos entre " + a + " e " + b + ": " + countPrimos);
		} while (a != 0);

		System.out.println("Programa encerrado.");

		input.close();
	}

	// MÉTODO
	public static boolean isPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}