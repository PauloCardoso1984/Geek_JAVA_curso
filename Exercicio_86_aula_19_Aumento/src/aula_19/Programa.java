package aula_19;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Um produto vai sofrer aumento de acordo com a tabela abaixo. \n"
				+ "Leia o preço antigo, calcule e escreva o preço atualizado, e escreva a \n"
				+ ""
				+ "\n"
				+ "*PREÇO ANTIGO 		*PERCENTUAL DE AUMENTO \n"
				+ "até R$ 50			5%\n"
				+ "entre R$ 50 e R$ 100		10%\n"
				+ "acima de R$ 100			15%");
		System.out.println();

		System.out.print("Qual o valor do produto? ");
		double valor = sc.nextDouble();
		
		// FAZENDO AS VERIFICAÇÕES
		if (valor < 50 ) {
			double pagar = valor + (valor * 0.05);
			System.out.println("Valor antigo R$ " + valor);
			System.out.println("Valor atualizado R$ " + pagar);
		}
		if (valor >= 50 && valor <= 100 ) {
			double pagar = valor + (valor * 0.10);
			System.out.println("Valor antigo R$ " + valor);
			System.out.println("Valor atualizado R$ " + pagar);
		}
		if (valor > 100 ) {
			double pagar = valor + (valor * 0.15);
			System.out.println("Valor antigo R$ " + valor);
			System.out.println("Valor atualizado R$ " + pagar);
		}
        sc.close();
    }
}