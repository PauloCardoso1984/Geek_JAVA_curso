package calculo;

import java.util.Random;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que simula o lançamento de dois dados, d1 e d2, n vezes, e tem como saída o "
				+ "número de cada dado e a relação entre eles (<, >. =) de cada lançamento)");
		System.out.println();

	    Random random = new Random();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Com quantos lançamentos vai fazer o calculo: ");
		int n = sc.nextInt();
		
		System.out.println();
	    
	    for (int i = 0; i < n; i++) {
	        // Simula o lançamento dos dados
	        int d1 = random.nextInt(6); // valores de 1 a 6
	        int d2 = random.nextInt(6); // valores de 1 a 6
	        
	        // Verifica a relação entre os números dos dados
	        String relacao = "=";
	        if (d1 > d2) {
	            relacao = ">";
	        } else if (d1 < d2) {
	            relacao = "<";
	        }
	        
	        // Imprime o resultado do lançamento dos dados
	        System.out.println((i+1) + "º lançamento");
	        System.out.println("Dado 1:	" + d1);
	        System.out.println("Dado 2:	" + d2);
	        System.out.println("Relação: " + relacao);
	        System.out.println();
	    }
	}
}