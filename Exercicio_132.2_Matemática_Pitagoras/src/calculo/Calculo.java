package calculo;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que calcule o termo pitagórico a, b, c");
		System.out.println();

		Scanner sc = new Scanner(System.in); 
		
		int a, b, c;
		
		System.out.print("Digite um valor de cateto a: ");
		a = sc.nextInt();
		
		System.out.print("Digite um valor de cateto b: ");
		b = sc.nextInt();
	
		// CALCULO
		double pitagoras = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				
		System.out.println("O valor de c: " + pitagoras);
	}
}