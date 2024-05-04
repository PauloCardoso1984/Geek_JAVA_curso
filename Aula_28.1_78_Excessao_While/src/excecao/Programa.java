package excecao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		float n1 = 0, n2 = 0;

		System.out.print("Digite o 1º numero: ");
		n1 = tc.nextInt();

		System.out.print("Digite o 2º numero: ");
		n2 = tc.nextInt();

		while (n1 > 0 && n2 > 0) {
			try {
				System.out.print("A divisão será: " + (divisao(n1, n2)) + "\n");
			} catch (ArithmeticException e) {
				System.out.println("Ocorreu uma exeção...");
			} catch (Exception e) {
				System.out.println("Impossivel essa divisão...");
			}
			System.out.print("\nDigite o 1º numero: ");
			n1 = tc.nextInt();

			System.out.print("Digite o 2º numero: ");
			n2 = tc.nextInt();
		}

		System.out.println("\nSistema encerrado. Não pode ter 0 na divisão....");

		tc.close();
	}

	// CRIANDO UMA FUNAÇÃO QUE AVISA QUE TEMM POSSIBILIDADE DE LANÇAR EXCESSAO
	// DO TIPO EXCEPTION
	public static float divisao(float n1, float n2) throws Exception {
		return (float) n1 / (float) n2;
	}
}
