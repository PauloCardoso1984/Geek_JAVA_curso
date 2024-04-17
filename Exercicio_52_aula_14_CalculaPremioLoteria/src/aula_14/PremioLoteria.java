package aula_14;

import java.util.Scanner;

public class PremioLoteria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Três amigos jogaram na loteria. Caso eles ganhem, o prêmio deve ser repartido \n"
				+ "proporcionalmente ao valos que cada um deu para a realização da aposta. Faça um programa em \n"
				+ "JAVA que leia quanto cada apostador investiu, lembrando que não pode passar de 100% do premio \n"
				+ "do valor do prêmio, e imprima quanto cada um ganharia do prêmio com base no valor investido.");
		System.out.println();

        System.out.print("Digite o valor do prêmio R$: ");
        double premio = sc.nextDouble();
        
        System.out.print("Jogador A: Valor investido na aposta R$ ");
        double jogadorA =sc.nextDouble();
        System.out.print("Jogador B: Valor investido na aposta R$ ");
        double jogadorB =sc.nextDouble();
        System.out.print("Jogador C: Valor investido na aposta R$ ");
        double jogadorC =sc.nextDouble();
        
        double valorTotal = jogadorA + jogadorB + jogadorC;
        double premio1 = premio / valorTotal * jogadorA;
        double premio2 = premio / valorTotal * jogadorB;
        double premio3 = premio / valorTotal * jogadorC;
        
        System.out.println();
        
        System.out.printf("Valor pago ao Jogador A R$ %.2f%n", premio1);
        System.out.printf("Valor pago ao Jogador B R$ %.2f%n", premio2);
        System.out.printf("Valor pago ao Jogador C R$ %.2f%n", premio3);

        sc.close();
    }
}