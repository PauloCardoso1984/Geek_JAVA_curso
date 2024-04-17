package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println(
				"EM JAVA, Faça um programa que some os números impares contidos em um intervalo definido pelo usuário. "
						+ "O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar todos os "
						+ "números pares contidos neste intervalo. Caso o usuário digite um intervalo inválido "
						+ "(começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela. "
						+ "Intervalo de valores inválidos e o programa reinicia.");
		System.out.println();

        Scanner sc = new Scanner(System.in);
        
        int valorInicial, valorFinal;
        
        do {
            System.out.print("Digite o valor inicial do intervalo: ");
            valorInicial = sc.nextInt();
            
            System.out.print("Digite o valor final do intervalo: ");
            valorFinal = sc.nextInt();
            
            if (valorInicial >= valorFinal) {
                System.out.println("Intervalo inválido. O valor final deve ser maior que o valor inicial.");
            }
        } while (valorInicial >= valorFinal);
        
        int soma = 0;
        System.out.print("Números ímpares no intervalo de " + valorInicial + " a " + valorFinal + ": ");
        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                soma += i;
            }
        }        
        System.out.println("\nA soma dos números pares neste intervalo é: " + soma);

        sc.close();
    }
}