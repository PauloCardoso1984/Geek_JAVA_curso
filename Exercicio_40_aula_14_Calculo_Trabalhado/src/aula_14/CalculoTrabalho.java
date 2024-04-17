package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class CalculoTrabalho {

	public static void main(String[] args) {


		System.out.println("Faça um programa para empresa que contrata um encanador a R$ 30,00 por dia. \n"
				+ "Faça um programa que solicite o número de dias trabalhados pelo encanador e imprima a \n"
				+ "quantia que deverá ser paga, sabendo-se que são descontados 8% para imposto de renda.");
		
		System.out.println();
		
		// SUBSTITUIRÁ A VIRGULA POR PONTO
		Locale.setDefault(Locale.US);
		// INSTANCIANDO A COMUNICAÇÃO EXTERNA POR MEIO DO TECLADO
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor do contrato é do R$ 30,00 por dia trabalhado.");
		System.out.print("Quantos dias o encanador trabalhou? ");
		int diastrabalhados = sc.nextInt();
		System.out.println();
		
		// CALCULANDO O PAGAMENTO
		double totalpagar = diastrabalhados * 30.0;
		double impostoderenda = totalpagar - (totalpagar * 0.08);
	
		// A COLOCAÇÃO DO %.2f%n SERVIRÁ PARA COLOCAR 02 CASAS APÓS A VIRGULA
		System.out.println(" O funcionário trabalhou por " + diastrabalhados + " dias.");
		System.out.printf(" O valor a receber (SEM DESCONTO) é R$ %.2f%n ", totalpagar);
		System.out.printf("O valor a receber (COM DESCONTO) é R$ %.2f%n ", impostoderenda);
	
		sc.close();
	}
}
