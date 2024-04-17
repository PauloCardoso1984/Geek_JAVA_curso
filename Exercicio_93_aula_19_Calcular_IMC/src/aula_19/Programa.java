package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um algoritmo que calcule o IMC de uma pessoa e mostre sua classificação de acordo com a tabela.\n"
				+ "*IMC			*CLASSIFICAÇÃO\n"
				+ "< 18.5			Abaixo do peso\n"
				+ "18.6 - 24.9		Saudável\n"
				+ "25.0 - 29.9		Peso em excesso\n"
				+ "30.0 - 34.9		Obesidade grau I\n"
				+ "35.0 - 39.9		Obesidade grau II - severa\n"
				+ ">= 40.0			Obesidade grau III - mórbida");
		System.out.println();
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		// CALCULANDO O IMC → PESO / ALTURA*ALTURA
		double imc = peso / (Math.pow (altura, 2));
		
		if (imc <= 18.5) {
			System.out.printf("Você está abaixo do peso - CUIDADO... Seu IMC é de %.4f%n", imc);
		}
		else if (imc >= 18.5 && imc < 25) {
			System.out.printf("Você é uma pessoa saudavél - PARABÉNS... Seu IMC é de %.4f%n", imc);
		}
		else if (imc >= 25 && imc < 30) {
			System.out.printf("Você está em Pesso em excesso... Seu IMC é de %.4f%n", imc);
		}
		else if (imc >= 30 && imc < 35) {
			System.out.printf("Você está em Pesso em excesso OBESIDADE... Seu IMC é de %.4f%n", imc);
		}
		else if (imc >= 35 && imc < 40) {
			System.out.printf("Você está em Pesso em excesso SEVERO... Seu IMC é de %.4f%n", imc);
		}
		else if (imc > 40) {
			System.out.printf("Você está em Pesso em excesso MORBIDO... Seu IMC é de %.4f%n", imc);
		}
		sc.close();
	}
}