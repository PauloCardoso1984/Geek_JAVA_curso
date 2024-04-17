package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Trapezio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que calcule e mostre a área e perímetro de um \n"
				+ "trapezio. Lembre-se as bases devem ser maior que 0.");
		System.out.println();

		CalcularTrapezio trapezio = new CalcularTrapezio();
		
		System.out.print("Digite a Base Maior: ");
		trapezio.baseMaior = sc.nextDouble();
		
		if (trapezio.baseMaior < 0) {
			System.out.println("Numero apenas maior que 0.");
			sc.close();
		}		
		System.out.print("Digite a Base Menor: ");
		trapezio.baseMenor = sc.nextDouble();
		if (trapezio.baseMenor < 0) {
			System.out.println("Numero apenas maior que 0.");
			sc.close();
		}
		System.out.print("Digite a Altura: ");
		trapezio.altura = sc.nextDouble();
		if (trapezio.altura < 0) {
			System.out.println("Numero apenas maior que 0.");
			sc.close();
		}
				
		System.out.println("A área deste trapézio é de " + trapezio.area());
		System.out.println("O perímetro deste trapézio é de " + trapezio.perimetro());
	}
}
