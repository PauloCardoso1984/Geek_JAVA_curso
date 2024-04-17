package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* HashMap - A classe implementa a interface Map e trabalha com chave/valor
 - Não aceita cheve duplicadas, mas o valor sim. 
 
 */
public class Programa {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		// Criando os objetos
		Cliente cl1 = new Cliente ("Paulo Cardoso", "Rua 50");
		Cliente cl2 = new Cliente ("Paulo Reginaldo", "Rua 52");
		Cliente cl3 = new Cliente ("Cardoso Paulo", "Rua 50");
		
		// Instanciando os objetos
		Conta c1 = new Conta(1, 200, 2000, cl1);
		Conta c2 = new Conta(20, 200, 2545, cl2);
		Conta c3 = new Conta(2, 20000, 200545, cl3);
		
		// Definindo chave/valor (Pessoa.... chave -> c1 ou c2 = valor
		contas.put("Pessoa Física", c1);
		contas.put("Pessoa Jurídica", c2);
		contas.put("Pessoa Jurídica", c2); // Mesmo duplicado não aparecerá na relação
		contas.put("Pessoa Física", c3);
		
		System.out.println("Imprimindo as contas:");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println();
		
		// Mostrando a quantidade de contas
		System.out.println("Mostrando a quantidade de contas: " + contas.size());
		System.out.println();
		
		// Buscando por chave
		System.out.println("Contas de Pessoas Física: " + contas.get("Pessoa Física"));
		System.out.println("Contas de Pessoas Jurídica: " + contas.get("Pessoa Jurídica"));		
	
		tc.close();
	}
}