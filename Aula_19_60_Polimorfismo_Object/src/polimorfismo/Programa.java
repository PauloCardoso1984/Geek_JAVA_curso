package polimorfismo;

/* POLIMORFISMO -> Muitas Formas = Objetos do mesmo tipo pode agir de forma diferentes.  
 * MÉTODO -> toString
*/
public class Programa {
	public static void main(String[] args) {
		
		System.out.println("Pessoa");
		Pessoa paulo = new Pessoa("Paulo Cardoso", 1984);
		System.out.println("Nome: " + paulo.getNome() + " - Ano de Nascimento: " + paulo.getAno_nascimento());
		System.out.println("Usando toString: " + paulo); // UTILIZANDO O ToString da classe Pessoa
		
		System.out.println();
		
		System.out.println("Aluno");
		Aluno a1 = new Aluno("Cardoso", 1894, "1234567");
		System.out.println(a1.getNome() + " - Ano de Nascimento: " + a1.getAno_nascimento() + " - RA: " + a1.getRa());
		System.out.println("Usando toString: " + a1); // UTILIZANDO O ToString da classe Aluno
		
		System.out.println();
		
		System.out.println("Professor");
		Professor p1 = new Professor("Paulo Cardoso", 1984, "Matemática");
		System.out.println(p1.getNome() + " - Ano de Nascimento: " + p1.getAno_nascimento() + " - Matrícula: " + p1.getMatricula());
		System.out.println("Usando toString: " + p1); // UTILIZANDO O ToString da classe Professor
		
		System.out.println();
		System.out.println(paulo + "\n");
		System.out.println(a1 + "\n");
		System.out.println(p1 + "\n");
	}
}
