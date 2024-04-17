package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Antecessor_Sucessor {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba um número e mostre o sucessor e antecessor");
		System.out.println();
		
		System.out.print("Digite o valor o número: ");
		float valor = sc.nextFloat();

		// MÉTODO OBTER O VALOR ANTECESSOR E SUCESSOR
		float valor2 = valor + 1;
		float valor1 = valor - 1;
				
		System.out.println("Valor digitado foi: " + valor);
		System.out.println("Valor antecessor: " + valor1 + ". Valor sucessor: " + valor2);
		sc.close();
	}
}
