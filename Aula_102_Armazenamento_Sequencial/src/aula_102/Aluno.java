package aula_102;

import java.util.Objects;

public class Aluno {
	String nome;

	// CONSTRUTOR VAZIO
	public Aluno() {
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Aluno(String nome) {
		this.nome = nome;

	}

	// GET e SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// MÉTODO COMPARAÇÃO PELO NOME
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	// 1ª Forma
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	// 2ª Forma
/*	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
	}
*/	

	// MÉTODO toString
	@Override
	public String toString() {
		return "Aluno = " + this.nome;
	}
}
