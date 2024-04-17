package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um número inteiro N e imprima os N \n"
				+ "primeiros números naturais impares.");
		
		System.out.println();
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
        
		System.out.println();
        System.out.println("Os primeiros números naturais pares antes de " + n + " são:");
        
        for (int i = 1; i < n; i += 2) {
            System.out.println(i);
        }
    }
}