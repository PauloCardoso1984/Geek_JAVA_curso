package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Leia a idade e o tempó de serviço de um trabalhador e escreva se ele pode ou não se \n"
				+ "aposentar. As condições para aposentadoria são: \n"
				+ "* Ter pelo menos 65 anos. \n"
				+ "* Ou ter trabalhado pelo menos 30 anos. \n"
				+ "* Ou ter pelo menos 60 anos e trabaljado pelo menos 25 anos.");
		System.out.println();

		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Quanto tempo pagou o INSS: ");
		int inss = sc.nextInt();
		System.out.println();
		
		if (idade >= 65 && inss <= 29) {
			int resultado = 30 - inss;
			System.out.println("Ainda faltam " + resultado + " anos de trabalho.");
			System.out.println("Ainda não pode se aposentar!");	
		}		
		if (idade < 65 && inss > 30) {
			int resultado = 65 - idade;
			System.out.println("Ainda faltam " + resultado + " anos para completar idade.");
			System.out.println("Ainda não pode se aposentar!");
		}
		if (idade <= 64 && inss < 30) {
			int resultado = 30 - inss;
			int resultado1 = 65 - idade;
			System.out.println("Ainda faltam " + resultado1 + " anos para completar idade.");
			System.out.println("Ainda faltam " + resultado + " anos de trabalho.");
			System.out.println("Ainda não pode se aposentar!");	
		}
		if (idade >= 65 && inss >= 30) {
			System.out.println("PARABÉNS TEM O DIREITO DE APOSENTAR!");
		}
	}
}
