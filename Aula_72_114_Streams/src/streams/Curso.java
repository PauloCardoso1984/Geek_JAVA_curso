package streams;

public class Curso {
	private String nome;
	private int aluno;
	

	// CONSTRUTOR
	public Curso(String nome, int aluno) {
		super();
		this.nome = nome;
		this.aluno = aluno;
	}
	
	// GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAluno() {
		return aluno;
	}

	public void setAluno(int aluno) {
		this.aluno = aluno;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

}
