package calculo;

import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		System.out.println("Faça um programa para calcular as seguintes sequencias:"
				+ "1 + 2 + 3 + 4 + 5 + ... + N");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int n, soma = 0;
		
		System.out.print("Qual o número que irá testar: ");
		n = sc.nextInt();

		System.out.print("Sequência de 1 até " + n + " é: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " - ");
			soma += i;
		}
		System.out.println();
	
		System.out.println("O valor da série para o " + n + " termos é: " + soma);
	}

}        






