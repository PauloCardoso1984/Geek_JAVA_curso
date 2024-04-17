package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Dia_da_semana {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da \n"
				+ "semana correspondente a este número. Isto é, domingo se 1, segunda-feira se 2, e assim por diante.");
		System.out.println();

		String dia;
		
		System.out.print("Digite um número (ente 1 a 7) e veja qual é o dia da semana: ");
		int numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Número inválido";
			break;
		}
		
		while (numero > 7 ) {
			System.out.print("Digite um número (ente 1 a 7) e veja qual é o dia da semana: ");
			numero = sc.nextInt();
		}
		
		System.out.println("Dia da semana é : " + dia);		
		
		sc.close();
	}
}
