package polimorfismo;

/*HERANÇA - evita repetição de código 
 * facilita a manutenção dos programas 
*/
// extends SERÁ A EXTENÇÃO DA CLASSE PESSOA
public class Aluno extends Pessoa{	
	private String ra;
	
	// CONSTRUTOR COM ARGUMENTOS
	public Aluno(String nome, int ano_nascimento, String ra) {
		// TRAZER DA super(ARGUMENTOS) CLASSE OS ARGUMENTOS DEFINIDO
		super(nome, ano_nascimento);
		this.ra = ra;
	}
	
	// GET e SET
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}

	@Override
	public String toString() {
		// BUSCANDO O toString da classe mãe
		return super.toString() + " RA = " + ra;
	} 	
}
