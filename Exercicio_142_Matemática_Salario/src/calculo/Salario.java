package calculo;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		System.out.println("O funcionário chamado Paulo tem um colega chamado Cardoso que recebe um salário que "
				+ "equivale a um (1/3) terço do seu salário. Paulo gosta de fazer aplicações na caderneta de poupança e"
				+ "vai aplicar seu salário integralmente no fundo de renda fixa, que está rendendo 5% ao mês. "
				+ "Construa um programa que deverá calcular e mostrar a quentidade de meses necessário para que "
				+ "o valor pertencente a Cardoso iguale ou ultrapasse o valor pertencente a Paulo. "
				+ "Teste com outros valores para as taxas.");
		System.out.println();

	    Scanner sc = new Scanner(System.in);

	    System.out.print("Digite o salário de Paulo R$: ");
	    double salarioPaulo = sc.nextDouble();
	    
	    double salarioCardoso = salarioPaulo / 3;

	    System.out.print("Digite a taxa de rendimento (em % ao mês): ");
	    double taxaRendimento = sc.nextDouble() / 100;

	    int meses = 0;
	    while (salarioCardoso <= salarioPaulo) {
		        salarioCardoso *= 1 + taxaRendimento;
	        meses++;
	    }
	    System.out.println("Quantidade de meses necessária para igualar ou ultrapassar o salário de Paulo: " + meses + " meses.");

	    sc.close();
	}
}