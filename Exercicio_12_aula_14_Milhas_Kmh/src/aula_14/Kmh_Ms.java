package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Kmh_Ms {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia uma velocidade em Milhas para Km/h.");
		System.out.println();
		
		System.out.print("Digite a velocidade en milhas: ");
		float milhas = sc.nextFloat();
		
		double kmh = milhas *  1.61;

		System.out.println("A velocidade em milhas é " + milhas);
		// SUBSTITUI PARA printf E COLOQUEI  %.4f%n PARA DELIMITAR 4 CASAS DEPOIS DA VÍRCULA
		System.out.printf("A velocidade em Km/h é, %.4f%n", kmh);
		
		sc.close();
	}
}
