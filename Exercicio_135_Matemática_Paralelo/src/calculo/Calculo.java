package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que calcula a associação em paralelo de dois resistores "
				+ "R1 e R2 fornecidos pelo usuário via teclado. O programa fica pedindo estes valores "
				+ "e calculando até que o usuário entre com um valor para resistencia igual a zero.");
		System.out.println();

		Scanner input = new Scanner(System.in);

		double R1, R2, R_total;

		while (true) {
			System.out.println("Digite 0 para sair...");
			System.out.print("Digite o valor de R1: ");
			R1 = input.nextDouble();

			if (R1 == 0) {
				System.out.println("Programa encerrado...");
				break;
			}

			System.out.print("Digite o valor de R2: ");
			R2 = input.nextDouble();

			R_total = (R1 * R2) / (R1 + R2);

			System.out.println("A resistência equivalente em paralelo é: " + R_total);
			System.out.println();
		}

		input.close();
	}
}