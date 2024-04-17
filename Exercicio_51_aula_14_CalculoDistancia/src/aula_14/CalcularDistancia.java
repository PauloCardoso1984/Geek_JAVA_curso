package aula_14;

import java.util.Scanner;

public class CalcularDistancia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um programa que leia as coordenadas x e y de pontos do \n"
				+ "r2 e calcule sua distancia da origem (0)");
		System.out.println();

        System.out.print("Digite a coordenada x: ");
        double x = sc.nextDouble();
        
        System.out.print("Digite a coordenada y: ");
        double y = sc.nextDouble();
        
        double distancia = Math.sqrt(x * x + y * y);
        
        System.out.printf("A distância da origem é: %.4f%n", distancia);
        
        sc.close();
    }
}