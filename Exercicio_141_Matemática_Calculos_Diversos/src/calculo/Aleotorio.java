
package calculo;

import java.util.Scanner;

public class Aleotorio {

	public static void main(String[] args) {
		System.out.println("Faça um programa que apresente um menu de opções para o "
				+ "calculo das seguintes operações entre dois números: /n"
				+ "* 1 - adição, /n"
				+ "* 2 - subtração, /n"
				+ "* 3 - multiplicação, /n"
				+ "* 4 - divisão, /n"
				+ "* 5 - exponeciação, /n"
				+ "* 6 - radiciação, /n"
				+ "* 9 - sair. /n"
				+ "O programa deve possibilitar ao usuário a escolha da operação desejada, "
				+ "a exibição do resultado e a volta ao menu de opções. O programa só termina quando for escolhida a opção da sair.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int opcao = 1;
		int a, b;

		while (opcao != 9) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Exponenciação");
			System.out.println("6 - Radiciação");
			System.out.println("9 - Sair....");
			System.out.print("Digite a opção: ");

			opcao = sc.nextInt();
			
			System.out.println();

			switch (opcao) {
			case 1:
				System.out.println("Digite dois valores: ");
				a = sc.nextInt();
				b = sc.nextInt();				
				System.out.println("A soma de " + a + " + " + b + " é  = " + (a+b));
				System.out.println();
				break;
			case 2:
				System.out.println("Digite dois valores: ");
				a = sc.nextInt();
				b = sc.nextInt();				
				System.out.println("A diferença de " + a + " - " + b + " é  = " + (a-b));
				System.out.println();
				break;
			case 3:
				System.out.println("Digite dois valores: ");
				a = sc.nextInt();
				b = sc.nextInt();				
				System.out.println("A multiplição de " + a + " * " + b + " é  = " + (a*b));
				System.out.println();
				break;
			case 4:
				System.out.println("Digite dois valores: ");
				a = sc.nextInt();
				b = sc.nextInt();				
				System.out.println("A Divisão de " + a + " / " + b + " é  = " + (a/b));
				System.out.println();
				break;
			case 5:
				System.out.println("Digite dois valores: ");
				a = sc.nextInt();
				b = sc.nextInt();				
				System.out.println("A exponenciação de base " + a + " e o expoente " + b + " é  = " + (Math.pow(a, b)));
				System.out.println();
				break;
			case 6:
				System.out.println("Digite dois valores: ");
				a = sc.nextInt();
				b = sc.nextInt();				
				System.out.println("A raiz quadrada de " + a + " é = " + (Math.sqrt(a)));
				System.out.println("A raiz quadrada de " + b + " é = " + (Math.sqrt(b)));
				System.out.println();
				break;
			case 9:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Digite novamente.");
			}
		}

		sc.close();
	}
}