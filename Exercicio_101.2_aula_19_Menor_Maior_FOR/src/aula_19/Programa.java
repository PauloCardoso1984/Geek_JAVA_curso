package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.");
		System.out.println();
		
		int soma = 0;
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			int numero = sc.nextInt();
			soma += numero;
			if (numero < menor) {
				menor = numero;
			}
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println();
		System.out.println("O menor valor lido é: " + menor);
		System.out.println("O maior valor lido é: " + maior);
		System.out.println("A soma dos números és: " + soma);
		sc.close();
	}
}