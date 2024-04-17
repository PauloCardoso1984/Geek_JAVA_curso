package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Uma empresa decide dar um aumento aos seus funcionarios que considera o salaria atrual eo tempo de serviço. Quem menos ganha terá o aumento maior e alguns funcionários terá um bonus conforme tabela. \n"
				+ "*SALARIO ATUAL	* REAJUSTE	*TEMPO DE SERVIÇO	*BÔNUS\n"
				+ "= R$ 500.00	25%		< que 1 ano		Sem bonus\n"
				+ "<= R$ 1000.00	20%		1 a 3 anos		R$ 100.00\n"
				+ "<= R$ 1500.00	15%		4 a 6 anos		R$ 200.00\n"
				+ "<= R$ 2000.00	10%		7 a 10 anos		R$ 300.00\n"
				+ "> R$ 2000.00	Sem Reajuste	> 10 anos		R$ 500.00");
		System.out.println();
		
		System.out.print("Qual seu nome? ");
		String nome = sc.nextLine();
		
		System.out.print("Qual seu codigo: ");
		int codigo = sc.nextInt(); 
		
		System.out.print("Seu salário atual? R$ ");
		double salarioAtual = sc.nextDouble();
		
		System.out.println("Em valor inteiro, qual é o tempo de serviço na empresa: ");
		int tempo = sc.nextInt();
		
		if (salarioAtual <= 500 && tempo < 1) {
			double pagar = salarioAtual + (salarioAtual * 0.25);
			System.out.println("O funcionario " + nome + " de código " + codigo + " passará a receber R$ " + pagar);		
		}
		else if (salarioAtual <= 1000 && tempo >= 1 && tempo <= 3) {
			double pagar = salarioAtual + (salarioAtual * 0.20) + 100.0;
			System.out.println("O funcionario " + nome + " de código " + codigo + " passará a receber R$ " + pagar);		
		}
		else if (salarioAtual <= 1500 && tempo >=4 && tempo <= 6) {
			double pagar = salarioAtual + (salarioAtual * 0.15) + 200.0;
			System.out.println("O funcionario " + nome + " de código " + codigo + " passará a receber R$ " + pagar);		
		}
		else if (salarioAtual <= 2000 && tempo >=7 && tempo <= 10) {
			double pagar = salarioAtual + (salarioAtual * 0.10) + 300.0;
			System.out.println("O funcionario " + nome + " de código " + codigo + " passará a receber R$ " + pagar);		
		}
		else if (salarioAtual > 2000 && tempo > 10) {
			double pagar = salarioAtual + 500.0;
			System.out.println("O funcionario " + nome + " de código " + codigo + " passará a receber R$ " + pagar);		
		}
		sc.close();
	}
}