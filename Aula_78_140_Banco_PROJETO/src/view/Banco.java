package view;

import java.util.ArrayList;
import java.util.Scanner;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Banco {

	static String nome = "Paulo Cardoso"; // Nome do Banco
	static Scanner sc = new Scanner(System.in); // Declarando Scanner
	static ArrayList<Conta> conta; // Array de Contas => Classe conta

	;

	public static void main(String[] args) {

		Banco.conta = new ArrayList<Conta>();
		Banco.menu();
	}

	public static void menu() {
		int opcao = 0;
		System.out.println("=================================");
		System.out.println("----- Seja Bem - Vindo (a)  -----");
		System.out.println("--------- Banco Cardoso ---------");
		System.out.println("=================================");
		System.out.println("Selecione uma opção no meu: ");
		System.out.print("1 - Criar conta \n2 - Efetuar saque \n3 - Efetuar depósito \n4 - Efetuar transferência \n5 - Listar contas \n6 - Sair do sistema: ");

		try {
			opcao = Integer.parseInt(Banco.sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Informe uma opção valida: ");
			Utils.pausar(1);
			Banco.menu();
		}

		switch (opcao) {

		case 1:
			Banco.criarConta();
			break;

		case 2:
			Banco.efetuarSaque();
			break;

		case 3:
			Banco.efetuarDeposito();
			break;

		case 4:
			Banco.efetuarTransferencia();
			break;

		case 5:
			Banco.listarContas();
			break;

		case 6:
			System.out.println("\nAté a próxima... \nAGRADEÇO PELA PREFERÊNCIA");
			Utils.pausar(2);
			System.exit(0);

		default:
			System.out.println("Opçaõ inválida...");
			Utils.pausar(2);
			Banco.menu();
			break;
		}
	}

	
	// MÉTODOS
	// CRIAR CONTA
	public static void criarConta() {
		System.out.println("\nInforme os dados do cliente:");

		System.out.print("Nome: ");
		String nome = Banco.sc.nextLine();

		System.out.print("E-mail:  ");
		String email = Banco.sc.nextLine();

		System.out.print("CPF:  ");
		String cpf = Banco.sc.nextLine();

		System.out.print("Data de Nacimento:  ");
		String data_nascimento = Banco.sc.nextLine();

		// Instanciando o cliente
		Cliente cliente = new Cliente(nome, email, cpf, Utils.stringParaData(data_nascimento));
		// Instanciando a conta
		Conta conta = new Conta(cliente);
		// Adicionando no Array de contas
		Banco.conta.add(conta);

		System.out.println("Conta criada com sucesso!!! \n");
		System.out.println("Dados da conta criada: ");
		System.out.println(conta);
		System.out.println();

		Utils.pausar(4);
		Banco.menu();
	}
	

	// EFETUAR SAQUE
	public static void efetuarSaque() {
		System.out.print("Informe o número da conta: ");
		int numero = Banco.sc.nextInt();

		Conta conta = Banco.buscarContaPorNumero(numero);

		if (conta != null) {
			System.out.print("Informe o valor para saque: ");
			Double valor = Banco.sc.nextDouble();

			conta.sacar(valor);
		} else {
			System.out.println("Não foi encontrada a conta numero: " + numero);
		}
		Utils.pausar(2);
		Banco.menu();
	}

	
	// EFETUAR DEPOSITO
	public static void efetuarDeposito() {
		System.out.print("Informe o numero da conta: ");
		int numero = Banco.sc.nextInt();

		Conta conta = Banco.buscarContaPorNumero(numero);

		if (conta != null) {
			System.out.print("Informe o valor de depósito: ");
			Double valor = Banco.sc.nextDouble();

			conta.depositar(valor);
		} else {
			System.out.println("Não foi encontrada a conta numero: " + numero);
		}
		Utils.pausar(2);
		Banco.menu();
	}
	

	// EFETUAR TRANSFERÊNCIA
	public static void efetuarTransferencia() {
		System.out.print("Informe o numero da conta: ");
		int numero_origem = Banco.sc.nextInt();

		Conta conta_origem = Banco.buscarContaPorNumero(numero_origem);

		if (conta_origem != null) {
			System.out.print("Informe o numero da conta destino: ");
			int numero_destino = Banco.sc.nextInt();

			Conta conta_destino = Banco.buscarContaPorNumero(numero_destino);

			if (conta_destino != null) {
				System.out.println("Informe o valor de transferência: ");
				Double valor = Banco.sc.nextDouble();

				conta_origem.transferir(conta_destino, valor);
			} else {
				System.out.println("A conta destino número " + numero_destino + " não foi encontrada.");
			}

		} else {
			System.out.println("Não foi encontrada a conta numero: " + numero_origem);
		}
		Utils.pausar(2);
		Banco.menu();
	}

	
	// LISTAR CONTAS
	public static void listarContas() {
		if (Banco.conta.size() > 0) {
			System.out.println("Listagem de contas \n");
			for (Conta contas : Banco.conta) {
				System.out.println(contas);
				System.out.println();
				Utils.pausar(1);
			}
			System.out.println();
		} else {
			System.out.println("Não exite conta cadastradas...");
		}
		Utils.pausar(2);
		Banco.menu();
	}
	
	
	// buscarContaPorNumero (Dentro de Efetuar Saque / efetuar Depósito)
	private static Conta buscarContaPorNumero(int numero) {
		Conta valor = null;
		if(Banco.conta.size() > 0) {
			for(Conta contas : Banco.conta) {
				if(contas.getNumero() == numero) {
					valor = contas;
				}
			}
		}
		return valor;
	}
}
