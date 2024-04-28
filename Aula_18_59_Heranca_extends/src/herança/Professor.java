package herança;

// HERDANDO DA CLASSE MAE - PESSOA
public class Professor extends Pessoa {
	private String leciona_materia;

	// CONSTRUTOR COM ARGUMENTOS
	public Professor(String nome, int ano_nascimento, String leciona_materia) {
		super(nome, ano_nascimento);
		this.leciona_materia = leciona_materia;
	}

	// GET e SET
	public String getleciona_materia() {
		return leciona_materia;
	}

	public void setleciona_materia(String leciona_materia) {
		this.leciona_materia = leciona_materia;
	}
}
