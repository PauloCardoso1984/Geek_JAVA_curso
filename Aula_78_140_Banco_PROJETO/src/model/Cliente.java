package model;

import java.util.Date;

import helper.Utils;

public class Cliente {

	private static int contador = 1001;

	private int codigo;
	private String nome;
	private String email;
	private String cpf;
	private Date dataNascimento;
	private Date dataCadastro;

	// CONSTRUTOR
	public Cliente(String nome, String email, String cpf, Date dataNascimento) {
		// Inserindo o contador
		this.codigo = Cliente.contador;
		// Incrementando o codigo
		Cliente.contador += 1;
		
		// Inserindo data cadastro
		this.dataCadastro = new Date();
		
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	// GET E SETERS
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	// MÉTODOS
	@Override
	public String toString() { // FORMATADO AS DATAS COM A CLASSE Utlis
		return "======= CLASSE CLIENTE =======" + 
				"\nCódigo: " + codigo + 
				"\nNome: " + nome + 
				"\nE-mail: " + email + 
				"\nCPF: " + cpf +
				"\nData de Nascimento: " + Utils.dateParaString(dataNascimento) + 
				"\nData de Cadastro: " + Utils.dateParaString(dataCadastro) + 
				"\n"; 
	}
}
