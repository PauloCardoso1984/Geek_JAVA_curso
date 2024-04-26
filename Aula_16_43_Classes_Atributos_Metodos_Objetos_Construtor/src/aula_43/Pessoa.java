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
	
	// METODO 1
	@Override
	public String toString() {
		return "Nome = " + nome + " \nE-mail = " + email + " \nAno de nacimento = " + ano_nacimento + " \nIdade = " + (2024 - ano_nacimento) + " anos" ;
	}
	
	// METODO 2
	void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Ano de nascimento: " + this.ano_nacimento);
		System.out.println("Idade : " + (2024 - ano_nacimento));
	}	
}
