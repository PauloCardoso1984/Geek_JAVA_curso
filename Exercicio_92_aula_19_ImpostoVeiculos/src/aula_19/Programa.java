package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("O custo ao consumidor de um carro novo é a soma do custo de fábrica, da comissão \n"
				+ "do distribuidor e dos impostos. A comissão e os impostos são calculados sobre o custo de \n"
				+ "fábrica. Leia o custo e escreva o custo ao consumidor.\n"
				+ "*CUSTO DE FÁBRICA		*% DISTRIBUIDOR		*% IMPOSTOS\n"
				+ "<= R$ 12.000,00			5%			isento\n"
				+ ">R$ 12.000,,0 <= R$ 25.000,00	10%			15%\n"
				+ "> R$ 25.000,00			15%			20%");
		System.out.println();
		
		System.out.print("Qual o valor da produção do carro? R$ ");
		double valorProdução = sc.nextDouble();
		
		// CALCULADO O VALOR
		if (valorProdução < 12000) {
			double valorPagar = valorProdução + (valorProdução * 0.05);
			System.out.printf("Valor da produção do veiculo em fábrica: R$ %.2f%n", valorProdução);
			System.out.printf("Valor pago após a comissão e os impostos: R$ %.2f%n", valorPagar);
		}
		else if (valorProdução >= 12000 && valorProdução <= 25000) {
			double valorPagar = valorProdução + (valorProdução * 0.10) + (valorProdução * 0.15);
			System.out.printf("Valor da produção do veiculo em fábrica: R$ %.2f%n", valorProdução);
			System.out.printf("Valor pago após a comissão e os impostos: R$ %.2f%n", valorPagar);
		}
		else if (valorProdução > 25000) {
			double valorPagar = valorProdução + (valorProdução * 0.15) + (valorProdução * 0.20);
			System.out.printf("Valor da produção do veiculo em fábrica: R$ %.2f%n", valorProdução);
			System.out.printf("Valor pago após a comissão e os impostos: R$ %.2f%n", valorPagar);
		}	
		sc.close();
	}
}