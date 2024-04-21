package calculo;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		System.out.println(
				"Faça um programa que leia vários números, e calcule e mostre: \n "
				+ "a) A soma dos números digitados, \n "
				+ "b) A qauntidade de números digitados, \n"
				+ "c) A média dos números digitados, \n"
				+ "d) O amior número digitado, \n"
				+ "e) O menor número digitado, \n"
				+ "f) A média dos cumeros pares, \n"
				+ "g) A média dos números impares. \n"
				+ "Finalize a entrada de dados caso o usuário informe uma letra qualquer.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int numero;
		int soma = 0;
		int quantidade = 0;
		int quantidadePares = 0;
		int somaPares = 0;
		int quantidadeImpares = 0;
		int somaImpares = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.println("Digite os números (Digite uma letra qualquer para sair): ");

		while (sc.hasNextInt()) {
			numero = sc.nextInt();

			soma += numero;
			quantidade++;

			if (numero % 2 == 0) {
				quantidadePares++;
				somaPares += numero;
			} else {
				quantidadeImpares++;
				somaImpares += numero;
			}

			if (numero > maior) {
				maior = numero;
			}

			if (numero < menor) {
				menor = numero;
			}
		}

		double media = (double) soma / quantidade;
		double mediaPares = (double) somaPares / quantidadePares;
		double mediaImpares = (double) somaImpares / quantidadeImpares;

		System.out.println("a) Soma dos números digitados: " + soma);
		System.out.println("b) Quantidade de números digitados: " + quantidade);
		System.out.println("c) Média dos números digitados: " + String.format("%.2f", media));
		System.out.println("d) Maior número digitado: " + maior);
		System.out.println("e) Menor número digitado: " + menor);
		System.out.println("f) Média dos números pares: " + String.format("%.2f", mediaPares));
		System.out.println("g) Média dos números ímpares: " + String.format("%.2f", mediaImpares));

		sc.close();
	}
}