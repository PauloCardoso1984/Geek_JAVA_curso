package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba um preço e que seja informado o valor do desconto.");
		System.out.println();
		
		System.out.print("Digite o preço R$: ");
		double preco = sc.nextDouble();
		
		System.out.print("Valor do desconto em %: ");
		double desconto = sc.nextDouble();
		
		// MÉTODO OBTER O RESULTADO
		double valorpago =  preco - (preco * 0.01 * desconto);
		
		System.out.println("Valor digitado do preço: R$ " + preco + ", porcentagem de desconto: " + desconto);
		// AO COLOCAR %.2f%n SERÁ IMPRESSO APENAS 2 CASAS APÓS A VÍRGULA
		System.out.printf("Valor com desconto a pagar será de R$: %.2f%n", valorpago);
		
		sc.close();
	}
}
