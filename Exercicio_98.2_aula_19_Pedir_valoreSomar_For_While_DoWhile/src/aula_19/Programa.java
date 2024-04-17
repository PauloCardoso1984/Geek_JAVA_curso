package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que peça ao úsuário para digitar valores e em \n"
				+ "seguida mostre a soma dos mesmos.");
		System.out.println();

        int somafor = 0;
        int somawhile = 0;
        int somadowhile = 0;
        
     // UTILIZANDO O FOR
        System.out.print("Quantos números vai querer digitar (FOR): ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = sc.nextInt();
            somafor += valor;
        }
        System.out.println("A soma dos valores é: " + somafor);
        System.out.println();
        
        // UTILIZANDO O WHILE
        int i = 1;
        System.out.print("Quantos números vai querer digitar (WHILE): ");
        int y = sc.nextInt();
        while (i <= y) {
            System.out.print("Valor " + i + ": ");
            int valor = sc.nextInt();
            somawhile += valor;
            i++;
        }
        System.out.println("A soma dos valores é: " + somawhile);
        
        System.out.println();
       
        // UTILIZANDO O DO WHILE
        System.out.print("Quantos números vai querer digitar (DO WHILE): ");
        int k = sc.nextInt();
        int j = 1;
        do {
            System.out.print("Valor " + j + ": ");
            int valor = sc.nextInt();
            somadowhile += valor;
            j++;
        } while (j <= k);
        System.out.println("A soma dos valores é: " + somadowhile);
    }
}