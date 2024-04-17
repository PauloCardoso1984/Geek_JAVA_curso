package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Kelvin_Celsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia a temperatura em Kelvin e transforme em Celsius.");
		System.out.println();
		
		System.out.print("Digite a temperatura em Kelvin: ");
		float kelvin = sc.nextFloat();
		
		double celsius = kelvin - 273.15;

		System.out.println("A temperatura em Kelvin é " + kelvin);
		System.out.printf("A temperatura transformada em Celsius é, " + celsius);
		
		sc.close();
	}
}
