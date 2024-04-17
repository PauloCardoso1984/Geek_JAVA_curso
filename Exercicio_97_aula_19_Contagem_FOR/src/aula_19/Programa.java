package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente de 1000 \n"
				+ "em 1000, imprimindo seu valor na tela , até que o valor seja 100000.");
		System.out.println();

		// COM FOR
        for (int i = 0; i <= 100000; i += 1000) {
            System.out.println(i);
        }
		
		System.out.println();
		
		// COM WHILE
        int valor = 0;

        while (valor < 100000) {
            System.out.println(valor);
            valor += 1000;
        }
        
        System.out.println();
        
        // DO WHILE
        int n = 0;
        do {
            System.out.println(n);
            n += 1000;
        } while (n <= 100000);     
	}			
}