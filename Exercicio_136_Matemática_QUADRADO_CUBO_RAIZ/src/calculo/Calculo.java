package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um número indeterminado de idades de indivíduos "
				+ "(pare quando for informada a idade 0 ou negativa), e calcule a média desse grupo. "
				+ "E informe quantas pessoas foram adicionadas e de qual sexo (masculino ou feminino)");
		System.out.println();

		Scanner input = new Scanner(System.in);

		int idade;
		int totalIdades = 0;
		int quantidadeIndividuos = 0;
		int totalHomens = 0;
		int totalMulheres = 0;

		do {
			System.out.print("Digite as idades dos indivíduos (para parar, digite 0 ou um número negativo): ");

			idade = input.nextInt();

			if (idade > 0) {
				totalIdades += idade;
				quantidadeIndividuos++;

				System.out.print("Digite o sexo do indivíduo (M para masculino, F para feminino): ");
				char sexo = input.next().charAt(0);

				if (sexo == 'M') {
					totalHomens++;
					System.out.println();
				} else if (sexo == 'F') {
					totalMulheres++;
					System.out.println();
				} else {
					System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
				}
			}

		} while (idade > 0);

		if (quantidadeIndividuos == 0) {
			System.out.println("Nenhum indivíduo foi mencionado.");
		} else {
			System.out.println();
			double media = (double) totalIdades / quantidadeIndividuos;
			System.out.println("Média de idade do grupo: " + media);
			System.out.println("Total de indivíduos: " + quantidadeIndividuos);
			System.out.println("Total de homens: " + totalHomens);
			System.out.println("Total de mulheres: " + totalMulheres);
		}

		input.close();
	}
}