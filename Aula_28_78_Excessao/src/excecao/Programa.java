package excecao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
			
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Dite o 1º numero: ");
		int n1 = tc.nextInt();
		
		System.out.print("Digite o 2º numero: ");
		int n2 = tc.nextInt();
		
		try {
			System.out.print("A divisão será: " + (divisao(n1, n2)));
		} catch(ArithmeticException e) {
			System.out.println("Ocorreu uma exeção...");
		} catch (Exception e) {
			System.out.println("Impossivel essa divisão...");
		}
		tc.close();
	}
	// CRIANDO UMA FUNAÇÃO QUE AVISA QUE TEMM POSSIBILIDADE DE LANÇAR EXCESSAO
	// DO TIPO EXCEPTION
	public static int divisao(int n1, int n2) throws Exception {
		return n1 / n2;
	}
}
