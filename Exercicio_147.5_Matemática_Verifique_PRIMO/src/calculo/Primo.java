package calculo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		System.out.println(
				"Faça um programa que mostre e depois some os numeros primos  existes entre a e b, onde a e b são número informados "
						+ "pelo usuario, sendo que b tem que ser maior que a, somente encerra quando apertar em 0.");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.print("Digite o valor de a (ou 0 para sair): ");
			a = sc.nextInt();

			if (a == 0) {
				System.out.println("Programa encerrado...");
				break;
			}

			System.out.print("Digite o valor de b: ");
			b = sc.nextInt();

			if (b <= a) {
				System.out.println("O valor de b deve ser maior que a. Tente novamente.");
				System.out.println();
				continue;
			}

			int soma = 0;
			for (int i = a; i <= b; i++) {
				if (isPrimo(i)) {
					System.out.print(i + " ");
					soma += i;
				}
			}
			System.out.println();
			System.out.println("A soma dos números primos entre " + a + " e " + b + " é: " + soma);
			System.out.println();
		}

		sc.close();
	}

	// METODO
	public static boolean isPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}