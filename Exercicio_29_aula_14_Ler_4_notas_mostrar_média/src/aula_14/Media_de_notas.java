package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Media_de_notas {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Fazer um programa para ler 04 notas e dividir pela média (4) e mostrar o resultado, \n"
				+ "sendo a nota que 5.0 esse aluno seja APROVADO e menor de 5.0 REPROVADO");
		System.out.println();
		
		System.out.print("Digite o valor da 1ª nota: ");
		double nota1 = sc.nextFloat();
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("Favor utilizar notas entre 0 e 10.");
		}
		System.out.print("Digite o valor da 2ª nota: ");
		double nota2 = sc.nextFloat();
		if (nota2 < 0 || nota2 > 10) {
			System.out.println("Favor utilizar notas entre 0 e 10.");
		}
		System.out.print("Digite o valor da 3ª nota: ");
		double nota3 = sc.nextFloat();
		if (nota3 < 0 || nota3 > 10) {
			System.out.println("Favor utilizar notas entre 0 e 10.");
		}
		System.out.print("Digite o valor da 4ª nota: ");
		double nota4 = sc.nextFloat();
		if (nota4 < 0 || nota4 > 10) {
			System.out.println("Favor utilizar notas entre 0 e 10.");
		}

		// MÉTODO SOMAR AS NOTAS E DIVIDIR PELA MÉDIA
		Double soma = nota1 + nota2 + nota3 + nota4;
		
		Double media = soma / 4; 
		
		if (media < 5 ) {
			System.out.println("Aluno REPROVADO, PRECISA ESTUDAR MAIS!!!");
		} 
		else {
			if (media > 5.1 && media < 7.0) {
				System.out.println("Aluno APROVADO, NO LIMITE!!!");
			}
			if (media > 7 && media <= 10) {
				System.out.println("Aluno APROVADO, CONTINUE ASSIM, PARABÉNS!!!");
			}
		}
			System.out.println();
		
		System.out.printf("As notas foram: 1ª nota = %.2f%n", nota1, ", 2ª nota = %.2f%n ", nota2, ", 3ª nota = %.2f%n ", nota3, ", 4ª nota = %.2f%n ", nota4);
		// AO COLOCAR %.2f%n SERÁ IMPRESSO APENAS 2 CASAS APÓS A VÍRGULA
		System.out.printf("O valor somado das notas é de: %.2f%n", soma);
		System.out.printf("A média deste aluno foi de: %.2f%n", media);
		
		sc.close();
	}
}
