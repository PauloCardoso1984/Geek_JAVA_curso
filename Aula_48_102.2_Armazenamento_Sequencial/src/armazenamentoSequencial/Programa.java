package armazenamentoSequencial;

// ARMAZENAMENTO SEQUENCIAL

public class Programa {
	public static void main(String[] args) {

		Vetor lista = new Vetor();
		for (int i = 0; i < 200; i++) {
			Aluno a = new Aluno("Paulo " + i);
			lista.adiciona(a);
		}
		System.out.println("Lita: " + lista + "\n");
		System.out.println("Tamanho da lista: " + lista.tamanho() + "\n");
	}
}