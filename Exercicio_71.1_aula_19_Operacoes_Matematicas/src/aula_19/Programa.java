package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que mostre ao usuário um menu com 4 opções de operações matematicas (as básicas). \n"
				+ "O usuário escolhe uma das opções e o seu programa então pede dois números e realiza a operação, \n"
				+ "mostrando o resultado.");
		System.out.println();

		System.out.println("Escolha uma das opções:"); 
		System.out.println("1 - Soma"); 
		System.out.println("2 - Subtração"); 
		System.out.println("3 - Multiplicação"); 
		System.out.println("4 - Divisão");
		System.out.print("Opção: "); 
		int opcao = sc.nextInt();

		System.out.println();
		
		System.out.print("Digite o primeiro número: "); 
		double numero1 = sc.nextDouble();

		System.out.print("Digite o segundo número: "); 
		double numero2 = sc.nextDouble();

		double resultado = 0;

		switch (opcao) { 
		case 1: resultado = numero1 + numero2; 
			System.out.println("Resultado: " + resultado); 
			break; 
		
		case 2: resultado = numero1 - numero2; 
		System.out.println("Resultado: " + resultado); 
		break; 
		
		case 3: resultado = numero1 * numero2; 
		System.out.println("Resultado: " + resultado); 
		break; 
		
		case 4: 
			if (numero2 != 0) { 
				resultado = numero1 / numero2; 
			System.out.println("Resultado: " + resultado); 
			} 
			else { 
				System.out.println("Não é possível dividir por zero."); 
			} 
			break; 
		
		default: System.out.println("Opção inválida. Encerrando o programa!!!"); 
		break; 
		}
	}
}
