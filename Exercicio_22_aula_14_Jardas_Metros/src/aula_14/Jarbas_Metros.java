package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Jarbas_Metros {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Fazer um programa para ler um valor em Jardas e transformar em metros");
		System.out.println();
		
		System.out.print("Digite o valor em Jardas: ");
		double jardas = sc.nextDouble();
		
		double metros = jardas * 0.91;
		
		System.out.println("O valor digitado em Jardas é de: " + jardas);
		// AO COLOCAR %.2f%n SERÁ IMPRESSO APENAS 2 CASAS APÓS A VÍRGULA
		System.out.printf("O valor trasnformado em Metros será de: %.2f%n", metros);
		
		sc.close();
	}
}
