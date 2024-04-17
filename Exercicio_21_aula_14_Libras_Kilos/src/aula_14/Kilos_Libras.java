package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Kilos_Libras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia uma determinada massa em Libras \n"
				+ "e apresente convertido em Quilogramas.");
		System.out.println();
		
		System.out.print("Digite o valor em Libras: ");
		double libras = sc.nextDouble();
		
		double quilograma = libras * 0.45;

		System.out.println("O valor da massa em Libras é de " + libras);
		// SUBSTITUI PARA printf E COLOQUEI  %.2f%n PARA DELIMITAR 2 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O valor transformado em Quilograma será de, %.2f%n", quilograma);
		
		sc.close();
	}
}
