package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba um salário de um funcionário e informe o valor de porcentagem apra aumentar o salário.");
		System.out.println();
		
		System.out.print("Digite o salário R$: ");
		double salario = sc.nextDouble();
		
		System.out.print("Porcentagem % que será aumentado o sálario: ");
		int porcentagem = sc.nextInt();
		
		// MÉTODO OBTER O RESULTADO
		double salariopago = salario + (salario * 0.01 * porcentagem);
		
		// AO COLOCAR %.2f%n SERÁ IMPRESSO APENAS 2 CASAS APÓS A VÍRGULA
		System.out.println("Valor inicial do salário é de R$ " + salario + ", valor da pocentagem de aumento é de: " + porcentagem);	
		System.out.printf("Valor a se pago será de R$: %.2f%n", salariopago);
		
		sc.close();
	}
}
