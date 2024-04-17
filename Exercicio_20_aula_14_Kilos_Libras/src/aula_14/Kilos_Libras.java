package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Kilos_Libras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia uma determinada massa eom Quilogramas \n"
				+ "e apresente convertido em Libras.");
		System.out.println();
		
		System.out.print("Digite o valor em Quilogramas: ");
		double quilograma = sc.nextDouble();
		
		double libras = quilograma / 0.45;

		System.out.println("O valor da massa em Quilograma é de " + quilograma);
		// SUBSTITUI PARA printf E COLOQUEI  %.5f%n PARA DELIMITAR 5 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O valor transformado em Libras será de, %.5f%n", libras);
		
		sc.close();
	}
}
