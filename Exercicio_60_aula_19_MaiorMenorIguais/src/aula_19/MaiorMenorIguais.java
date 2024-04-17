package aula_19;

import java.util.Scanner;

public class MaiorMenorIguais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Leia um número fornecido pelo usuário. Verificar qual é o maior e se for \n"
				+ "iguais imprimir que são iguais.");
		System.out.println();

		System.out.print("Digite o 1º número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Digite o 2º número: ");
		int numero2 = sc.nextInt();
		
		// VERIFICAÇÃO
		if (numero1 < numero2) {
			System.out.println("Maior número é " + numero2);
		} 
		if (numero1 > numero2) {
			System.out.println("Maior número é " + numero1);
		}
		if (numero1 == numero2) {
			System.out.println("Os números " + numero1 + " e " + numero2 + " são iguais.");	
		}
		sc.close();
	}
}