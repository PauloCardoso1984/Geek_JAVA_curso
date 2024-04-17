package aula_19;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Random rand = new Random();

		System.out.println(
				"Faça uma prova de matemática para crianças que estão aprendendo a subtrair números inteiros \n"
				+ "menores do que 100. Escolha números aleatórios entre 1 e 100, e mostre na tela a pergunta: \n"
				+ "qual é a soma de a - b, onde a e b são os números aleatórios. Peça a resposta. Faça cinco \n"
				+ "perguntas ao aluno, e mostre para ele as perguntas e as respostas corretas, além de quantas \n"
				+ "vezes o aluno acertou.");
		System.out.println();

		int acertos = 0;

		for (int i = 0; i < 5; i++) {
			int a = rand.nextInt(100) + 1;
			int b = rand.nextInt(100) + 1;
			int resposta;

			System.out.print("Qual é a subtração de " + a + " - " + b + "? ");
			resposta = sc.nextInt();

			if (resposta == a - b) {
				System.out.println("Resposta correta!");
				acertos++;
			} else {
				System.out.println("Resposta incorreta! A resposta correta é " + (a - b));
			}
			System.out.println();
		}
		System.out.println("Você acertou " + acertos + " perguntas.");
	}
}
