package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba um salário de um funcionário e aumente 25% e mostre na tela.");
		System.out.println();
		
		System.out.print("Digite o preço R$: ");
		double salario = sc.nextDouble();
		
		// MÉTODO OBTER O RESULTADO
		double salariopago = salario + (salario * 0.25);
		
		// AO COLOCAR %.2f%n SERÁ IMPRESSO APENAS 2 CASAS APÓS A VÍRGULA
		System.out.printf("Valor inicial do salário é de R$ %.2f%n", salario);	
		System.out.printf("Valor a se pago será de R$: %.2f%n", salariopago);
		
		sc.close();
	}
}
