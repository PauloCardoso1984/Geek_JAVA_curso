package aula_19;

import java.util.Scanner;

public class PositivoENegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Leia um número fornecido pelo usuário. Se esse número for positivo, \n"
				+ "calcule a raiz quadrada do número. Se o número for negativo, mostre uma mensagem \n"
				+ "dizendo que o numero é inválido.");
		System.out.println();
		
		System.out.print("Digite o 1º número: ");
		int numero1 = sc.nextInt();

		
		System.out.print("Digite o 2 número: ");
		int numero2 = sc.nextInt();
		
		// COMPARANDO
		if (numero1 >= 1) {
			double numeroA = Math.sqrt(numero1); System.out.println();
			System.out.printf("O 1º número terá o valor de Raiz Quadrada de %.2f%n",  numeroA);
		} if (numero1 < 0) { System.out.println("Numero inválido");
			sc.close();
			}
		
		if (numero2 >= 1) {		
			double numeroB = Math.sqrt(numero2); 
			System.out.printf("O 2º número terá o valor de Raiz Quadrada de %.2f%n", numeroB);
			} if (numero2 < 0) { System.out.println("Numero inválido, digite um número positivo.");
			sc.close();
					
		}			
	}
}  
