package excecao;

import java.util.Scanner;

public class Executavel {
	

	// TUDO FORA DO ESCOPO JAVA
	static Cliente cliente = new Cliente("Paulo Cardoso", "Rua Felicidade, 1000");
	static Conta conta = new Conta(1234, 5000, 9000, cliente);
	static Scanner teclado = new Scanner(System.in);

	// METODO PARA REALIZAR O DEPOSITO
	public static void depositar() {
		System.out.println();
		System.out.println("========== Depósito ==========");
		System.out.print("Informe o valor para depósito: R$ ");
		float valor = teclado.nextFloat();
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Depósito efetuado com sucesso...");
		} else {
			System.out.println("O valor precisa ser positivo...");
		}
	}

	// METODO PARA REALIZAR O SAQUE
	public static void sacar() {
		System.out.println();
		System.out.println("========== Sacar ==========");
		System.out.print("Informe o valor para saque: R$ ");
		float valor = teclado.nextFloat();
		if (valor > 0) {
			conta.sacar(valor);
		} else {
			System.out.println("O valor precisa ser positivo...");
		}
	}

	// METODO PARA REALIZAR A CONSULTA
	public static void consultar() {
		System.out.println("Seu saldo é R$ " + conta.getSaldo());
	}
	
	// CLASSE main
	public static void main(String[] args) {

		int opcao = 0;
		
		System.out.println("Bem-vindoa ao Banco Cardoso");
		
		do {
			System.out.println();
			System.out.println("Selecione uma opção abaixo:");
			System.out.println("1 - Depositar \n2 - Sacar \n3 - Consultar Saldo \n0 - Sair");
			System.out.print("Digite a opção desejada: ");
			opcao = teclado.nextInt();
			
			// DENTRO DO do while
			switch (opcao) {
			case 1: 
				depositar();
				break;
			case 2: 
				sacar();
				break;
			case 3: 
				consultar();
				break;
			case 0: 
				System.out.println("\nPrograma encerrado... \nVOLTE SEMPRE");
				break;				
			default:
				System.out.println("Opção inválida");
				break;
			}
		// PRIMEIRO EXECUTA DEPOIS VALIDA
		} while (opcao > 0);
		teclado.close();
	}
}