package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa completo que permita a qualquer aluno introduzir, pelo teclado, \n"
				+ "uma sequência arbitrária de notas (Válidas no intervalo de 0 a 10) e que mostre na tela, como \n"
				+ "resultado, a correspondete média aritmética. O número de notas com o aluno pretenda afeturar \n"
				+ "o calculo não será fornecido ao programa, o qual encerrará quando for introduzido um valor que \n"
				+ "não seja válido como nota.");
		System.out.println();		
		
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