package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Leia a distância em Km e a quantidade de litros de gasolina consumidos por um carro \n"
				+ "em um percurso, calcule o consumo em Km/l e escreva uma mensagem. \n"
				+ "* Menor de 8 → VENDA O CARRO, \n"
				+ "* Entre 8 e 14 → ECONÔMICO, \n"
				+ "* Maior que 12 → SUPER ECONÔMICO.");
		System.out.println();

		System.out.print("Quantos Km percorrido: ");
		double km = sc.nextDouble();
		
		System.out.print("Quantos Litros gastos: ");
		double litros = sc.nextDouble();
		
		// CALCULANDO O CONSUMO
		double consumo = km / litros;
		
		if (consumo < 8 ) {
			System.out.println("Consumo muito alto.");
			System.out.println("VENDA O CARRO.");
		}
		if (consumo >= 8 && consumo <= 14) {
			System.out.println("Consumo razoável.");
			System.out.println("CARRO ECONÔMICO.");
		}
		if (consumo >= 12) {
			System.out.println("Consumo perfeito.");
			System.out.println("CARRO SUPER ECONÔMICO.");
		}		
		sc.close();
	}
}
