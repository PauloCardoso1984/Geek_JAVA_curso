package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Polegadas_Centimetro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia um determinado em Polegadas e transforme em Centímetro.");
		System.out.println();
		
		System.out.print("Digite o valor do radiano: ");
		double polegada = sc.nextDouble();
		
		double centimetro = polegada * 2.54;

		System.out.println("O valor em Polegada é de " + polegada);
		// SUBSTITUI PARA printf E COLOQUEI  %.4f%n PARA DELIMITAR 2 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O valor transformado em Centímetro será de, %.2f%n", centimetro);
		
		sc.close();
	}
}
