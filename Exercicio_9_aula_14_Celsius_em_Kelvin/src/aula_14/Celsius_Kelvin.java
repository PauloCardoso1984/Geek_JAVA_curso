package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Celsius_Kelvin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia a temperatura em Celsius e transforme em Kelvin.");
		System.out.println();
		
		System.out.print("Digite a temperatura em Celsius: ");
		float celsius = sc.nextFloat();
		
		double kelvin = celsius + 273.15;

		System.out.println("A temperatura em Celsius é " + celsius);
		// SUBSTITUI PARA printf E COLOQUEI  %.4f%n PARA DELIMITAR 4 CASAS DEPOIS DA VÍRCULA
		System.out.printf("A temperatura transformada em Kelvin é, %.4f%n", kelvin);
		
		sc.close();
	}
}
