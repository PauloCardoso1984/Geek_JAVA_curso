package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class CalculoTrabalho {

	public static void main(String[] args) {


		System.out.println("Faça um programa que leia o valor da hora de trabalho (em reais) e número de horas \n"
				+ "trabalhadas no mês. Imprima o valor a ser pago ao funcionário, adicionando 10% sobre o valor\n "
				+ "calculado.");
		
		System.out.println();
		
		// SUBSTITUIRÁ A VIRGULA POR PONTO
		Locale.setDefault(Locale.US);
		// INSTANCIANDO A COMUNICAÇÃO EXTERNA POR MEIO DO TECLADO
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual valor da hora do trabalho R$ ");
		double valorhora = sc.nextDouble();
		
		System.out.print("Quantos dias o funcionário trabalhou? ");
		int diastrabalhados = sc.nextInt();
		System.out.println();
		
		// CALCULANDO O PAGAMENTO
		double totalparcial = diastrabalhados * valorhora;
		double totalpagar = totalparcial + (totalparcial * 0.10);
	
		// A COLOCAÇÃO DO %.2f%n SERVIRÁ PARA COLOCAR 02 CASAS APÓS A VIRGULA
		System.out.println(" O funcionário trabalhou por " + diastrabalhados + " dias.");
		System.out.printf(" O valor a receber (SEM ACRESCIMO) é R$ %.2f%n ", totalparcial);
		System.out.printf("O valor a receber (COM ACRESCIMO) é R$ %.2f%n ", totalpagar);
	
		sc.close();
	}
}
