/* OBJETOS
 - São produtos/instâncias da classe; 
 */
package aula_43;

public class Programa {

	public static void main(String[] args) {

		// Delcaração de um OBJETO
		Produto p0;

		// Declaração e instanciação/inicialização do OBJETO
		Produto p1 = new Produto();
		
		// colocando objetos na classe
		
		p0 = new Produto();
		p0.nome = "Caneta";
		p0.preco = 2.4f;
		p0.desconto = 5.0f;
		
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println(p0);
		System.out.println(p1);
		
		System.out.println("--------------------------------------------------------------");
		
		// Instanciando a classe Pessoa com construtor vazio
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Paulo Reginaldo Cardoso";
		pessoa1.ano_nacimento = 1984;
		pessoa1.email = "pauloreginaldocardoso@hotmail.com";
				
		System.out.println(pessoa1);
		
		System.out.println("--------------------------------------------------------------");
		
		// Instanciando a classe Pessoa com construtor com argumentos
		Pessoa pessoa2 = new Pessoa("Cardoso", "cardoso@gmail.com", 1984);
		
		System.out.println(pessoa2);
		
	}
}
