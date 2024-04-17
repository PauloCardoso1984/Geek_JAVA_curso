package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa que, verifique a idade de com competidor e classifique como. \n"
				+ "* InfantilA - 5 a 7 anos, \n"
				+ "* InfantilB = 8 a 10 anos, \n"
				+ "* JuvenilA = 11 a 13 anos, \n"
				+ "* JuvenilB = 14 a 17 anos, \n"
				+ "* Sênior = maior de 18 anos");
		System.out.println();

		System.out.print("Qual idade do competidor: ");
		double idade = sc.nextDouble();
		
		// VERIFICANDO A CATEGORIA
	
		if (idade >=5 && idade <= 7) {
			System.out.println("Competidor(a) Infantil A.");
		}
		if (idade >= 8 && idade <= 10 ) {
			System.out.println("Competidor(a) Infantil B.");
		}
		if (idade >= 11 && idade <= 13 ) {
			System.out.println("Competidor(a) Juvenil A.");
		}	
		if (idade >= 14 && idade <= 17 ) {
			System.out.println("Competidor(a) Juvenil B.");
		}
		if (idade > 18) {
			System.out.println("Competidor(a) Sênior.");
		}
		sc.close();
	}
}
