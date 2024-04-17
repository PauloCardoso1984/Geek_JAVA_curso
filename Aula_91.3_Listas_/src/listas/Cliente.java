package listas;

import java.util.Objects;

public class Cliente implements Comparable {

	private int cpf;
	private String nome;
	private String endereço;

	// CONSTRUTOR VAZIO
	public Cliente() {
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Cliente(int cpf, String nome, String endereço) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		return "Cliente = " + nome;
	}

	// COMPARANDO O CLIENTE PELO NOME
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Object outro) {
		Cliente aux = (Cliente) outro;
		if (this.cpf < aux.cpf) {
			return -1;
		} else if (this.cpf > aux.cpf) {
			return 1;
		} else {
			return 0;
		}
	}
}
