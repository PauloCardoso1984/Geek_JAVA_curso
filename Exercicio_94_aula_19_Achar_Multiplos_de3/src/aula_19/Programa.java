package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que determine e mostre os cincos primeiros múltiplos \n"
				+ "de 3, considerando números maiores que 0.");
		System.out.println();
		
		// CONTADOR PARA MANTER O CONTROLE
        int count = 0; 
        
        // NÚMERO USADO PARA VERIFICAR SE É MÚLTIPLO DE 3
        int number = 1;
        
        System.out.println("Os cinco primeiros múltiplos de 3 são:");

        while (count < 5) {
            if (number % 3 == 0) {
                System.out.println(number); // PULANDO A LINHA
       //         System.out.print(number + " - "); // UM NA FRENTE O OUTRO
                count++; // INCREMENTA O CAONTADOR UM MÚLTIPLO ENCONTRADOo
            }
            number++; // INCREMENTA O NÚMERO PARA VERIFICAR O PRÓXIMO
        }
    }
}