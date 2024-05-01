package estaticos;

public class Conta {
	
	private int numero;
	private String cliente;
	
	// CRIANDO UMA CONTA COM NUMERO SEQUENCIAL
	public static int contador = 1;
	
	// CONSTRUTOR COM ARGUMENTOS
	public Conta(String cliente) {
		// SUBSTITUIR this. numero POR contador
		this.numero = contador;
		this.cliente = cliente;
		// NÚMERO SERÁ INCREMENTADO AUTOMATICAMENTE
		Conta.contador = Conta.contador + 1;
	}
		
	// GET e SET
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	// toString
	@Override
	public String toString() {
		return "Conta = " + numero + " \nCliente = " + cliente + "\n";
	}	
}
