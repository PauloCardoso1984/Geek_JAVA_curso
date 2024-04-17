package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba os valor dos catetos A e B e informe a Hipotenusa.");
		System.out.println();
		
		System.out.print("Digite o valor do cateto A: ");
		double catetoA = sc.nextDouble();
		
		System.out.print("Digite o valor do cateto B: ");
		double catetoB = sc.nextDouble();

		// MÉTODO OBTER O RESULTADO
		double hipotenusa =  Math.sqrt((Math.pow(catetoA, 2) + Math.pow(catetoB, 2)));
		
		System.out.println("Valor digitado do cateto A foi: " + catetoA + " cateto B: " + catetoB);
		// DESTA FORMA IMPRIMIRÁ 2 CASAS APÓS A VÍRGULA
		System.out.printf("Valor da hipotenusa é de: %.2f%n ", hipotenusa);
		sc.close();
	}
}
