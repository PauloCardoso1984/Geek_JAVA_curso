
package calculo;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		System.out.println(
				"Faça um algoritmo que converta uma velocidade expressa em km/h em m/s e "
				+ "vice versa. Você deve criar um menu com as duas opções de conversão e "
				+ "com uma opçaõ para finalizar o programa. O usuário poderá fazer "
				+ "quantas conversões deseja, sendo que o programa só será finalizado quando "
				+ "a opção de finalizar for escolhida.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int opcao = 0;

		while (opcao != 3) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Converter de km/h para m/s");
			System.out.println("2 - Converter de m/s para km/h");
			System.out.println("3 - Finalizar o programa");
			System.out.print("Digite a opção: ");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite a velocidade em km/h: ");
				double velocidadeKmh = sc.nextDouble();
				double velocidadeMs = velocidadeKmh / 3.6;
				System.out.println(velocidadeKmh + " km/h é equivalente a " + velocidadeMs + " m/s");
				System.out.println();
				break;
			case 2:
				System.out.print("Digite a velocidade em m/s: ");
				double velocidadeMs2 = sc.nextDouble();
				double velocidadeKmh2 = velocidadeMs2 * 3.6;
				System.out.println(velocidadeMs2 + " m/s é equivalente a " + velocidadeKmh2 + " km/h");
				System.out.println();
				break;
			case 3:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Digite novamente.");
			}
		}

		sc.close();
	}
}