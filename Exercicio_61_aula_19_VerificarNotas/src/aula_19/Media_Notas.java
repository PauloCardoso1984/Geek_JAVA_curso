package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Media_Notas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia 2 notas de um aluno, verifique se as notas são válidas e \n"
				+ " na tela a média destas notas. Uma nota valida deve ser, obrigatoriamente, um valor entre 0.0 \n"
				+ "e 10.0, onde caso a nota não possua um  valor válido, este deve ser informado ao usuário e o \n"
				+ "programa termine.");
		System.out.println();

		System.out.print("Digite a 1º nota: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a 2º nota: ");
		double nota2 = sc.nextDouble();

		// VERIFICAÇÃO
		while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			System.out.println("O número digitado é negativo ou maior que 10. INVÁLIDO!!!");
			System.out.println("Notas apenas entre 0 a 10.");
			System.out.println();
			
			System.out.print("Digite a 1ª nota: ");
			nota1 = sc.nextDouble();
			System.out.print("Digite a 2ª nota: ");
			nota2 = sc.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println();
		System.out.println("As notas digitadas foram 1º nota " + nota1 + " e 2ª nota " + nota2);
		System.out.println("A média deste aluno é: " + media);
		
		sc.close();
	}
}