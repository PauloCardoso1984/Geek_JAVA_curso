package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Radianos_Angulos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		double PI = 3.14;
		
		System.out.println("Faça um programa que leia um determinado Radianos e trasnforme em Ângulo.");
		System.out.println();
		
		System.out.print("Digite o valor do radiano: ");
		float radiano = sc.nextFloat();
		
		double angulo = radiano * 180 / PI;

		System.out.println("O valor do ângulo é de " + radiano);
		// SUBSTITUI PARA printf E COLOQUEI  %.4f%n PARA DELIMITAR 4 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O valor do radianos será de, %.4f%n", angulo);
		
		sc.close();
	}
}
