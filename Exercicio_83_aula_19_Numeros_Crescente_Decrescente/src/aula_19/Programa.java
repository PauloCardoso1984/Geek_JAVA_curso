package aula_19;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que receba três números inteiros e mostre-os, na ordem digitada, \n"
				+ "crescente e decrescente");
		System.out.println();

		System.out.print("Digite o 1º número: ");
		int numero1 = sc.nextInt();

		System.out.print("Digite o 2º número: ");
		int numero2 = sc.nextInt();

		System.out.print("Digite o 3º número: ");
		int numero3 = sc.nextInt();

		// Mostra os números na ordem digitada
		System.out.println(" Números digitados: " + numero1 + ", " + numero2 + ", " + numero3);
		System.out.println();
		
		// Ordena os números em ordem crescente e mostra
		int[] numerosCrescente = { numero1, numero2, numero3 };
		Arrays.sort(numerosCrescente);
		System.out.print(" Números em ordem crescente: " + numerosCrescente[0] + ", " + numerosCrescente[1] + ", "
				+ numerosCrescente[2] + " \n Números em ordem decrescente: ");

		// Ordena os números em ordem decrescente e mostra
		int[] numerosDecrescente = { numero1, numero2, numero3 };
		Arrays.sort(numerosDecrescente);
		for (int i = 2; i >= 0; i--) {
			System.out.print(numerosDecrescente[i]);
			if (i > 0) {
				System.out.print(", ");
			}
		}

	}
}
