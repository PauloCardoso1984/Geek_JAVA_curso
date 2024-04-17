package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Determine se um determinado ano lido é bissexto. Sendo que um ano é bissexto se \n"
				+ "for divisivel por 400 ou se for divisivel por 4 e não for divisivel por 100. Por exemplo: \n"
				+ "1988, 1992, 1996.");
		System.out.println();

		System.out.print("Digite o ano de pesquisa: ");
		int ano = sc.nextInt();
		
		// VERIFICACAO
		if (ano % 4 == 0 && ano % 100 != 0 ) {
			System.out.println("O ano " + ano + " é bissexto");
		} else {
			System.out.println("O ano " + ano + " não é bissexto");
		}
		sc.close();
	}
}
