package listasSequencial;

public class Cliente {
	Integer idade;
	String nome;
	String endereço;
	
	// CONSTRUTOR VAZIO
	public Cliente() {
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Cliente(Integer idade, String nome, String endereço) {
		this.idade = idade;
		this.nome = nome;
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		return " Idade = " + idade + ", Cliente = " + nome + ", Endereço = " + endereço;
	}	
	
	
}
