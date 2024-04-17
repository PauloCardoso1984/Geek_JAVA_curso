package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Centimetro_Polegada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia um determinado em Centímetros e transforme em Polegadas.");
		System.out.println();
		
		System.out.print("Digite o valor do Centímetros: ");
		double centimetro = sc.nextDouble();
		
		double polegada = centimetro / 2.54;

		System.out.println("O valor em Centímetro é de " + centimetro);
		// SUBSTITUI PARA printf E COLOQUEI  %.2f%n PARA DELIMITAR 2 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O valor transformado em Polegadas será de, %.2f%n", polegada);
		
		sc.close();
	}
}
