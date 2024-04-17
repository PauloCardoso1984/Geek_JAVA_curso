package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class PositivoENegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Leia um número fornecido pelo usuário. Se esse número for positivo, \n"
				+ "calcule a raiz quadrada do número. Se o número for negativo, imprima o quadrado.");
		System.out.println();
		
		System.out.print("Digite o 1º número: ");
		int numero1 = sc.nextInt();
	
		
		// CALCULANDO
		if (numero1 >= 1) {
			double numeroA = Math.sqrt(numero1); System.out.println();
			System.out.printf("O numero digitado é positivo e o valor de Raiz Quadrada de %.2f%n",  numeroA);
		} if (numero1 < 0) { 
			double numeroA = Math.pow(numero1, 2);
			System.out.printf("O numero digitado é negativo e o valor do seu Quadrado é %.2f%n",  numeroA);
			sc.close();
		}	
	}
}  
