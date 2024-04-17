package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class PositivoEElevarQuadrado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Leia um número fornecido pelo usuário. Se esse número for positivo, \n"
				+ "calcule a raiz quadrada e elevar oa quadrado. Se o número for negativo, imprima INVÁLIDO.");
		System.out.println();
		
		System.out.print("Digite o número: ");
		int numero1 = sc.nextInt();
			
	
		while (numero1 <= 0) {
			System.out.println("O numero digitado é negativo ou zero. INVÁLIDO!!!");
			System.out.println("Aceita apenas positivo."); System.out.println();
			System.out.print("Digite o número: "); 
			numero1 = sc.nextInt();
		}
			if (numero1 > 1) { 
			double numeroA = Math.sqrt(numero1); System.out.println();
			double numeroB = Math.pow(numero1, 2);
			System.out.printf("O numero digitado tem a Raiz Quadrada de:	%.2f%n",  numeroA);
			System.out.printf("O numero digitado elevado ao Quadrado é:	%.2f%n",  numeroB);
		}
			sc.close();
	}
}