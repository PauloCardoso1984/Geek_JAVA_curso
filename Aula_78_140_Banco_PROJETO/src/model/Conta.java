package model;

import helper.Utils;

public class Conta {
	
	private static int codigo = 101;
	
	private int numero;
	private Cliente cliente;
	private Double saldo = 0.0;
	private Double limite = 0.0;
	private Double saldoTotal;
	
	// CONSTRUTORES	
	public Conta(Cliente cliente) {
		// Inserindo o codigo
		this.numero = Conta.codigo;
		// Incrementando o código
		Conta.codigo += 1;
		
		this.cliente = cliente;
		this.atualizaSaldoTotal(); // Atualizando o saldo total
	}
	

	// GET E SETERS
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
		this.atualizaSaldoTotal();
	}
	public int getNumero() {
		return numero;
	}
	public Double getSaldoTotal() {
		return saldoTotal;
	}
	
	//========================= se não funcionar tirar [] e return
	
	
	// MÉTODOS
	private Object[] atualizaSaldoTotal() {
		this.saldoTotal = this.getSaldo() + this.getLimite();
		return null;		
	}
	
	
	// METODOS ============================================================================
	// DEPOSITO
	public void depositar(Double valor) {
		if (valor > 0) {
			this.saldo = this.getSaldo() + valor;
			this.atualizaSaldoTotal();
			System.out.println("Depositado com sucesso na conta... -> " + cliente.getNome());
		}else {
			System.out.println("Conta: " + cliente.getNome() + " ERRO ao tentar depositar, valor tem se quer maior que R$ 0,01. "
					+ "\nTente novamente..."
					+ "\nSaldo: " + getSaldoTotal() + "\n");
		}
	}
	
	
	// SACAR
	public void sacar(Double valor) {
		if (valor > 0 && this.getSaldoTotal() >= valor) {
			if(this.getSaldo() >= valor) {
				this.saldo = this.getSaldo() - valor;
				this.atualizaSaldoTotal();
				System.out.printf("Saque de R$ " + valor + " efetuado com sucesso... \n");
			} else {
				Double restante = this.getSaldo() - valor;
				this.limite = this.getLimite() + restante;
				this.saldo = 0.0;
				this.atualizaSaldoTotal();
				System.out.printf("Saque de R$ " + valor + " efetuado com sucesso...");
			}
		} else {
			System.out.println("Saque de R$ " + valor + " não realizado... \nTente novamente!!!");
		}
	}
	
	
	// TRANSFERIR
	public void transferir (Conta destino, Double valor) {
		if (valor > 0 && this.getSaldo() >= valor) {
			if(this.getSaldo() >= valor) {
				this.saldo = this.getSaldo() - valor;
				destino.saldo = destino.getSaldo() + valor;
				this.atualizaSaldoTotal();
				destino.atualizaSaldoTotal();
				System.out.printf("Transferência realizada com sucesso. \nSaldo: ", getSaldoTotal() + "\n");
			} else { 
				Double restante = this.getSaldo() - valor;
				this.limite = this.getLimite() + restante;
				this.saldo = 0.0;
				destino.saldo = destino.getSaldo() + valor;
				this.atualizaSaldoTotal();
				destino.atualizaSaldoTotal();
				System.out.printf("Transferência realizada com sucesso. \nSaldo: ", getSaldoTotal() + "\n");
			}
			
		} else {
			System.out.printf("Transferência não realizada. Tento novamente. \nNão tem saldo: ", getSaldoTotal() + "\n");
		}
		
	}


	@Override
	public String toString() {
		return "======= CLASSE CONTA =======" + // FORMATADO AS DATAS UTILIZANDO A CLASSE Utils
				"\nConta: " + numero + 
				"\nCliente: " + cliente + 
				"\nSaldo: " + Utils.doubleParaString(saldo) + 
				"\nLimite: " + Utils.doubleParaString(limite) + 
				"\nSaldo Total: " + Utils.doubleParaString(saldoTotal) + 
				"\n";
	}
}
