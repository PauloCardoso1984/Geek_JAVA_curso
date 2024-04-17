package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Ler uma sequência de números inteiros e determinar se eles são pares ou não. \n"
				+ "Deverá ser informado o número de dados lidos e número de valores pares. O processo \n"
				+ "termina quando for digitado a palavra FIM.");
		System.out.println();		
		
		/*Esse código utiliza o loop while (true) para continuar lendo os números até que a palavra "FIM" 
		 * seja digitada. Em cada iteração, ele verifica se o número é par usando o operador %. Se for par, 
		 * incrementa a variável quantidadeValoresPares, caso contrário, não faz nada. 
		 * No final, ele exibe a quantidade de dados lidos e a quantidade de valores pares.*/
		
        int quantidadeDadosLidos = 0;
        int quantidadeValoresPares = 0;
        
        System.out.print("Digite os números inteiros (digite 'FIM' para encerrar):");
        
        while (true) {
            String numero = sc.next();            
            if (numero.equalsIgnoreCase("FIM")) {
            	System.out.println("Você digitou FIM. Processo encerrado...");
                break;
            }            
            int numero2 = Integer.parseInt(numero);
            
            quantidadeDadosLidos++;
            
            if (numero2 % 2 == 0) {
                quantidadeValoresPares++;
                
            }          
            System.out.println("Quantidade de dados lidos  : " + quantidadeDadosLidos);
            System.out.println("Quantidade de valores pares: " + quantidadeValoresPares);
            System.out.println();
            System.out.print("Digite um números ou FIM): ");
        }     	
		sc.close();
	}
}