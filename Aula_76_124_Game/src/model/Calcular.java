package model;

import java.util.Random;

public class Calcular {

	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;

	// CONSTRUTOR
	public Calcular(int dificuldade) {

		// RANDON => GERAR VALORES ALEATÓRIOS
		Random rand = new Random();

		this.operacao = rand.nextInt(5); // 0 = somar / 1 - diminuir / 2 - multiplicar / 3 - dividir
		this.dificuldade = dificuldade;

		if (dificuldade == 1) {
			// Nivel fácil
			this.valor1 = rand.nextInt(10); // vai gerar um numero de 0 a 9
			this.valor2 = rand.nextInt(10);
		} 
		
		else if (dificuldade == 2) {
			// Nivel médio
			this.valor1 = rand.nextInt(100); // vai gerar um numero de 0 a 99
			this.valor2 = rand.nextInt(100);
		} 
		
		else if (dificuldade == 3) {
			// Nivel difícil
			this.valor1 = rand.nextInt(1000); // vai gerar um numero de 0 a 999
			this.valor2 = rand.nextInt(1000);

		} 
		
		else if (dificuldade == 4) {
			// Nivel muito dificil
			this.valor1 = rand.nextInt(10000); // vai gerar um numero de 0 a 9999
			this.valor2 = rand.nextInt(10000);
		} else {

			// Nivel ultra
			this.valor1 = rand.nextInt(100000); // vai gerar um numero de 0 a 99999
			this.valor2 = rand.nextInt(100000);
		}
	}

	// GET => SOMENTE GET
	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getOperacao() {
		return operacao;
	}

	public int getResultado() {
		return resultado;
	}

	// METODO
	@Override
	public String toString() {
		String op;
		if (this.getOperacao() == 1) {
			op = "Somar";
		} else if (this.getOperacao() == 2) {
			op = "Diminiur";
		} else if (this.getOperacao() == 3) {
			op = "Multiplicar";
		} else if (this.getOperacao() == 4) {
			op = "Dividir";
		} else {
			op = "Operação desconhecida";
		}
		return "Valor 1 : " + this.getValor1() + "\nValor 2 : " + this.getValor2() + "\nDificuldade: "
				+ this.getDificuldade() + "\nOperação: " + op;
	}

	// METODOS DE CALCULO
	
	// SOMAR
	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		Boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta CORRETA!!!");
			certo = true;
		} else {
			System.out.println("Resposta ERRADA...");
		}
		System.out.println("A resposta correta é: " + this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	
	// SUBTRAIR
	public boolean subtrair(int resposta) {
		this.resultado = this.getValor1() - this.getValor2();
		Boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta CORRETA!!!");
			certo = true;
		} else {
			System.out.println("Resposta ERRADA...");
		}
		System.out.println("A resposta correta é: " + this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	
	// MULTIPLICAR
	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2();
		Boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta CORRETA!!!");
			certo = true;
		} else {
			System.out.println("Resposta ERRADA...");
		}
		System.out.println("A resposta correta é: " + this.getValor1() + " x " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	
	// DIVIDIR
	public boolean dividir(int resposta) {
		this.resultado = this.getValor1() / this.getValor2();
		Boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta CORRETA!!!");
			certo = true;
		} else {
			System.out.println("Resposta ERRADA...");
		}
		System.out.println("A resposta correta é: " + this.getValor1() + " / " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
}
