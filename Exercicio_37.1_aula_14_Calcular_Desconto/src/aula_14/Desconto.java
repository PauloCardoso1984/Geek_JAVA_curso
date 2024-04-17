package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba um valor e que seja necessário dar um desconto de 12%.");
		System.out.println();
		
		System.out.print("Digite o preço R$: ");
		double preco = sc.nextDouble();
		
		// MÉTODO OBTER O RESULTADO
		double desconto =  preco - (preco * 0.12);
		
		System.out.println("Valor digitado do preço: R$ " + preco);
		// AO COLOCAR %.2f%n SERÁ IMPRESSO APENAS 2 CASAS APÓS A VÍRGULA
		System.out.printf("Valor com desconto de 12%% é de R$: %.2f%n", desconto);
		
		sc.close();
	}
}
