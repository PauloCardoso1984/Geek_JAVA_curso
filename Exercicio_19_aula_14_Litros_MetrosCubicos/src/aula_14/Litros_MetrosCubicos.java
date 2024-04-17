package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Litros_MetrosCubicos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia um determinado em Litros e transforme em Metros Cúbicos.");
		System.out.println();
		
		System.out.print("Digite o valor em Litros: ");
		double litros = sc.nextDouble();
		
		double metroscubico = litros / 1000;

		System.out.println("O valor em Litros é de " + litros);
		// SUBSTITUI PARA printf E COLOQUEI  %.2f%n PARA DELIMITAR 2 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O valor transformado em Metros Cúbicos será de, %.2f%n", metroscubico);
		
		sc.close();
	}
}
