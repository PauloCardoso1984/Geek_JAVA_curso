package aula_19;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Faça um programa para verificar se um determinado número inteiro é divisivel \n"
        		+ "por 3 ou 5, mas não simultaneamente pelo dois.");
        System.out.println();
        
        System.out.print("Digite o número para verificação: ");
        double numero = sc.nextDouble();
        
        // VERIFICAÇÃO
        if(numero % 3 == 0) {
        	double resultado = numero / 3;
        	System.out.println("O numero " + numero + " é divisivel por 3. E o resultado é " + resultado);
        } else {  
        	System.out.println("O numero " + numero + " não é divisivel por 3.");
        }
        if (numero % 5 == 0 ) {
        	double resultado = numero / 5;
        	System.out.println("O numero " + numero + " é divisivel por 5. E o resultado é " + resultado);
        } else {
        	System.out.println("O numero " + numero + " não é divisivel por 5.");
        }
    }
}
