package aula_14;

import java.util.Scanner;

public class CalcularIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Implemente um programa que calcule o ano de nascimento de uma \n"
				+ "pessoa a partir de sua idade e do ano atual.");
		System.out.println();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int anoNascimento = anoAtual - idade;
        System.out.println("Seu ano de nascimento é: " + anoNascimento);

        sc.close();
    }
}