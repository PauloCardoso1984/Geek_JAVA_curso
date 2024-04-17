package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um algoritmo que leia um número entre 100 e 999 e imprima na saída \n"
				+ "cada um dos algarismos que compôem o número.");
		System.out.println();

        System.out.print("Digite um número entre 100 e 999: ");
        int numero = sc.nextInt();

        if(numero >= 100 && numero <= 999) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            System.out.println("Centena: " + centena);
            System.out.println("Dezena:  " + dezena);
            System.out.println("Unidade: " + unidade);
        } else {
            System.out.println("O número digitado está fora do intervalo válido.");
        }
        sc.close();
    }
}