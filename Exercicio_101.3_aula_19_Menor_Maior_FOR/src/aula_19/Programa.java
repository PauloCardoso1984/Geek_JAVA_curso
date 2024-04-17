package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.");
		System.out.println();

		int menor = 0;
		int maior = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			int numero = sc.nextInt();
			if (i == 0) {
				menor = numero;
				maior = numero;
			} else {
				if (numero < menor) {
					menor = numero;
				}
				if (numero > maior) {
					maior = numero;
				}
			}
		}
		System.out.println();
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
	}
}
