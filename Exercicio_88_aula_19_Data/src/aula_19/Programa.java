package aula_19;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa que, dado o valor da venda immprima a comissão. \n"
				+ "VENDA MENSAL				*COMISSÃO\n"
				+ "+= R$ 100.000,00			R$ 700,00 + 16% das vendas \n"
				+ "- R$ 100.000,00	+ 80.000,00		R$ 650,00 + 14% das vendas \n"
				+ "- R$ 80.000,00 + 60.000,00		R$ 600,00 + 14% das vendas \n"
				+ "- R$ 60.000,00 + 40.000,00		R$ 550,00 + 14% das vendas \n"
				+ "- R$ 40.000,00 + 20.000,00		R$ 500,00 + 14% das vendas \n"
				+ "- R$ 20.000,000				R$ 400,00 + 14% das vendas");
		System.out.println();
		
		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Qual o valor total de venda R$ ");
		double valor = sc.nextDouble();
		
		// VERIFICAÇÃO
		if (valor > 100.000) {
			double pagar = 700.0 + (valor / 100 * 16);
			System.out.println(nome + " você receberá R$ " + pagar + " PARABÉNS");
		}
		else if (valor >= 100.000 && valor <= 80.000) {
			double pagar = 650.0 + (valor * 0.14);
			System.out.println(nome + " você receberá R$ " + pagar + " MUITO BOM");
		}
		else if (valor > 80.000 && valor <= 60.000) {
			double pagar = 600.0 + (valor * 0.14);
			System.out.println(nome + " você receberá R$ " + pagar + " BOM");
		}
		else if (valor > 60.000 && valor <= 40.000) {
			double pagar = 550.0 + (valor * 0.14);
			System.out.println(nome + " você receberá R$ " + pagar + " PRECISA MELHORAR");
		}
		else if (valor > 40.000 && valor <= 20.000) {
			double pagar = 500.0 + (valor * 0.14);
			System.out.println(nome + " você receberá R$ " + pagar + " MUITO RUIM");
		}
		else if (valor <= 20.000) {
			double pagar = 400.0 + (valor * 0.14);
			System.out.println(nome + " você receberá R$ " + pagar + " PÉSSIMO");
		}
		sc.close();
    }
}

