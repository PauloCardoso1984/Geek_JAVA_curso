package calculo;

import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		System.out.println("Faça um programa para calcular as seguintes sequência: S = 1/1 + 3/2 + 7/3 + 7/4");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Com quantos numeros vai fazer o calculo: ");
		int n = sc.nextInt();
		
        int numerador = 1;
        int denominador = 1;
        double resultado = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                resultado += (double) numerador / denominador;
            } else {
                numerador = numerador * 2 + 1;
                denominador = denominador + 1;
                resultado += (double) numerador / denominador;
            }
        }
        
        System.out.println("Soma da sequência: " + resultado);
    }
}


