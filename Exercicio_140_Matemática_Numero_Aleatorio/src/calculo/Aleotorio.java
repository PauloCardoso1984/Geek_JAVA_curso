
package calculo;

import java.util.Scanner;

public class Aleotorio {

	public static void main(String[] args) {
		System.out.println("Faça um programa qye gera um numero de 1 até 100. O usuário deve tentar "
				+ "acertar qual o numero foi gerado, a cada tentativa o programa deverá informar se "
				+ "a tentativa é maior ou menos ao numero gerado. O programa acaba quando o "
				+ " acerta o número gerado. O programa deve informar em quantas tentativas o número "
				+ "foi descoberto.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

        int numeroGerado = (int) (Math.random() * 100) + 1;
        int tentativa;
        int contadorTentativas = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número gerado de 1 a 100.");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            contadorTentativas++;

            if (tentativa < numeroGerado) {
                System.out.println("Tentativa " + contadorTentativas + ": O número gerado é maior."); System.out.println();
            } else if (tentativa > numeroGerado) {
                System.out.println("Tentativa " + contadorTentativas + ": O número gerado é menor."); System.out.println();
            } else {
            	System.out.println("O número gerado foi : " + numeroGerado);
                System.out.println("Parabéns! Você acertou o número " + numeroGerado + " em " + contadorTentativas + " tentativas.");
            }

        } while (tentativa != numeroGerado);

        scanner.close();
    }
}