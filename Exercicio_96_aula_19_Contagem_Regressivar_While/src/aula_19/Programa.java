package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa que mostre na tela a contagem regressiva de 10 até \n"
				+ "0 e no final mostre a palavra FIM !!!.");
		System.out.println();

	    int i = 10;
	    while (i >= 0) {
	      System.out.println(i);
	      i--;
	    }
	    System.out.println("FIM !!!");
	    
	    System.out.println();
		System.out.print("Pedindo um número para descrescer: ");
		int a = sc.nextInt();
	    while (a >= 0) {
	      System.out.println(a);
	      a--;
	    }
	    System.out.println("FIM !!!");
	}			
}