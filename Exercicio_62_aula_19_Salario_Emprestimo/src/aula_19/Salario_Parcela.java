package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Salario_Parcela {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();

		System.out.println("Leia o salário de um trabalhador e o valor de um empréstimo. Se a prestação for \n"
				+ "maior que 20% do salário imprima: Empréstimo não conceido. caso contrário imprima. Emprestimo \n"
				+ "concedido.");
		System.out.println();

		System.out.print("Digite o nome do funcionário: ");
		func.nome = sc.nextLine();
		
		System.out.print("Digite o salário R$ ");
		func.salario = sc.nextDouble();
		
		System.out.print("Digite o valor a ser emprestado R$ ");
		func.emprestimo = sc.nextDouble();
		
		if (func.saldoSalario(func.salario) < func.emprestimo) { System.out.println();
			System.out.println("Emprestimo não concedido! FALE COM SEU GERENTE");
		}
		else { System.out.println();
			System.out.println("Empréstimo concedido! PARABÉNS");
		}
		
		System.out.println(func);
		sc.close();
	}
}