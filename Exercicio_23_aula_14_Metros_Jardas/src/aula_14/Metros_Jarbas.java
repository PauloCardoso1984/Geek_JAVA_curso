package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Metros_Jarbas {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Fazer um programa para ler um valor em Metros e transformar em Jardas");
		System.out.println();
		
		System.out.print("Digite o valor em Metros: ");
		double metros = sc.nextDouble();
		
		double jardas = metros / 0.91;
		
		System.out.println("O valor digitado em Metros é de: " + metros);
		// AO COLOCAR %.4f%n SERÁ IMPRESSO APENAS 4 CASAS APÓS A VÍRGULA
		System.out.printf("O valor trasnformado em Jardas será de: %.4f%n", jardas);
		
		sc.close();
	}
}
