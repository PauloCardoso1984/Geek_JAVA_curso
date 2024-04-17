package aula_43;

public class Pessoa {
	
	String nome;
	String email;
	int ano_nacimento;
	
	// CONSTRUTOR VAZIO
	public Pessoa() {
	}
	
	// CONSTRUTOR COM PARÂMETRO
	public Pessoa(String nome, String email, int ano_nacimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.ano_nacimento = ano_nacimento;
	}
	
	@Override
	public String toString() {
		return "Nome = " + nome + ", email = " + email + ", Ano de nacimento = " + ano_nacimento ;
	}
}
