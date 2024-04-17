package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Elabore um programa que faça leitura de vários números inteiros, até "
				+ "que seja digitado 0 ou numero negativo. O progrma tem que retornar o maior o"
				+ " menor e a relação de numeros digitados.");
		System.out.println();
		
		Scanner input = new Scanner(System.in);

		int numero;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		String numerosDigitados = "";

		System.out.println("Digite uma sequência de números inteiros (para parar, digite 0 ou um número negativo): ");

		do {
			// Lê o número inteiro digitado pelo usuário
			numero = input.nextInt();

			// Verifica se o número é maior que o maior número encontrado até agora
			if (numero > maior && numero > 0) {
				maior = numero;
			}

			// Verifica se o número é menor que o menor número encontrado até agora
			if (numero < menor && numero > 0) {
				menor = numero;
			}

			// Adiciona o número à sequência de números digitados
			if (numero > 0) {
				numerosDigitados += numero + " ";
			}

		} while (numero > 0);

		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("Números digitados: " + numerosDigitados);

		input.close();
	}
}