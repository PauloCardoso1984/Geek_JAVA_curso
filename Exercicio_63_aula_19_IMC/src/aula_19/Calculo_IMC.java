package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_IMC {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre \n"
				+ " peso ideal, utilizando as seguintes formaulas. \n"
				+ "* Homens (72.7 * altura)- 58 \n"
				+ "* Mulheres (62.1 * altura) - 44.7.");
		System.out.println();
		
		char sexo;

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Para Homem digite 'h' e para Mulher digite 'm': ");
		sexo = sc.next().charAt(0);
		
		if (sexo == 'h') {
			double x = 72.7 * altura - 58; System.out.println();
			System.out.printf(nome + " seu peso ideal é de %.2f%n", x);
		} 
		if (sexo == 'm') {
			double x = 62.1 * altura - 44.7; System.out.println();
			System.out.printf(nome + " seu peso ideal é de %.2f%n", x);
		}
		sc.close();
	}
}