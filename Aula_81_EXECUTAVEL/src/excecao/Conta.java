package excecao;

public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente; // Esse atributo só é possivel porque existe a classe cliente
	
	// CONSTRUTOR VAZIO
	public Conta() {
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	// Get e Set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// MÉTODOS
	// SAQUE
	void sacar(float valor) {
		// REGRA DE NEGÓCIO
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso...");
		}
		else if (valor <= this.saldo + this.limite) {
			// CALCULANDO O VALOR EXCEDENTE DO SAQUE
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso...");
			System.out.println();
		}else {	
			System.out.println("Saldo insuficiente");
		}
	}
	// DEPÓSITO
	void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	// RETORNAR O SALDO
	public float getSaldo() {
		return this.saldo + this.limite;
	}
}
