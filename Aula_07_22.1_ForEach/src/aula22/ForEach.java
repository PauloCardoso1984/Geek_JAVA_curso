// ForEach

// Receba dados do usuario enquanto a idade for maior que 0
package aula22;

import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {

		// Variaveis
		String nome = "Paulo Cardoso";

		// Receber dados do usuário via teclado
		Scanner sc = new Scanner(System.in);

		// Para cada um dos caracteres da string, primipa o caractere
		// FOR → Para EACH → Cada
		// Um abaixo do outro
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
		}
		
		System.out.println();
		
		// Um após o outro
		for (char letra : nome.toCharArray()) {
			System.out.print(letra);
		}
		sc.close();
	}
}