package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Calcule as raizes da equação de 2º grau, BASKARA.");
		System.out.println();

		System.out.println("x2 + x + ? = 0, onde: ");
		System.out.println("a = x2 \n"
				+ "b = x \n"
				+ "c = ?");
		System.out.println();
		
		System.out.println("Informe os valores");
		System.out.print("x2 ou a: ");
		float a = sc.nextInt();
		System.out.print("x ou b: ");
		float b = sc.nextInt();
		System.out.print("? ou c: ");
		float c = sc.nextInt();
		
		// CALCULANDO O DELTA
		double delta = ((b * b) - (4 * a * c));
		double delta1 =  Math.sqrt(delta);
		if (delta < 0) {
			System.out.println("Delta Inválido");
			sc.close();
		}
		
		// CALCULADO AS RAIZES
		double x = (-b + delta1) / (2 * a);
		double y = (-b - delta1) / (2 * a);
		
		System.out.println();
		
		System.out.println("Valores digitados foram " + a + ", " + b + "," + " e " + c);
		System.out.println("Valor das raizes x = " + x + ", y = " + y);
		
		sc.close();
	}
}
