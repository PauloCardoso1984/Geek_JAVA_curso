package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Kmh_Ms {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia uma velocidade em Km/h para m/s.");
		System.out.println();
		
		System.out.print("Digite a velovidade en Km/h: ");
		float kmh = sc.nextFloat();
		
		double ms = kmh / 3.6;

		System.out.println("A velocidade em Km/h é " + kmh);
		// SUBSTITUI PARA printf E COLOQUEI  %.4f%n PARA DELIMITAR 4 CASAS DEPOIS DA VÍRCULA
		System.out.printf("A velocidade em m/s é, %.4f%n", ms);
		
		sc.close();
	}
}
