package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	static int count = 0;
	static int numero = 1;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa que mostre na tela de 1 a 100, de 1 eem 1. Escreva de 3 \n"
				+ "formas. Usando as repetições FOR, WHILE e DO WHILE.");
		System.out.println();

		// CONTADOR PARA MANTER O CONTROLE
		

		// NÚMERO USADO PARA VERIFICAR SE É MÚLTIPLO DE 3
		int number = 1;
		
		// UTILIZANDO O for
		System.out.println("A primeira forma utilizando o FOR:");
		for (int c = 1; c <= 100; c++) {
//			System.out.println(c); // PULANDO A LINHA
			System.out.print(c + " - "); // UM NA FRENTE O OUTRO
		}

		System.out.println();
		System.out.println();
		
		// UTILIZANDO O while
		System.out.println("A segunda forma utilizando o WHILE:");
		while (count < 100) {
			if (number % 1 == 0) {
				System.out.println(number); // PULANDO A LINHA
//				System.out.print(number + " - "); // UM NA FRENTE O OUTRO
				count++; // INCREMENTA O CAONTADOR UM MÚLTIPLO ENCONTRADO
			}
			number++; // INCREMENTA O NÚMERO PARA VERIFICAR O PRÓXIMO
		}
		System.out.println();
		
        // UTILIZANDO O do while COM INCREMENTO (DIVERSOS TESTES)   
		System.out.println("A terceira forma utilizando o DO WHILE:");
		System.out.println("→ → → → Incrementando");
        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 100);
        
        System.out.println("---------------");
                
        // COM DECREMENTO
        System.out.println("→ → → → Decrementando");
        numero = 100;
        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 1);
        
        System.out.println("---------------");
        
        // PULANDO DE 5 EM 5
        System.out.println("→ → → → Incrementando de 5 em 5");
        numero = 0;
        do {
            System.out.println(numero);
            numero += 5;
        } while (numero <= 100);
    }			
}