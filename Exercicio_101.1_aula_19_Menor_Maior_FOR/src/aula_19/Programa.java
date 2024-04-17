package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.");
		System.out.println();
		
		// VETOR 
        int[] numeros = new int[11];
        
        
        for (int i = 1; i <= 10; i ++) {
        	System.out.print("Digite o " + i + "º número: ");
            numeros[i] = sc.nextInt();  
        }
        
        int menor = numeros[0];
        int maior = numeros[0];
        for (int i = 1; i <= 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }       
        System.out.println();
        System.out.println("O menor valor lido é: " + menor);
        System.out.println("O maior valor lido é: " + maior);
    
        sc.close();
    }
}