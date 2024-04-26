/* OBJETOS
 - São produtos/instâncias da classe; 
 
 /*	 CLASSES
 * - O nome das classes inicia-se com letra maiúscula;
 * - O nome não deve conter: Acentuação, caracteres especiais, espaço;
 * - Nas classes Java, não existe a implementação da função main();
 * - O nome da classe DEVE ser o mesmo nome do arquivo Java
 * - Tudo que estiver dentro das "chaves" {} faz parte da classe
 * Ex: 
 public class NomedaClasse{
  }

 ATRIBUTOS
 * - São as caracteristicas da clase/molde/ modelo de dados;
 * - Podemos entender atributos como variáveis da classe;
 * - Uma outra forma de nomenclatura para os atributos são estados;
 * - Atributos são nomeados em letras minúsculas, sem espaços sem caracteres especiais, sem acentuação
 * 

 METODOS
 * - Podemos entender os métodos como a ação que é realziada por um objeto da classe;
 * - Os métodos são comportamentos dos objetos da classe;
 * 
 * - Mesmos requisitos para funções:
	 	 Uma função dever ter o seguinte
		 a) Tipo de retorno (Tipo de dado que a função vai retornar) 
		 b) Nome = corresponde a ação que a função realiza;
		 c) Parametros/Argumentos de entrada (Opicional); 
		 d) Retorno (Opcional) - depende de retorno > void = vazio, não retorna nada;
		 
 CONSTRUTOR
* - O construtor de uma alasse SEMPRE tem o mesmo nime da classe;
* - Por padrão, a JVM - JAVA VIRTUAL MACHINE, cria em tempo de execução, um construtor padrão - VAZIO;
* - Podemos ter mais de 1 construtor;
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
		
		System.out.println("============= PRODUTOS ============");
		System.out.println(p0);
		System.out.println("------------------------");
		System.out.println(p1);
		
		System.out.println("------------------------------------------------ \n");
		
		// Instanciando a classe Pessoa com construtor vazio
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Paulo Reginaldo Cardoso";
		pessoa1.ano_nacimento = 1984;
		pessoa1.email = "pauloreginaldocardoso@hotmail.com";
		
		// Instanciando a classe Pessoa com construtor com argumentos
		Pessoa pessoa2 = new Pessoa("Cardoso", "cardoso@gmail.com", 1984);
		
		System.out.println("============= PESSOAS ============");
		System.out.println("Usando o método 1 da classe pessoa \n");
		System.out.println(pessoa1);
		System.out.println("------------------------------------------------");
		System.out.println(pessoa2);		
		System.out.println("------------------------------------------------");
		System.out.println("Usando o método 2 da classe pessoa \n");
		pessoa1.imprime_informacoes();
		
	}
}