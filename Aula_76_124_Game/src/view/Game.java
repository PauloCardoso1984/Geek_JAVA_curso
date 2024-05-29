package view;

import java.util.Scanner;

import model.Calcular;

public class Game {

	// INICIALIZADO FORA DO main
	static Scanner sc = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Game.jogar();

	}

	// METODO
	public static void jogar() {

		System.out.println("Informe o nível de dificuldade: ");
		System.out.print("[1] - Fácil \n[2] - Intermediário \n[3] - Dificil \n[4] - Insano");
		System.out.print("\nNível: ");
		int dificuldade = Game.sc.nextInt();

		// INSTANCIANDO UM OBJETO CALCULADOR
		Game.calc = new Calcular(dificuldade);

		System.out.println("\nInforme o resultado para a seguinte operação: ");

		// Somar
		if (calc.getOperacao() == 1) {
			System.out.print(calc.getValor1() + " + " + calc.getValor2() + " = ");
			int resposta = Game.sc.nextInt();

			if (calc.somar(resposta)) {
				// Ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " pontos(s).");
			}
		}

		// Subtrair
		if (calc.getOperacao() == 2) {
			System.out.print(calc.getValor1() + " - " + calc.getValor2() + " = ");
			int resposta = Game.sc.nextInt();

			if (calc.subtrair(resposta)) {
				// Ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " pontos(s).");
			}
		}

		// Multiplicar
		else if (calc.getOperacao() == 3) {
			System.out.print(calc.getValor1() + " x " + calc.getValor2() + " = ");
			int resposta = Game.sc.nextInt();

			if (calc.multiplicar(resposta)) {
				// Ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " pontos(s).");
			}
		}


		// Dividir
		else if (calc.getOperacao() == 4) {
			System.out.print(calc.getValor1() + " / " + calc.getValor2() + " = ");
			int resposta = Game.sc.nextInt();

			if (calc.dividir(resposta)) {
				// Ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " pontos(s).");
			}
		}
		
		else {
			System.out.println("A opercação " + calc.getOperacao() + " não é reconhecida.");
		}
		
		System.out.println("\nDeseja continuar?");
		System.out.println("1 - Sim \n2 - Não");
		int continuar = Game.sc.nextInt();
		
		if (continuar == 1) {
			Game.jogar();
		} else {
			System.out.println("Você fez  " + Game.pontos + " pontos.");
			System.out.println("Game finalizado. Parabéns!!!");
			System.exit(0);
		}
		
		sc.close();
	}
}
