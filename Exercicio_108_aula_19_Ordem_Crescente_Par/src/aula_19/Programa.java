package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um número inteiro positivo impar N e imprima todos os números \n"
				+ "naturais impares de 1 até N em ordem crescente.");
		System.out.println();

		System.out.print("Entre com um número: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i += 2) {
				System.out.println(i);
			}		
		sc.close();
	}
}