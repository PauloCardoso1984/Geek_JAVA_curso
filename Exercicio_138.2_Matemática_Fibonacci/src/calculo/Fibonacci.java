
package calculo;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um número indeterminado de idades de indivíduos "
				+ "(pare quando for informada a idade 0 ou negativa), e calcule a média desse grupo.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com um número positivo:");
		int n = scanner.nextInt();

		if (n <= 0) {
			System.out.println("Por favor, entre com um número positivo.");
		}

		int a = 0, b = 1, c;
		System.out.println("A sequência de Fibonacci até o primeiro número superior a " + n + " é:");
		while (a <= n) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

		System.out.println();
		scanner.close();
	}
}