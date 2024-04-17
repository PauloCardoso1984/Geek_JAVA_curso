package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Calcular_Sequencia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa que leia um número inteiro maior do que zero e devolva na tela, a soma de todos /n"
				+ "os seus algarismos. Por exemplo, ao numero 251 corresponderá o valor de 8 (2+5+1). Se o número lido não for maior/n"
				+ " do que zero, o programa terminará com a mensagem 'Número Inválido'.");
		System.out.println();
		
        System.out.print("Digite um número inteiro maior do que zero: ");
        int numero = sc.nextInt();
        
        if (numero <= 0) {
            System.out.println("Número Inválido");
        } else {
            int soma = 0;
            
            // Calcula a soma dos algarismos
            while (numero > 0) {
                soma += numero % 10; 	// Obtém o último algarismo e soma à variável soma
                numero /= 10; 			// Remove o último algarismo do número
            }
            
            System.out.println("A soma dos algarismos é: " + soma);
        }   
        sc.close();
    }
}