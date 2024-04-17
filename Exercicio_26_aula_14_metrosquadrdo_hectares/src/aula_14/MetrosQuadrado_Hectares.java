package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class MetrosQuadrado_Hectares {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Fazer um programa para ler um valor em Metros Quadrados e transformar em Hectares");
		System.out.println();
		
		System.out.print("Digite o valor em Metros Quadrados: ");
		double metrosquadrado = sc.nextDouble();
		
		double hectares = metrosquadrado * 0.0001;
		
		System.out.println("O valor digitado em Metros Quadrados é de: " + metrosquadrado);
		// AO COLOCAR %.4f%n SERÁ IMPRESSO APENAS 4 CASAS APÓS A VÍRGULA
		System.out.printf("O valor trasnformado em Hectares será de: %.4f%n", hectares);
		
		sc.close();
	}
}
