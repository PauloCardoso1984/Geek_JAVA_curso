package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Cateto {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fazer um programa que receba o valor de um dos catetos A e Hipotenusa, qual valor do outro cateto.");
		System.out.println();
		
		System.out.print("Digite o valor do cateto: ");
		double cateto = sc.nextDouble();
		
		System.out.print("Digite o valor da hipotenusa: ");
		double hipotenusa = sc.nextDouble();

		// MÉTODO OBTER O RESULTADO
		double catetofaltante =  Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(cateto, 2));
		
		System.out.println("Valor digitado do cateto: " + cateto + ", hipotenusa: " + hipotenusa);
		// DESTA FORMA IMPRIMIRÁ 2 CASAS APÓS A VÍRGULA
		System.out.printf("Valor do outro cateto é de: %.2f%n ", catetofaltante);
		sc.close();
	}
}
