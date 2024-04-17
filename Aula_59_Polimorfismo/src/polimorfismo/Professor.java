package polimorfismo;

// HERDANDO DA CLASSE MAE - PESSOA
public class Professor extends Pessoa {
	private String matricula;

	// CONSTRUTOR COM ARGUMENTOS
	public Professor(String nome, int ano_nascimento, String matricula) {
		super(nome, ano_nascimento);
		this.matricula = matricula;
	}

	// GET e SET
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		// BUSCANDO O toString da classe mãe
		return super.toString() + " - Professor [matéria] = " + matricula;
	}	
}
