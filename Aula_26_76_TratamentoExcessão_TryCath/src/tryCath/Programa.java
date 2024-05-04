package tryCath;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		// DIVISÃO POR 0 DARÁ ERRO
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número para divisão: ");
		int n1 = tc.nextInt();
		
		System.out.print("Informe o segundo número para divisão: ");
		int n2 = tc.nextInt();
		
		float result = (float) n1 / (float) n2;
		
		try {
			System.out.print("A divisão do 1º numero " + n1 + ", pelo 2º numero " + n2 + " é = " + result);
		} catch (ArithmeticException e) {
			System.out.println("Caiu na excessão → A divisão do " + n1 + " por "+ n2 + ". Impossivel divisão por 0.");
		}

		tc.close();
	}
}
