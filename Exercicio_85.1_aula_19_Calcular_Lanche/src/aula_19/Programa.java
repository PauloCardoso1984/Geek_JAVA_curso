package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia o código do produto de um cardápio de uma \n"
				+ "lanchonete e a quantidade. O programa deve calcular o valor a ser pago por \n"
				+ "aquele lanche e encerrar o programa quando digitar fim. \n"
				+ "	ESPECIFICAÇÃO		CODIGO		PREÇO \n"
				+ " Cachorro quente		100		1.20 \n"
				+ " Bauru Simples			101		1.30 \n"
				+ " Bauru com ovo			102		1.50 \n"
				+ " Hamburguer			103		1.20 \n"
				+ " Chessburguer			104		1.70 \n"
				+ " Suco				105		2.20 \n"
				+ " Refrigerante			106		1.00 ");
		System.out.println();

        int codigo;
        int quantidade;
        double total = 0;

        // ENQUANTO FOR VERDADEIRO - FAÇA
        while (true) {
            System.out.print("Código do produto (ou 'fim' para encerrar): ");
            String input = sc.nextLine();

            if (input.equals("fim")) {
                break;
            }

            codigo = Integer.parseInt(input);

            System.out.print("Quantidade: ");
            quantidade = sc.nextInt();

            switch (codigo) {
                case 100:
                    total += 1.2 * quantidade;
                    break;
                case 101:
                    total += 1.3 * quantidade;
                    break;
                case 102:
                    total += 1.5 * quantidade;
                    break;
                case 103:
                    total += 1.2 * quantidade;
                    break;
                case 104:
                    total += 1.7 * quantidade;
                    break;
                case 105:
                    total += 2.2 * quantidade;
                    break;
                case 106:
                    total += 1.0 * quantidade;
                    break;
                // adicione outros casos para outros produtos do cardápio
                default:
                    System.out.println("Código inválido!");
                    break;
            }
            sc.nextLine(); // Limpar o buffer do teclado
            System.out.println();
            }
        System.out.println("Total a ser pago: R$" + total);

        sc.close();
    }
}
