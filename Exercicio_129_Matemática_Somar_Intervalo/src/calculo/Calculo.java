package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println(
				"EM JAVA, Faça um programa que some os números impares contidos em um intervalo definido pelo usuário. "
						+ "O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar todos os "
						+ "números impares contidos neste intervalo. Caso o usuário digite um intervalo inválido "
						+ "(começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela. "
						+ "Intervalo de valores inválidos\" e o programa reinicia.");
		System.out.println();

		Scanner scan = new Scanner(System.in);
		int valorInicial, valorFinal, soma = 0;

		while (true) {
			System.out.print("Digite o valor inicial do intervalo: ");
			valorInicial = scan.nextInt();
			
			System.out.print("Digite o valor final do intervalo: ");
			valorFinal = scan.nextInt();

			if (valorInicial > valorFinal) {	
				System.out.println("Intervalo de valores inválidos");
				System.out.println();
				continue;
			}
			for (int i = valorInicial; i <= valorFinal; i++) {
				if (i % 2 != 0) { // verifica se o número é ímpar
					soma += i;
				}				
			}
			System.out.println();
			System.out.println("A soma dos números ímpares no intervalo é: " + soma);

			break;
		}	
	}
}