package listasSequencial;

// LISTA LIGADA
/* 
 Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista
 ligada, eles estão em lugares diferentes, porém um aponta para o outro
 indicando o próximo elemento 
*/
 
public class Programa {
	public static void main(String[] args) {
		
		// ADICIONADO NO FINAL -> .adicionaNoComeco
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista + "\n");
		
		lista.adicionaNoComeco("Paulo");	
		System.out.println(lista + "\n");
		
		lista.adicionaNoComeco("Reginaldo");
		System.out.println(lista + "\n");
		
		lista.adicionaNoComeco("Cardoso");
		System.out.println(lista + "\n");
		
		// ADICIONANDO NO FINAL DECLARANDO
		String nome = "Resgisnaldo";
		lista.adicionaNoComeco(nome);
		System.out.println(lista + "\n");
		
		int numero = 40;
		lista.adicionaNoComeco(numero);
		System.out.println(lista + "\n");
		
		Cliente cli1 = new Cliente (18, "Paulinho", "Rua 10, 58");
		lista.adicionaNoComeco(cli1);
		System.out.println(lista + "\n");
		
		// ADICIONANDO NO FINAL DA LISTA
		lista.adiciona("Deus");
		System.out.println(lista + "\n");
		
		lista.adiciona("Jesus");
		System.out.println(lista + "\n");
		
		// ADICIONANDO NO MEIO DA LISTA
		lista.adiciona(7, "Espírito Santo");
		System.out.println(lista + "\n");
		
		// PEGANDO P ELEMENTO PELA POSIÇÃO
		Object retorno = lista.pega(5);
		System.out.println("Pegando a posição 5 = " + retorno + "\n");
		
		// VERIFICANDO O TAMANHO DA LISTA
		System.out.println("Tamanho da lista: " + lista.tamanho() + "\n");
		
		// REMOVENDO DO COMEÇO
		lista.removaDoComeco();
		System.out.println(lista + "\n");
	}
}