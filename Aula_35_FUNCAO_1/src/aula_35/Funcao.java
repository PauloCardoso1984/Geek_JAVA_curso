package aula_35;

import java.util.Scanner;

public class Funcao {
	
	// Criando o vetor frutas // DECLARAÇÃO DO VETOR
	// Variaveis GLOBAL
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Faça um programa que receba diversoos nomes de frutas do usuário e imprima essas frutas.");
		System.out.println();

		System.out.print("Quantas frutas serão informadas: ");
		int qtd = Integer.parseInt(teclado.nextLine()); // recebe um dado como String e transforma em Int
		
		// Chamando a função cadastrar_dados
		cadastrar_dados(qtd);
		
		// Chamando a função mostrar_dados (invertida)
		mostrar_dados(qtd);
		
		// Chamando a função mostrar_dados_normal
		mostrar_dados_normal(qtd);
		
		System.out.println();

		teclado.close();
	}

	// CRIAR FUNÇÃO
	/*
	 * A função deter ter o seguinte 
	 * a) Tipo de retorno (Tipo de dado que a função vai retornar) 
	 * b) Nome = corresponde a ação que a função realiza;
	 * c) Parametros/Argumentos de entrada (Opicional); 
	 * d) Retorno (Opicial) - depende de retorno > void = vazio, não retorna nada
	 */
	static void cadastrar_dados(int quantidade) {
		// Definindo o tamando do vetor pela quantidade
		frutas = new String[quantidade];
		
		// For para receber os dados digitados
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Informe a " + (i + 1) + " fruta: ");
			// Alimentando o vetor com os nomes digitados
			frutas[i] = teclado.nextLine();
		}
		System.out.println();
		System.out.println("Mostrar os dados ordem invertida: ");
	}
	static void mostrar_dados(int quantidade){
		// For para imprimir os dados ao contrario
		for (int i = (quantidade - 1); i >= 0; i--) { // neste caso é quantidade - 1;
			System.out.println(frutas[i]);
		}	
		System.out.println();
		System.out.println("Mostrar os dados ordem normal: ");
	}
	static void mostrar_dados_normal (int quantidade){
		// For para imprimir os dados ao contrario
		for (int i = 0; i < quantidade; i++) { // neste caso é quantidade - 1;
			System.out.println(frutas[i]);
		}		
	}
}
