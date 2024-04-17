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
		
        System.out.print("Digite um número inteiro N: ");
        int N = sc.nextInt();
        
        for (int i = 1, count = 0; count < N; i += 2) {
            System.out.println(i);
            count++;
        }
        
        sc.close();
    }
}