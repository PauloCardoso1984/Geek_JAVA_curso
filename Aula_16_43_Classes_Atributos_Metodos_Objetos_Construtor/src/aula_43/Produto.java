/*	 CLASSES
 * - O nome das classes inicia-se com letra maiúscula;
 * - O nome não deve conter: Acentuação, caracteres especiais, espaço;
 * - Nas classes Java, não existe a implementação da função main();
 * - O nome da classe DEVE ser o mesmo nome do arqui Java
 * - Tudo que estiver dentro das "chaves" {} faz parte da classe
 * Ex: 
 public class NomedaClasse{
 
 * }
 * */

/* ATRIBUTOS
 * - São as caracteristicas da clase/molde/ modelo de dados;
 * - Podemos entender atributos como variáveis da classe;
 * - Uma outra forma de nomenclatura para os atributos são estados;
 * - Atributos são nomeados em letras minúsculas, sem espaços sem caracteres especiais, sem acentuação
 * */

/* METODOS
 * - Podemos entender os métodos como a ação que é realizada por um objeto da classe;
 * - Os métodos são comportamentos dos objetos da classe;
 * 
 * - Mesmos requisitos para funções:
	 	 Uma função dever ter o seguinte 
		 a) Tipo de retorno (Tipo de dado que a função vai retornar) 
		 b) Nome = corresponde a ação que a função realiza;
		 c) Parametros/Argumentos de entrada (Opicional); 
		 d) Retorno (Opcional) - depende de retorno > void = vazio, não retorna nada
 * 
 * */

package aula_43;

public class Produto {
	
	String nome;
	float preco;
	float desconto;
	
	// CONSTRUTOR VAZIO
	public Produto() {
	}
	
	// CONSTUTOR COM ARGUMENTOS
	public Produto(String nome, float preco, float desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	// METODO
	// Preço para aumentar o produto em 10%
	void aumentar_preco() {
		this.preco = this.preco * 10 / 100;
	}
	@Override
	public String toString() {
		return "Produto = " + nome + "\nPreco R$ = " + preco + " \nDesconto = " + desconto + "%";
	}	
}