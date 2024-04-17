package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Esvreva um algoritmo que leia certa quantidade de números e imprima o maior deles e quantas vezes o \n"
				+ "maior número foi lido. A quantidade de números a serem lidos deve ser fornecida pelo usuário.");
		System.out.println();

		System.out.print("Digite a quantidade de números a serem lidos: ");
		int quantidadeNumeros = sc.nextInt();

		//Em resumo, a constante Integer.MIN_VALUE serve como uma referência para o valor mínimo possível de um objeto 
		// inteiro em Java, sendo útil em diversas situações em que precisamos trabalhar com valores inteiros.
		int numero, maiorNumero = Integer.MIN_VALUE;
		int contador = 0;

		for (int i = 1; i <= quantidadeNumeros; i++) {
			System.out.print("Digite o número: " + i + "º número: ");
			numero = sc.nextInt();

			if (numero > maiorNumero) {
				maiorNumero = numero;
				contador = 1;
			} else if (numero == maiorNumero) {
				contador++;
			}
		}
		System.out.println();
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Quantidade de vezes que o maior número foi lido: " + contador);

		sc.close();
	}
}