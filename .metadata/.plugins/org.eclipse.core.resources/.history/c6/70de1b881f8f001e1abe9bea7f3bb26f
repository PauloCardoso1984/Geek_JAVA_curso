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

        double mediafor = 0, somawhile = 0, somadowhile = 0;
        
        double media = 0, media1 = 0, media2 = 0;
        
     // UTILIZANDO O FOR
        System.out.print("Quantas notas irá digitar (FOR): ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            int valor = sc.nextInt();
            mediafor += valor; 
            media = mediafor/x;
        }
        System.out.println("A média das notas é: " + media);

        System.out.println();
       
        // UTILIZANDO O WHILE
        int i = 1;
        System.out.print("Quantas notas irá digitar (WHILE): ");
        int y = sc.nextInt();
        while (i <= y) {
            System.out.print("Nota " + i + ": ");
            int valor = sc.nextInt();
            somawhile += valor;
            i++;    
            media1 = somawhile / y;
        }
       
        
        System.out.println("A média das notas é: " + media1);
        
        System.out.println();
       
        // UTILIZANDO O DO WHILE
        System.out.print("Quantas notas irá digitar (DO WHILE): ");
        int k = sc.nextInt();
        int j = 1;
        do {
            System.out.print("Nota " + j + ": ");
            int valor = sc.nextInt();
            somadowhile += valor;
            j++;
            media2 = somadowhile / k;
        } while (j <= k);
        System.out.println("A média das notas é: " + media2);
    }
}