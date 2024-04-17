package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class FolhaSalario {

	public static void main(String[] args) {

		System.out.println("Receba o salário-base de um funcionário. Calcule e imprima o salário a receber, \n"
				+ "sabendo-se que esse funcionário tem uma gratificação de 5% sobre o salário-base. Além disso, \n"
				+ "ele paga 7% de imposto sobre o salário-base");
		
		System.out.println();
		
		// SUBSTITUIRÁ A VIRGULA POR PONTO
		Locale.setDefault(Locale.US);
		// INSTANCIANDO A COMUNICAÇÃO EXTERNA POR MEIO DO TECLADO
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o salário-base R$ ");
		double salariobase = sc.nextDouble();
			
		// CALCULANDO O PAGAMENTO
		double total = salariobase + (salariobase * 0.05) - (salariobase * 0.07);
	
		// A COLOCAÇÃO DO %.2f%n SERVIRÁ PARA COLOCAR 02 CASAS APÓS A VIRGULA
		System.out.printf("O valor a receber é R$ %.2f%n ", total);

		sc.close();
	}
}
