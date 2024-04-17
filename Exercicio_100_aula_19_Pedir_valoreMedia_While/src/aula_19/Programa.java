package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que peça ao usuário para digitar valores e ignorar os negativos em \n"
				+ "seguida mostre a soma dos mesmos.");
		System.out.println();
		
        int num; int soma = 0; int contador = 0; double divisao = 0.0;
        
        System.out.println("Digite um número negativo para parar):");
        System.out.print("Digite os valores: ");
        
        while (true) {
            num = sc.nextInt();
            
            if (num < 0) {
                break; // SAI DO LOOP SE O NÚMERO FOR NEGATIVO
            }
            soma += num;
            contador++;
            System.out.print("Digite os valores: ");
        }
        if (contador > 0) {
            divisao = (double) soma / contador;
            
            System.out.println("Soma dos números positivos: " + soma);
            System.out.printf("Divisão dos números positivos: %.2f%n", divisao);
        } 
        else {
            System.out.println("Nenhum número positivo foi digitado.");
        }     
        sc.close();
    }
}