package herança;

public class Programa {
	public static void main(String[] args) {
		
		Pessoa paulo = new Pessoa("Paulo Cardoso", 1984);
		System.out.println("Nome: " + paulo.getNome() + " - Ano de Nascimento: " + paulo.getAno_nascimento());
		
		Aluno a1 = new Aluno("Cardoso", 1894, "1234567");
		System.out.println(a1.getNome() + " - Ano de Nascimento: " + a1.getAno_nascimento() + " - RA: " + a1.getRa());
		
		Professor p1 = new Professor("Paulo Cardoso", 1984, "Matemática");
		System.out.println(p1.getNome() + " - Ano de Nascimento: " + p1.getAno_nascimento() + " - Matrícula: " + p1.getMatricula());
	}
}
