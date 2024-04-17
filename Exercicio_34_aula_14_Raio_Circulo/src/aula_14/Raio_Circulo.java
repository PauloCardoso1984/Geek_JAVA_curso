package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Raio_Circulo {

	public static void main(String[] args) {
	
		// Locale SUBSTITUIRÁ A VÍRGULA (,) POR PONTO (.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.141592;
		
		System.out.println("Fazer um programa que receba um número de um um Raio  de um Circulo e mostre a area do mesmo");
		System.out.println();
		
		System.out.print("Digite o valor do raio do círculo: ");
		double raio = sc.nextDouble();

		// MÉTODO OBTER O RESULTADO
		double areaciruclo = (Math.pow(raio, 2)) * PI; 
		
		System.out.println("Valor digitado do raio foi: " + raio);
		// DESTA FORMA IMPRIMIRÁ 2 CASAS APÓS A VÍRGULA
		System.out.printf("Valor da área do círculo é de: %.2f%n ", areaciruclo);
		sc.close();
	}
}
