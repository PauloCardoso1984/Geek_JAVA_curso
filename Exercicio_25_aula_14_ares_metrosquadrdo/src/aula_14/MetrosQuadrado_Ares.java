package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class MetrosQuadrado_Ares {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Fazer um programa para ler um valor em Acres e transformar em Metros Quadrado");
		System.out.println();
		
		System.out.print("Digite o valor em Acres: ");
		double acres = sc.nextDouble();
		
		double metrosquadrado = acres * 4048.58;
		
		System.out.println("O valor digitado em Acres é de: " + acres);
		// AO COLOCAR %.4f%n SERÁ IMPRESSO APENAS 4 CASAS APÓS A VÍRGULA
		System.out.printf("O valor trasnformado em Metros Quadrado será de: %.4f%n", metrosquadrado);
		
		sc.close();
	}
}
