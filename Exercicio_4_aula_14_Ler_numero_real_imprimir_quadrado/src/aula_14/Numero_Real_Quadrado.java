package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Numero_Real_Quadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia um número real e imprima o quadrado do mesmo.");
		System.out.println();
		
		System.out.print("Digite o número: ");
		float x = sc.nextFloat();

		// 02 MANEIRAS DE ELEVAR UM NÚMERO AO QUADRADO
//		float quadrado = x * x; 
		double quadrado = Math.pow(x, 2);

		System.out.println("O número digitado foi " + x);
		// SUBSTITUI PARA printf E COLOQUEI  %.4f%n PARA DELIMITAR 4 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O quadrado deste número é igual a: %.4f%n", quadrado);
		
		sc.close();
	}
}
