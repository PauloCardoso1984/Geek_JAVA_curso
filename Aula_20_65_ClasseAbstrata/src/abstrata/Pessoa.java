package abstrata;

/* TORNANDO A classe public EM abstract, sendo assim essa classe não pode ser instanciada
ou seja, não pode ser criado objeto.
Uma classe abstrata pode ter:
- atributos
- métodos
- métodos abstrato

 -> Metodos abstratos - possuem apenas delcaração e não implementação. Obrigatóriamente, as 
 *classes que herdarem desta classe com o método abstrato, precisa implementar estes métodos*/

public abstract class Pessoa {
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

	// MÉTODO ABSTRATO - É REALIZADO APENAS A DECLARAÇÃO
	public abstract void mensagem(String texto);

	@Override
	public String toString() {
		return "Nome = " + nome + "\nAno de Nascimento = " + ano_nascimento;
	}
}
