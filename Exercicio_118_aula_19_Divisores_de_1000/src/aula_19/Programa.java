package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Faça um programa que some todos os números naturais abaixo de 1000 que são múltiplos de 3 ou 5.");
		System.out.println();

		int soma = 0;
		int quantidadeDivisores = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				soma += i;
				quantidadeDivisores++;
				System.err.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Quantidade de divisores   : " + quantidadeDivisores);
		System.out.println("Soma de todos os divisores: " + soma);
	}
}