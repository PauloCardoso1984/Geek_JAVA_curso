package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Soma_ao_quadrado {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Fazer um programa para ler 03 valores (podendo ser inteiros ou reais) e depois mostre a soma deste números elevado ao quadrado");
		System.out.println();
		
		System.out.print("Digite o valor o primeiro valor: ");
		float valor1 = sc.nextFloat();
		System.out.print("Digite o valor o segundo valor: ");
		float valor2 = sc.nextFloat();		
		System.out.print("Digite o valor o terceiro valor: ");
		float valor3 = sc.nextFloat();
		
		// MÉTODO PARA ELEVAR OS NUMEROS AO QUADRADE E SOMA-LOS
		Double soma = Math.pow(valor1, 2) + Math.pow(valor2, 2) + Math.pow(valor3, 2);
		
		System.out.println("Os valores digitados foram: Valor 1 = " + valor1 + ", Valor 2 = " + valor2 + ", Valor 3 = " + valor3);
		// AO COLOCAR %.2f%n SERÁ IMPRESSO APENAS 2 CASAS APÓS A VÍRGULA
		System.out.printf("Os valores somado ao quadrado é de: %.2f%n", soma);
		
		sc.close();
	}
}
