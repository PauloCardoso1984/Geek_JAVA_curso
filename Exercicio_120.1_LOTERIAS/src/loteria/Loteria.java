package loteria;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Loteria {

	public static void main(String[] args) {

		HashSet<Integer> numerosLotomania = new HashSet<>();
		Set<Integer> numerosMegaSena = new TreeSet<>();
		Set<Integer> numerosDuplaSena = new TreeSet<>();
		Set<Integer> numerosQuina = new TreeSet<>();

		Random random = new Random();

		Scanner sc = new Scanner(System.in);

		int opcao = 1;

		while (opcao != 0) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Mega-Sena");
			System.out.println("2 - Dupla-Sena");
			System.out.println("3 - Lotomania");
			System.out.println("4 - Quina");
			System.out.println("0 - SAIR....");
			System.out.print("Digite a opção: ");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("MESA-SENA: ");
				while (numerosMegaSena.size() < 6) {
					int numeroMegaSena = random.nextInt(60);
					numerosMegaSena.add(numeroMegaSena);
				}
				System.out.println(numerosMegaSena + " ");
				break;

			case 2:
				System.out.print("DUPLA-SENA: ");
				while (numerosDuplaSena.size() < 15) {
					int numeroDuplaSena = random.nextInt(50);
					numerosDuplaSena.add(numeroDuplaSena);
				}
				System.out.println(numerosDuplaSena + " ");
/*				// UM ABAIXO DO DO OUTRO
				for (int numero : numerosDuplaSena) {
					System.out.print(numero + " - ");					
				} */
				break;

			case 3:
				System.out.print("LOTOMANIA: ");
				while (numerosLotomania.size() < 50) {
					int numeroLotomania = random.nextInt(100);
					numerosLotomania.add(numeroLotomania);
				}
				System.out.println(numerosLotomania + " ");
/*				UM ABAIXO DO DO OUTRO
				for (int numero : numerosLotomania) {
					System.out.print(numero + " - ");
				} */
				break;

			case 4:
				while (numerosQuina.size() < 5) {
					int numeroQuina = random.nextInt(50);
					numerosQuina.add(numeroQuina);
				}
				System.out.println(numerosQuina + " ");
/*				
				for (int numero : numerosLotomania) {
					System.out.print(numero + " - ");
				} */
				break;

			case 5:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Digite novamente.");
			}
			System.out.println();
		}

		sc.close();
	}
}
