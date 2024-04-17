package aula_19;

public class Funcionario {
	
	String nome;
	double salario;
	double emprestimo;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, double salario, double emprestimo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.emprestimo = emprestimo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

	// METODO DE CALCULO
	public double saldoSalario(double salario) {
		return salario / 100 * 20;
	}

	@Override
	public String toString() {
		return "Funcionario = " + nome + ", salario = " + salario + ", valor emprestado R$ " + emprestimo;
	}	
}