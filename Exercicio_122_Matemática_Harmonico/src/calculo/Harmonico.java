package calculo;

import java.util.Scanner;

public class Harmonico {

	public static void main(String[] args) {
		System.out.println(
				"Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor E, "
				+ "conforme formula a seguir. E = 1 + 1/2 / 1! + 1 / 2! + 1 / 3! +1/N.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro e positivo para N: ");
		int N = sc.nextInt();

		double E = 1;
		double fatorial = 1;
		for (int i = 1; i <= N; i++) {
			fatorial *= i;
			E += 1 / fatorial;
		}

		System.out.println("O valor de E é: " + E);

		sc.close();
	}
}
