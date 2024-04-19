package calculo;

import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {
		System.out.println("Faça um programa que consiga calcula em quanto tempo uma pessoa "
				+ "consegue ter a mesma altura que outra.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		double alturaSua;
		double alturaOutro;
		int crescimentoSua; // centímetros por ano
		int crescimentoOutro; // centímetros por ano
		int anos = 0;

		System.out.print("Qual sua altura atual: ");
		alturaSua = sc.nextDouble();
		
		System.out.print("Qual a altura da outra pessoa: ");
		alturaOutro = sc.nextDouble();
		
		System.out.print("Quantos centimetros você cresce anualmente: ");
		crescimentoSua = sc.nextInt();
		
		System.out.print("Quantos centimetros outro cresce anualmente: ");
		crescimentoOutro = sc.nextInt();
		
		while (alturaOutro < alturaSua) {
			alturaSua += crescimentoSua; // converte centímetros para metros
			alturaOutro += crescimentoOutro; // converte centímetros para metros
			anos++;
		}
		System.out.println();
		System.out.println("Serão necessários " + anos + " anos para Você ter a mesma altura da outra pessoa.");
	}
}