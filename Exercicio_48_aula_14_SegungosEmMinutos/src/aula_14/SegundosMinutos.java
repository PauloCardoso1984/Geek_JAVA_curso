package aula_14;

import java.util.Scanner;

public class SegundosMinutos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia um tempo em segundos e imprima em horas.");
		System.out.println();

        System.out.print("Digite o tempo em segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600; 	// converte para horas
        segundos = segundos % 3600; 	// obtém o restante dos segundos

        int minutos = segundos / 60;	// converte para minutos
        segundos = segundos % 60; 		// obtém o restante dos segundos

        System.out.printf("O tempo convertido é: %d horas, %d minutos e %d segundos.", horas, minutos, segundos);
    }
}