package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado \n"
				+ "possui uma taxa diferente de imposto sobre o produto (MG 7%, SP 12%, RJ 15%, MS 8%). \n"
				+ "Faça um programa em que o usuário entre com o valor e o estado destino do produto que ele \n"
				+ "programa retorne o preço final do produto acrescido do imposto do estado em que ele será \n"
				+ "vendido. Se o estado digitado não for valido, mostrar uma mensagem de erro.");
		System.out.println();

		System.out.println("Qual estado vc pertence:"); 
		System.out.println("1 - MG   7%"); 
		System.out.println("2 - MS   8%"); 
		System.out.println("3 - SP  12%"); 
		System.out.println("4 - RJ  15%");
		System.out.print("Opção: "); 
		int opcao = sc.nextInt();

		System.out.println();	
		
		System.out.print("Digite o valor da compra: "); 
		double valor = sc.nextDouble();

		double resultado = 0;

		switch (opcao) { 
		case 1: resultado = valor + (valor * 0.07); 
			System.out.println("Valor a ser pago: " + resultado); 
			break; 
		
		case 2: resultado = valor + (valor * 0.08); 
		System.out.println("Valor a ser pago: " + resultado); 
		break; 
		
		case 3: resultado = valor + (valor * 0.12); 
		System.out.println("Valor a ser pago: " + resultado); 
		break; 
		
		case 4: resultado = valor + (valor * 0.15); 
		System.out.println("Valor a ser pago: " + resultado); 
		break; 
		
		default: System.out.println("Opção inválida. Encerrando o programa!!!"); 
		break; 
		}
		sc.close();
	}
}
