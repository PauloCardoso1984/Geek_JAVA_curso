package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class MetrosCubicos_Litros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia um determinado em Metros Cúbicos e transforme em Litros.");
		System.out.println();
		
		System.out.print("Digite o valor do Metros Cúbico: ");
		double metroscubico = sc.nextDouble();
		
		double litros = metroscubico * 1000;

		System.out.println("O valor em Metros Cúbicos é de " + metroscubico);
		// SUBSTITUI PARA printf E COLOQUEI  %.2f%n PARA DELIMITAR 2 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O valor transformado em Litros será de, %.2f%n", litros);
		
		sc.close();
	}
}
