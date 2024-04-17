package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Angulos_Radianos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		double PI = 3.14;
		
		System.out.println("Faça um programa que leia um determinado Ãngulos e trasnforme em Radianos.");
		System.out.println();
		
		System.out.print("Digite o valor do ângulo: ");
		float angulo = sc.nextFloat();
		
		double radianos = angulo * PI / 180;

		System.out.println("O valor do ângulo é de " + angulo);
		// SUBSTITUI PARA printf E COLOQUEI  %.4f%n PARA DELIMITAR 4 CASAS DEPOIS DA VÍRCULA
		System.out.printf("O valor do radianos será de, %.4f%n", radianos);
		
		sc.close();
	}
}
