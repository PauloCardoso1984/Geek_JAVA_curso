package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class TriploAntecessor_DobroSucessor {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba um número e some o triplo de seu antecessor e o dobro do seu sucessor");
		System.out.println();
		
		System.out.print("Digite o valor o número: ");
		double valor = sc.nextDouble();

		// MÉTODO OBTER O VALOR ANTECESSOR E SUCESSOR
		double antecessor = (valor - 1) ;
		double sucessor = (valor + 1) ;
		double soma = (antecessor * 3) + (sucessor * 2);
		
		System.out.println("Valor digitado foi: " + valor);
		System.out.println("Valor antecessor: " + antecessor + ". Valor sucessor: " + sucessor);
		System.out.println("Valor da soma do triplo do antecessor e dobro do sucessor é de: " + soma);
		sc.close();
	}
}
