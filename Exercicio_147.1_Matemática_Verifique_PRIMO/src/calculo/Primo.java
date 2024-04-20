package calculo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que receba um número maior que 1, e verifique se o "
				+ "numéro é primo ou não, terminar quando digitar 0.");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Digite um número maior que 1 (ou 0 para sair): ");
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("Programa encerrado...");
				break;
			} else if (num <= 1) {
				System.out.println("Número inválido. Digite um número maior que 1.");
				System.out.println();
			} else {
				boolean primo = true;
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						primo = false;
						break;
					}
				}

				if (primo) {
					System.out.println(num + " é um número primo.");
					System.out.println();
				} else {
					System.out.println(num + " não é um número primo.");
					System.out.println();
				}
			}
		}
		sc.close();
	}
}