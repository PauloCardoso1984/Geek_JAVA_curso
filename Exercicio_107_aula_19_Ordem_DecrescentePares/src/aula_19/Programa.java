package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um número inteiro positivo N e imprima todos os números \n"
				+ "naturais pares de 0 até N em ordem decrescente.");
		System.out.println();

		System.out.print("Entre com um número: ");
		int N = sc.nextInt();

		for (int i = N; i >= 0; i --) {
			if (i % 2 == 0) {
				System.out.println(i);
			}		}
		sc.close();
	}
}