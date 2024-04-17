package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva o menu de opções abaixo. Leia a opção do usuário e execute a operação \n"
				+ "escolhida. Escreva uma mensagem de erro se a opção for inválida.");
		System.out.println();

		System.out.println("Escolha uma das opções:"); 
		System.out.println("1 - Soma de 2 números"); 
		System.out.println("2 - Diferença entre 2 números (maior pelo menor)"); 
		System.out.println("3 - Produto entre 2 numeros"); 
		System.out.println("4 - Divisão entre 2 numeros (o denominador não pode ser zero)");
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
