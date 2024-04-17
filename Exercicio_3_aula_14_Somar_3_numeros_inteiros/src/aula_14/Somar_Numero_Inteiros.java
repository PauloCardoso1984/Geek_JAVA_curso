package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Somar_Numero_Inteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia 3 (três números inteiros), some e o imprima");
		System.out.println();
		
		System.out.print("Digite o 1º número: ");
		int x = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		int y = sc.nextInt();
		System.out.print("Digite o 3º número: ");
		int z = sc.nextInt();
		
		int soma = x + y + z;
		
		System.out.println("O número digitados foram " + x + ", " +  y + ", " + z);
		System.out.println("A soma desses números é igual a: " + soma);
		
		sc.close();
	}
}
