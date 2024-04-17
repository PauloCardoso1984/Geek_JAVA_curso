package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia três números inteiros positivos e efetue o calculo \n"
				+ "de uma das seguintes médias de acordo com um valor numérico digitado pelo usuário. \n"
				+ "* GEOMÉTRICA, \n"
				+ "* PONDERADA, \n"
				+ "* HARMONICA, \n"
				+ "* ARITMÉTICA.");
		System.out.println();

		System.out.println("Digite 03 números");
		System.out.print("Digite o 1º número: ");
		double a = sc.nextDouble();
		System.out.print("Digite o 2º número: ");
		double b = sc.nextDouble();
		System.out.print("Digite o 3º número: ");
		double c = sc.nextDouble();
		
		// CALCULOS 
		// GEOMÉTRICA
		double geometrica = Math.cbrt(a * b * c);
		
		// PONDERADA
		double ponderada = (a + ( 2 * b) + ( 3 * c )) / 6;
		
		// HARMONICO
		double harmonico = 1 / ((1/a) + (1/b) + (1/c));
		
		// ARITMÉTICA
		double aritmetica = (a + b + c ) / 3;
		
		System.out.println();
		System.out.println("RESULTADOS");
		System.out.printf("GEOMÉTRICO:	%.2f%n", geometrica);
		System.out.printf("PONDERADA:	%.2f%n", ponderada);
		System.out.printf("HARMÔNICA:	%.2f%n", harmonico);
		System.out.printf("ARITMÉTICA:	%.2f%n", aritmetica); 
		sc.close();
	}
}
