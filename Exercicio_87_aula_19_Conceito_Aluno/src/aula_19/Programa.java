package aula_19;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Leia a nota e número de falta de um aluno e qualifique-o");
		System.out.println();

		System.out.print("Qual é a nota? ");
		double nota = sc.nextDouble();

		System.out.print("Quantas foram as faltas? ");
		double falta = sc.nextDouble();

		// FAZENDO AS VERIFICAÇÕES
		if (nota >= 9 && nota <= 10 && falta < 20) {
			System.out.println("Aluno EXCELENTE PARABÉNS. Nota " + nota + ", Faltas: " + falta);
		}
		else if (nota >= 9 && nota <= 10 && falta >= 20) {
			System.out.println("Aluno MUITO BOM. Nota " + nota + ", Faltas: " + falta);
		}
		else if (nota >= 7.5 && nota <= 8.9 && falta <= 20) {
			System.out.println("Aluno MUITO BOM. Nota " + nota + ", Faltas: " + falta);
		}
		else if (nota >= 7.5 && nota <= 8.9 && falta >= 20) {
			System.out.println("Aluno BOM. Nota " + nota + ", Faltas: " + falta);
		}
		else if (nota >= 5 && nota <= 7.4 && falta <= 20) {
			System.out.println("Aluno BOM. Nota " + nota + ", Faltas: " + falta);
		}		
		else if (nota >= 5 && nota <= 7.4 && falta >= 20) {
			System.out.println("Aluno REGULAR. Nota " + nota + ", Faltas: " + falta);
		}
		else if (nota >= 4.0 && nota <= 4.9 && falta <= 20) {
		System.out.println("Aluno REGULAR. Nota " + nota + ", Faltas: " + falta);
		}
		else if (nota >= 4.0 && nota <= 4.9 && falta >= 20) {
		System.out.println("Aluno RUIM. Nota " + nota + ", Faltas: " + falta);
		}		
		else if (nota >= 0.0 && nota <= 3.9 && falta <= 20) {
		System.out.println("Aluno MUITO RUIM. Nota " + nota + ", Faltas: " + falta);
		}
		else if (nota >= 0.0 && nota <= 3.9 && falta >= 20) {
		System.out.println("Aluno PÉSSIMO RUIM. Nota " + nota + ", Faltas: " + falta);
	}

		sc.close();
	}
}