package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Numero_Real_5_parte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia um número real e imprima a quinta parte do mesmo.");
		System.out.println();
		
		System.out.print("Digite o número: ");
		float x = sc.nextFloat();
		
		float quinta_parte = x / 5;

		System.out.println("O número digitado foi " + x);
		// SUBSTITUI PARA printf E COLOQUEI  %.4f%n PARA DELIMITAR 4 CASAS DEPOIS DA VÍRCULA
		System.out.printf("A quinta parte deste número é igual a: %.4f%n", quinta_parte);
		
		sc.close();
	}
}
