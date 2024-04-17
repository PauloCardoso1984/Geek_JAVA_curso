package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Faça um algoritmo que encontre o primeiro múltiplo de 11, 13 ou 17 após um número digitado.");
		System.out.println();
		
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        int multiplo = encontrarMultiplo(numero);
        
        System.out.println("O primeiro múltiplo de 11, 13 ou 17 após " + numero + " é: " + multiplo);
    }
    
	// MÉTODO
    public static int encontrarMultiplo(int numero) {
        int multiplo = numero + 1;
        
        while (true) {
            if (multiplo % 11 == 0 || multiplo % 13 == 0 || multiplo % 17 == 0) {
                return multiplo;
            }
            multiplo++;
        }
    }
}