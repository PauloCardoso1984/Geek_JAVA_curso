package aula_14;

import java.util.Scanner;

public class AreaePerimetro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa para ler as dimensões de um terreno (comprimento e largura, bem como \n"
				+ "o preço do metro de tela. Imprima o custo para cercar este mesmo terreno com tela.");
		System.out.println();
		System.out.println("Valor do metro linear da cerca é R$ 17,20");

		double comprimento = 0;
		double largura = 0;
		
		while (comprimento <= largura) {
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        
        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        
        	System.out.println("Comprimento tem que ser maior que a largura");
        	System.out.println();
        }
        
        // CALCULAR A AREA
        double area = comprimento * largura;
        double perimetro = 2 * comprimento + 2 * largura;
        double cerca = perimetro * 17.20;
             
        System.out.println("Os valores digitados são: comprimento = " + comprimento + ", lagura = " + largura);
        System.out.println("O valor total da área é de " + area + "m2");
        System.out.println("O tamanho do perímetro é de " + perimetro);
        System.out.println("O valor para cercar será de R$ " + cerca);

        sc.close();
    }
}