package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Numero_Reais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TROCARÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		
		System.out.println("Faça um programa que leia um número real e o imprima");
		System.out.println();
		
		System.out.print("Digite um número que deseja que sema impresso: ");
		float x = sc.nextFloat();
		
		System.out.println("O número digitado foi " + x);
		
		sc.close();
	}
}
