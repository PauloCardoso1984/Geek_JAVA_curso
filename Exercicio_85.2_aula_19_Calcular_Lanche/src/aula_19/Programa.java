package aula_19;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia o código do produto de um cardápio de uma \n"
				+ "lanchonete e a quantidade. O programa deve calcular o valor a ser pago por \n"
				+ "aquele lanche e encerrar o programa quando digitar 0. \n"
				+ "	ESPECIFICAÇÃO		CODIGO		PREÇO \n"
				+ " Cachorro quente		100		1.20 \n"
				+ " Bauru Simples			101		1.30 \n"
				+ " Bauru com ovo			102		1.50 \n"
				+ " Hamburguer			103		1.20 \n"
				+ " Chessburguer			104		1.70 \n"
				+ " Suco				105		2.20 \n"
				+ " Refrigerante			106		1.00 ");
		System.out.println();

        Map<String, Double> cardapio = new HashMap<>();
        cardapio.put("100", 1.20);
        cardapio.put("101", 1.30);
        cardapio.put("102", 1.50);
        cardapio.put("103", 1.20);
        cardapio.put("104", 1.70);
        cardapio.put("105", 2.20);
        cardapio.put("106", 1.00);
        
        double total = 0.0;
        
        while (true) {
            System.out.print("Digite o código do produto:\n"
            		+ "ESPECIFICAÇÃO		CODIGO		PREÇO \n"
            		+ " Cachorro quente		100		1.20 \n"
            		+ " Bauru Simples			101		1.30 \n"
            		+ " Bauru com ovo			102		1.50 \n"
            		+" Hamburguer			103		1.20 \n"
            		+" Chessburguer			104		1.70 \n"
            		+ " Suco				105		2.20 \n"
            		+" Refrigerante			106		1.00 \n"
            		+ "\n"
            		+ "Codigo ou 0 para encerrar: ");
            
            String codigo = sc.nextLine();
            
            if (codigo.equals("0")) {
            	System.out.println("Encerrando");
            	System.out.println();
                break;
            }
            
            if (!cardapio.containsKey(codigo)) {
                System.out.println("Código de produto inválido!");
                continue;
            }
            
            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner
            
            double preco = cardapio.get(codigo);
            double subtotal = preco * quantidade;
            total += subtotal;
            
            System.out.println("Valor a pagar pelo lanche: R$" + subtotal);
            System.out.println();
        }

        System.out.printf("Total a pagar: R$ %.2f%n", total);
        
        sc.close();
    }
}