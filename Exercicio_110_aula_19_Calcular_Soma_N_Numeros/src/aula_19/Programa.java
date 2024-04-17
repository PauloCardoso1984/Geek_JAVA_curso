package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um número inteiro positivo N e calcule a soma \n"
				+ "dos n primeiros números naturais.");
		System.out.println();

		int soma = 0;
		
		System.out.print("Entre com um número: ");
		int N = sc.nextInt();

		for (int i = 0; i <= N; i ++) {
			soma += i;
				System.out.print(i + " - ");
			}		 
		System.out.println();
		System.out.println();
		System.out.println("A soma dos números naturais são de 0 a " + N + " é: " + soma);
		sc.close();
	}
}