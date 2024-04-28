package herança;

public class Pessoa {
	private String nome;
	private int ano_nascimento;

	// CONSTRUTOR VAZIO
	public Pessoa() {
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Pessoa(String nome, int ano_nascimento) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
	}

	// GET e SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno_nascimento() {
		return ano_nascimento;
	}

	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
}