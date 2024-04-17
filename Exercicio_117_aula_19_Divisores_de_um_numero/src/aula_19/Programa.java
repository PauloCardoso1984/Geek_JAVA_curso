package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Faça um programa que leia apenas número positivo e imprima a soma \n"
				+ "seus divisores.");
		System.out.println();

        int numero; int quantidadeDivisores= 0;

        do {
            System.out.print("Digite um número positivo (ou 0 para sair): ");
            numero = sc.nextInt();

            if (numero > 0) {
                int somaDivisores = 0;

                for (int i = 1; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        somaDivisores += i;
                        quantidadeDivisores ++;
                        System.err.print(i + " ");
                    }
                }
                System.out.println(" - Quantidade de divisores: " + quantidadeDivisores);
                System.out.println("A soma dos divisores de " + numero + " é: " + somaDivisores);
                
                System.out.println();
            } 
            else if (numero < 0) {
                System.out.println("O número deve ser positivo!");
            }
        } 
        while (numero != 0);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}