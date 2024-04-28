package herança;

public class Programa {
	public static void main(String[] args) {
		
		// INSTANCIANDO UMA PESSOA
		Pessoa paulo = new Pessoa("Paulo Cardoso", 1984);
		System.out.println("Nome: " + paulo.getNome() + "\nAno de Nascimento: " + paulo.getAno_nascimento() + "\n");
		
		// INSTANCIANDO UM ALUNO
		Aluno a1 = new Aluno("Cardoso", 1984, "1234567");
		System.out.println("Nome: " + a1.getNome() + "\nAno de Nascimento: " + a1.getAno_nascimento() + "\nRA: " + a1.getRa() + "\n");

		// INSTANCIANDO UM PROFESSOR
		Professor p1 = new Professor("Paulo Cardoso", 1984, "Matemática");
		System.out.println("Nome: " + p1.getNome() + "\nAno de Nascimento: " + p1.getAno_nascimento() + "\nLeciona: " + p1.getleciona_materia() + "\n");
	}
}
