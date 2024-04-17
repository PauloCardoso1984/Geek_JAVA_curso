package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit_Celsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia a temperatura em Fahrenheit e transforme em Celsius.");
		System.out.println();
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		float fahrenehit = sc.nextFloat();
		
		float celsius = 5 * (fahrenehit - 32) / 9;

		System.out.println("A temperatura em Fahrenheit é " + fahrenehit);
		System.out.printf("A temperatura transformada em Celsius é, " + celsius);
		
		sc.close();
	}
}
