package armazenamentoSequencial;

public class Aluno {
	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}
	
	// GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// MÉTODOS
	// COMPARAÇÃO
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
	}
	// TOSTRING
	@Override
	public String toString() {
		return this.nome;
	}	
}
