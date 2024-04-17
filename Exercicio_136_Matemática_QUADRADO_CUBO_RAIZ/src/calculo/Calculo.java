package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um conjunto não determinado de valores, um de cada "
				+ "vez, e escreva para cada um dos valores lidos, o quadrado, o cubo e a raiz quadrada. "
				+ "Finale a entrada de dados com um valor negativo ou zero.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

//		System.out.println("Para sair digite um valor negativo ou zero");
//		System.out.print("Digite os valores: ");

		while (true) {
			System.out.println("Para sair digite um valor negativo ou zero");
			System.out.print("Digite os valores: ");
			double numero = sc.nextDouble();

			if (numero <= 0) {
				System.out.println("PROGRAMA FINALIZADO..."); 
				break;
			}

			double quadrado = Math.pow(numero, 2);
			double cubo = Math.pow(numero, 3);
			double raizQuadrada = Math.sqrt(numero);

			System.out.println("Número: 	" + numero);
			System.out.println("Quadrado: 	" + quadrado);
			System.out.println("Cubo: 		" + cubo);
			System.out.println("Raiz quadrada:	" + raizQuadrada);
			System.out.println();
		}
		sc.close();
	}
}