package aula_19;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que receba altura e peso, depois classifique em: \n"
				+ " A = 1.20 e 60  /  B = 1.20 a 1.70 e 60 \n" + " C = + 1.70 e 60 / D = 1.20 e 60 a 90 \n"
				+ " E = 1.20 a 1.70 e 60 a 90 / F = + 1.70 e 60 a 90 \n"
				+ " G = 1.20 e + 90 / H = 1.20 a 1.70 e + 90 / I = + 1.7 e + 90");
		System.out.println();

		System.out.println("Saiba sua categoria digitando as seguintes informações: ");

		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();

		System.out.print("Digite o peso: ");
		double peso = sc.nextDouble();

		// TABELA
		if (altura < 1.20 && peso <= 60) {
			System.out.println("Pertence ao grupo A");
		} 
		else if (altura < 1.20 && peso >= 60 && peso <= 90) {
			System.out.println("Pertence ao grupo D");
		} 
		else if (altura < 1.20 && peso > 90) {
			System.out.println("Pertence ao grupo G");
		} 
		else if (altura >= 1.20 && altura <= 1.70 && peso <= 60) {
			System.out.println("Pertence ao grupo B");
		} 
		else if (altura >= 1.20 && altura <= 1.70  && peso >= 60 && peso <= 90) {
			System.out.println("Pertence ao grupo E");
		} 
		else if (altura >= 1.20 && altura <= 1.70  && peso > 90) {
			System.out.println("Pertence ao grupo H");
		}		
		else if (altura > 1.70 && peso < 60) {
			System.out.println("Pertence ao grupo C");
		}
		else if (altura > 1.70 && peso >= 60 & peso <= 90) {
			System.out.println("Pertence ao grupo F");
		}
		else if (altura > 1.70  && peso > 90) {
			System.out.println("Pertence ao grupo I");
		}
		sc.close();
	}
}
