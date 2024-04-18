package calculo;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(
				"Leia um número positivo do usuário, então, calcule e imprima a sequencia "
				+ "Fibonacci até o priemeiro número superior do numero lido.");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número positivo: ");
		int numero = sc.nextInt();

		int num1 = 0, num2 = 1, proximo = 0;

		System.out.print("Sequência de Fibonacci até o primeiro número superior a " + numero + ":");

		while (proximo <= numero) {
			if (proximo == 0) {
				System.out.print(num1 + " ");
			} else {
				System.out.print(proximo + " ");
			}
			num1 = num2;
			num2 = proximo;
			proximo = num1 + num2;
		}

		System.out.println();
		sc.close();
	}
}
