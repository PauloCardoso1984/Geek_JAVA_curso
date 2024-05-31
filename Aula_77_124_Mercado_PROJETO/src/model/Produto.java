package model;

import helper.Utils;

public class Produto {

	private static int contador = 1;

	private int codigo;
	private String nome;
	private Double preco;

	// Construtor
	public Produto(String nome, Double preco) {
		// Criar e encrementar um contador
		this.codigo = Produto.contador;
		Produto.contador += 1;

		this.nome = nome;
		this.preco = preco;
	}

	// Get e Seters
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	// to String
	@Override
	public String toString() {
		return "Código: " + this.getCodigo() + 
				"\nNome: " + this.getNome() + 
				"\nPreço: " + Utils.doubleParaString(this.getPreco()) + "\n";
	}
}
