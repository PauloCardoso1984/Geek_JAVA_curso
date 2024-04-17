package calculo;

import java.util.Random;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que calcule o menor número divisível por cada um dos números de 1 a 20. Exemplo 2520 "
						+ "é o menor número que pode ser dividido por cada um dos números de 1 a 10, sem sobrar resto..");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		int numero = 20;
		
		// CHAMANDO A FUNÇÃO
		while (!divisivelPorTodos(numero)) {
			numero += 20;
		}

		System.out.println("O menor número divisível por todos os números de 1 a 20 é: " + numero);

		sc.close();
	}
	// MÉTODO
	public static boolean divisivelPorTodos(int numero) {
		for (int i = 1; i <= 20; i++) {
			if (numero % i != 0) {
				return false;
			}
		}
		return true;
	}
}