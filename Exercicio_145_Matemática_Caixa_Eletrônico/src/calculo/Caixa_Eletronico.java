package calculo;

import java.util.Scanner;

public class Caixa_Eletronico {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que receba como entrada o valor do saque realizado pelo cliente "
				+ "de um banco e retorne quantas notas de cada valor serão necessárias para atender ao saque, "
				+ "sugerindo quantas notas deseja receber. As notas disponíveis serão de 200, 100, 50, 20, 10, 5, 2.");
		System.out.println();

		Scanner input = new Scanner(System.in);

	    System.out.print("Digite o valor do saque: ");
	    int valorSaque = input.nextInt();

	    int[] notas = {200, 100, 50, 20, 10, 5, 2};
	    int[] qtdNotas = new int[notas.length];

	    for (int i = 0; i < notas.length; i++) {
	        qtdNotas[i] = valorSaque / notas[i];
	        valorSaque = valorSaque % notas[i];
	    }

	    System.out.println("Notas necessárias:");
	    for (int i = 0; i < notas.length; i++) {
	        if (qtdNotas[i] > 0) {
	            System.out.println(qtdNotas[i] + " nota(s) de " + notas[i]);
	        }
	        
	        input.close();
	    }
	}
}