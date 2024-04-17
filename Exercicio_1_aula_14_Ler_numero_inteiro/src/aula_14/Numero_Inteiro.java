package aula_14;

import java.util.Scanner;

public class Numero_Inteiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Faça um programa que leia um número inteiro e o imprima");
		System.out.println();
		
		System.out.print("Digite um número que deseja que sema impresso: ");
		int x = sc.nextInt();
		
		System.out.println("O número digitado foi " + x + ".");
		
		sc.close();
	}
}
