package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um algoritmo que leia um número entre 100 e 999 e imprima na saída \n"
				+ "cada um dos algarismos que compôem o número.");
		System.out.println();

		int centena, dezena, unidade, numero = 0;		
		
		System.out.print("Digite um número entre 100 e 999: ");
		numero = sc.nextInt();
		
		while (numero < 100 || numero > 999) {
			System.out.println("O número digitado está fora do intervalo válido.");
			System.out.println();
			System.out.print("Digite novamente um número que esteja entre 100 e 999: ");
			numero = sc.nextInt();
		}
		
		while (numero >= 100 && numero <= 999) {
			centena = numero / 100;
			dezena = (numero % 100) / 10;
			unidade = numero % 10;
		
			System.out.println();	
			
			System.out.println("RESULTADO");
			System.out.println("Centena: " + centena);
			System.out.println("Dezena:  " + dezena);
			System.out.println("Unidade: " + unidade);
			
			break;
		}
		sc.close();
	}
}