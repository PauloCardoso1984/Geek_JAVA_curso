package calculo;

import java.util.Random;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Dados n e dois números inteiros positivo, i e j, diferentes de 0, imprimir em ordem "
				+ "crescesnte os n primeros naturais que são múltiplos de i ou de j ou de ambos.");
		System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        System.out.print("Digite o valor de i: ");
        int i = sc.nextInt();

        System.out.print("Digite o valor de j: ");
        int j = sc.nextInt();

        int count = 0;
        int numero = 0;

        
        while (count < n) {
            if (numero % i == 0 || numero % j == 0) {
            	// IMPRIMIR UM ABAIXO DO OUTRO
    //            System.out.println(numero);
             // IMPRIMIR A FRENTRE DO OUTRO DO OUTRO
                System.out.print(numero + " - ");
                count++;
            }
            numero++;
        }

        sc.close();
    }
}