package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que calcule a diferença entre a soma dos quadrados dos "
				+ "primeiros 100 numeros naturais e o quadrado da soma.");
		System.out.println();

        int sumOfSquares = 0;
        int sum = 0;
        
        for (int i = 1; i <= 10; i++) {
            sumOfSquares += i * i;
            sum += i;
            System.out.print(sum + " - ");
        }
                  
        System.out.println();
        System.out.println(sumOfSquares);
 
        System.out.println("A diferença entre a soma dos quadrados dos primeiros 100 números naturais e o quadrado da soma é: " + sumOfSquares);
    }
}