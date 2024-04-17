package aula_19;

import java.util.Scanner;

public class CompararNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa para ler dois números e mostre qual é o maior.");
		System.out.println();
		
		System.out.print("Digite o 1º número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Digite o 1º número: ");
		int numero2 = sc.nextInt();
		
		// COMPARANDO
		if (numero1 < numero2) {
			System.out.println("O número " + numero2 + " é o maior.");
		} if (numero1 > numero2) {
			System.out.println("O numero " + numero1 + " é o maior.");
		} if (numero1 == numero2) {
			System.out.println("O números " + numero1 + " e " + numero2 + " são iguais.");
		}
    }
}