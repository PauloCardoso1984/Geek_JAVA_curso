package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Mostrar_o_quadrado {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba um número de um lado e mostre o valor da área do quadrado");
		System.out.println();
		
		System.out.print("Digite o valor de um dos lados do quadrado: ");
		double valor = sc.nextDouble();

		// MÉTODO OBTER O RESULTADO
		double area = Math.pow(valor, 2); 
		
		System.out.println("Valor digitado foi: " + valor);
		System.out.println("Valor da área do quadrado é de: " + area);
		sc.close();
	}
}
