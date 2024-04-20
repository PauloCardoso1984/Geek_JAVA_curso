package calculo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um número inteiro e não negativo n e imprima "
				+ "a soma dos n primeiros números primos.");
		System.out.println();

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número inteiro não negativo: ");
		int n = input.nextInt();

		int count = 0;
		int num = 0;
		int sum = 0;

		while (count < n) {
			if (isPrime(num)) {
				sum += num;
				count++;
			}
			num++;
		}
		System.out.println("A soma dos " + n + " primeiros números primos é: " + sum);

		input.close();
	}

	// METODO
	public static boolean isPrime(int num) {
		if (num < 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}