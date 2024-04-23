// Tipos de dados
// Números (inteiros e reais)
package aula25;

public class Tipos {
	public static void main(String[] args) {

		// OCUPAM MENOS MEMÓRIA
		// Tipos primários
		// Por padrão, os números reais em Java são considerados double
		float preco1 = 23.4f; // 23.40
		double preco2 = 23.4; // 23.433535332356666665
		
		// Tipos não primários / primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float	→ " + preco1);
		System.out.println("double 	→ " + preco2);
		System.out.println("Float 	→ " + preco3);
		System.out.println("Double  → " + preco4);
	}
}