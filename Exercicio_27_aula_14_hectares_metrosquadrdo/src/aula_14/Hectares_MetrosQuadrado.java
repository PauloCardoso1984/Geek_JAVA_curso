package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Hectares_MetrosQuadrado {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Fazer um programa para ler um valor em Hectares e transformar em Metros Quadrados");
		System.out.println();
		
		System.out.print("Digite o valor em Hectares: ");
		double hectares = sc.nextDouble();
		
		double metrosquadrado = hectares * 10000;
		
		System.out.println("O valor digitado em Hectares é de: " + hectares);
		// AO COLOCAR %.4f%n SERÁ IMPRESSO APENAS 4 CASAS APÓS A VÍRGULA
		System.out.printf("O valor trasnformado em Metros Quadrados será de: %.4f%n", metrosquadrado);
		
		sc.close();
	}
}
