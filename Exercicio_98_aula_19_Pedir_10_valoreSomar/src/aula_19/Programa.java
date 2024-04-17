package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que peça ao úsuário para digitar 10 valores e em \n"
				+ "seguida mostre a soma dos mesmos.");
		System.out.println();

        int soma = 0;
        
     // UTILIZANDO O FOR
        System.out.println("Digite 10 valores (FOR):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = sc.nextInt();
            soma += valor;
        }
        System.out.println("A soma dos valores é: " + soma);
        System.out.println();
        
        // UTILIZANDO O WHILE
        int i = 1;
        System.out.println("Digite 10 valores (WHILE):");

        while (i <= 10) {
            System.out.print("Valor " + i + ": ");
            int valor = sc.nextInt();
            soma += valor;
            i++;
        }
        System.out.println("A soma dos valores é: " + soma);
        
        System.out.println();
        
        // UTILIZANDO O DO WHILE
        System.out.println("Digite 10 valores (DO WHILE):");
        int j = 1;
        do {
            System.out.print("Valor " + j + ": ");
            int valor = sc.nextInt();
            soma += valor;
            j++;
        } while (j <= 10);
        System.out.println("A soma dos valores é: " + soma);
    }
}