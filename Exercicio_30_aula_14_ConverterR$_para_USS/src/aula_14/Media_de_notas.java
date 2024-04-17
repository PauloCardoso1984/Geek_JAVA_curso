package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Media_de_notas {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		// VALOR DO DOLAR EM 03/01/2023 - R$ 4,877
		double dolar = 4.877;
		
		System.out.println("Fazer um programa para converter um valor em real (R$) para dólar (USS)");
		System.out.println();
		
		System.out.print("Digite o valor em reais R$: ");
		double valor = sc.nextDouble();

		// MÉTODO OBTER O VALOR EM DOLAR
		double USS1 = valor / dolar;			// PEGAR O VALOR DA DIVISÃO SEM SOBRAS
		double USS2 = valor % dolar * 0.01;		// PEGAR A SOBRA E ACHAR O DECIMAL (CENTAVOS)
		
		double valorUSS = USS1 + USS2;
		
		System.out.printf("Valor em Dolar é de USS: %.2f%n", valorUSS);
		
		sc.close();
	}
}
