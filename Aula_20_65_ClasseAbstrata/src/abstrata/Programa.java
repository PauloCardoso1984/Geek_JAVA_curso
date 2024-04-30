package abstrata;
/*
 ABSTRATA - Proporciona um bloqueio na criação de objetos
*/

public class Programa {
	public static void main(String[] args) {

		System.out.println("Pessoa");
		Professor paulo = new Professor("Paulo Cardoso", 1984, "Matemática");
		System.out.println(paulo);

		// MENSAGEM VINDO DA CLASSE PESSOA - CLASE ABSTRATA
		paulo.mensagem("\nEsse é um professor... \n");

		System.out.println("============================");

		System.out.println("\nPessoa");
		Aluno cardoso = new Aluno("Paulo Cardoso", 1984, "45.254.254");
		System.out.println(cardoso);

		// MENSAGEM VINDO DA CLASSE PESSOA - CLASE ABSTRATA
		paulo.mensagem("\nEsse é um aluno...");
	}
}
