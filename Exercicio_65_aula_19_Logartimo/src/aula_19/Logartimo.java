package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Logartimo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Ler um número inteiro. Se o número lido for negativo, escreva a mensagem. 'Numero \n"
				+ "inválido'. Se o número for positivo, calcular o logartimo deste número.");
		System.out.println();

		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Número inválido");
		} else {
			double logaritmo = Math.log(numero) / Math.log(10);
			System.out.printf("O logaritmo de " + numero + " na base 10 é: %.4f%n",  logaritmo);
		}
		sc.close();
	}
}