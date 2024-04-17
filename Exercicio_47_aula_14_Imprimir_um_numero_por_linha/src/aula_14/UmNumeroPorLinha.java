package aula_14;

import java.util.Scanner;

public class UmNumeroPorLinha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um número inteiro positivo em imprima de \n"
				+ "1 até o número e do número até 0.");
		System.out.println();

		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		int numero = n;
		System.out.println("Numeros de 1 a " + n + ":"); // + é o operador de concatenação de strings
		
		for (int i = 0; i <= n; i++)
			System.out.println(i);
		System.err.println();
		System.out.println("Numeros inversos de valor digitado até 0:");
		for (int i = n; i >= 0; i--)
			System.out.println(i);
		System.out.println();
		sc.close();
    }
}