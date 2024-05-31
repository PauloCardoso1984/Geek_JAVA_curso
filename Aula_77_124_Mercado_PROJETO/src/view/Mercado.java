package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import helper.Utils;
import model.Produto;

public class Mercado {

	// INICIALIZADO FORA DO main
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;

	// main
	public static void main(String[] args) {
		produtos = new ArrayList<Produto>();
		carrinho = new HashMap<Produto, Integer>();
		Mercado.menu();


	}

	// METODOS
	// MENU
	private static void menu() {
		System.out.println("==============================");
		System.out.println("======== Bem-vindo(a) ========");
		System.out.println("======  Paulo  Cardoso  ======");
		System.out.println("==============================");

		System.out.println("Selecione uma opção abaixo: ");
		System.out.print(
				"1 - Cadastrar produtos \n2 - Listar Produtos \n3 - Comprar produtos \n4 - Visualizar carrinho \n5 - Sair do sistema \nOpção: ");

		

		try {
			opcao = Integer.parseInt(Mercado.sc.nextLine());
		} catch (InputMismatchException e) {
			Mercado.menu();
		} catch (NumberFormatException f) {
			Mercado.menu();
		}
		
		int opcao = 0;

		switch (opcao) {

		case 1:
			Mercado.cadastrarProduto();
			break;
			
		case 2:
			Mercado.listarProdutos();
			break;

		case 3:
			Mercado.comprarProduto();
			break;

		case 4:
			Mercado.visualizarCarrinho();
			break;

		case 5:
			System.out.println("Volte sempre!");
			// Vai pausar por 5 egundos o sistema
			Utils.pausar(5);
			// Finalizar o sistema
			System.exit(0);

		default:
			System.out.println("Opção inválida.");
			Utils.pausar(5);
			Mercado.menu();
			break;
		}
	}

	// CADASTRAR PRODUTO ==============================================================
	private static void cadastrarProduto() {
		System.out.println("\nCadastro do Produto");
		System.out.println("= = = = = = = = = = = = ");
		
		System.out.print("Informe o Produto: ");
		String nome = Mercado.sc.nextLine();
		
		System.out.print("Valor do Produto: ");
		Double preco = Mercado.sc.nextDouble();
		
		// Instanciando
		Produto produto = new Produto(nome, preco);
		
		// Adicionando
		Mercado.produtos.add(produto);
		
		System.out.println("O produto " + produto.getNome() + " foi cadastrado com suceso...\n");
		Utils.pausar(2);
		Mercado.menu();		
	}
	
	
	// LISTAR PRODUTO  ==============================================================
	private static void listarProdutos() {
		if (Mercado.produtos.size() > 0) {
			System.out.println("Listagem de produtos");
			System.out.println();
			for (Produto p : Mercado.produtos) {
				System.out.println(p);
				System.out.println();
			}
		}else {
			System.out.println("Ainda não existe produtos cadastrados.\n");
		}
		Utils.pausar(2);
		Mercado.menu();
	}
	
	
	// COMPRAR PRODUTO ==============================================================
	private static void comprarProduto() {
		if(Mercado.produtos.size() > 0) {
			System.out.println("Informe o código do produto que deseja comprar: \n");
			System.out.println("Produtos disponíveis:");
			for (Produto p : Mercado.produtos) {
				System.out.println(p);
				System.out.println("==============================");
			}
			int codigo = Integer.parseInt(Mercado.sc.nextLine());
			boolean tem = false;
			for (Produto p : Mercado.produtos) {
				if (p.getCodigo() == codigo) {
					int quant = 0;
					try {
						quant = Mercado.carrinho.get(p);
						// Se tiver o produto no carrinho atualize a quantidade
						Mercado.carrinho.put(p, quant + 1);
					} catch (NullPointerException e) {
						// Primeiro produto no carrinho
						Mercado.carrinho.put(p, 1);						
					}
					System.out.println("O produto " + p.getNome() + " foi adicionado ao carrinho.");
					tem = true;
				}
				if (tem) {
					System.out.println("Deseja adicionar outros produtos ao carrinho? ");
					System.out.print("Informe: \n1 - Sim \n0 - Não: ");
					int op = Integer.parseInt(Mercado.sc.nextLine());
					
					if (op == 1) {
						Mercado.comprarProduto();
					} else {
						System.out.println("Por favor aguarde enquanto fechamos seu pedido...");
						Utils.pausar(2);
						Mercado.fecharPedido();
					}
				} else {
					System.out.println("Não foi encontrado o produto com o código:");
					Utils.pausar(2);
					Mercado.menu();
				}
			}

		} else {
			System.out.println("Ainda não existe produto cadastrado no mercado. ");
			Utils.pausar(2);
			Mercado.menu();
		}
	}
	
	
	// VIZUALIZAR PRODUTO ==============================================================
	private static void visualizarCarrinho() {
		if (Mercado.carrinho.size() > 0) {
			System.out.println("Produtos no carrinho:");
			
			for (Produto p : Mercado.carrinho.keySet()) {
				System.out.println("Produto: " + p +  "\nQuantidade: " + Mercado.carrinho.get(p));
			}
			
		} else {
			System.out.println("Carrinho vazio...");
		}
		
		Utils.pausar(2);
		Mercado.menu();			
	}
	
	
	// FECHAR PEDIDO ==================================================================
	private static void fecharPedido() {
		Double valorTotal = 0.0;
		System.out.println("Produtos do carrinho");
		System.out.println("----------------------");
		for (Produto p : Mercado.carrinho.keySet()) {
			int quant = Mercado.carrinho.get(p);
			valorTotal += p.getPreco() * quant;
			System.out.println(p);
			System.out.println("Quantidade: " + quant);
			System.out.println("----------------------");
		}
		System.out.println("Sua fatura é " + Utils.doubleParaString(valorTotal));
		// Limpando o carrinho
		Mercado.carrinho.clear();
		System.out.println("Obrigado pela preferência...");
		Utils.pausar(5);
		Mercado.menu();
	}
}