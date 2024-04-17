package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que receba dois números, Calcule e mostre: "
				+ "*a soma dos números pares desse intervalo, incluindo os números digitados; "
				+ "*a multiplicação dos númeors ímpares desse interalo, incluindo os digitados.");
		System.out.println();		
		
		/*Esse programa solicita ao usuário que digite dois números, itera pelo intervalo 
		 * desses números e soma os números pares de maneira acumulativa na variável somaPares, 
		 * multiplicando os números ímpares na variável multiplicacaoImpares. 
		 * No final, exibe os resultados.*/
		
        // RECEBE OS DOIS NÚMEROS DO USUÁRIO
        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int somaPares = 0;
        int multiplicacaoImpares = 1;

        // ITERA PELO INTERVALO ENTRE OS NÚMEROS DIGITADOS (INCLUSIVE)
        // VERIFICA SE CADA NÚMERO É PAR OU ÍMPAR, SOMANDO OS PARES E MULTIPLICANDO OS ÍMPARES
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                multiplicacaoImpares *= i;
            }
        }
        // EXIBINDO O RESULTADO FINAL
        System.out.println();
        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A multiplicação dos números ímpares é: " + multiplicacaoImpares);

        sc.close();
    }
}