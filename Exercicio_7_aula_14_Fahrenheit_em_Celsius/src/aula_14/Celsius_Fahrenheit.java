package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Celsius_Fahrenheit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia a temperatura em Celsius e transforme em Fahrenheit.");
		System.out.println();
		
		System.out.print("Digite a temperatura em Celsius: ");
		float celsius = sc.nextFloat();
		
		float fahrenehit = (celsius * 9/5) + 32;

		System.out.println("A temperatura em Celsius é " + celsius);
		System.out.printf("A temperatura transformada em Fahrenheit é, " + fahrenehit);
		
		sc.close();
	}
}
