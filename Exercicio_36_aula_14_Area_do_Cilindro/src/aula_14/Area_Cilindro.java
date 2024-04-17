package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Area_Cilindro {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.141592;
		
		System.out.println("Fazer um programa que receba o valor da altura e raio de um cilindro e informe o seu volume.");
		System.out.println();
		
		System.out.print("Digite o valor da altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();

		// MÉTODO OBTER O RESULTADO
		double volumecilindro =  PI * Math.pow(raio, 2) * altura;
		
		System.out.println("Valor digitado da altura: " + altura + ", raio: " + raio);
		System.out.println("Capacidade do cilindro é de: " + volumecilindro +" m3");
		sc.close();
	}
}
