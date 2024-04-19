package calculo;

import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {
		System.out.println("Um funcionário recebe aumento anual. Em 1995 foi contratado por "
				+ "R$ 2000,00. Em 1996 recebeu aumento de 0,5%. A partir de 1997, os aumentos "
				+ "sempre correspondem o dobro do ano anterior. Faça um programa que determine "
				+ "o salário até a data digitada pelo usuário.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		double salario = 2000.0;

		System.out.print("Digite o ano desejado: ");
		int anoDesejado = sc.nextInt();

		int ano = 1996;
		double aumento = 0.5;

		while (ano <= anoDesejado) {
			salario += (salario * aumento / 100);
			System.out.printf("Salário em %d: R$ %.2f%n ", ano, salario);
			aumento *= 2;
			ano++;
		}

		sc.close();
	}
}