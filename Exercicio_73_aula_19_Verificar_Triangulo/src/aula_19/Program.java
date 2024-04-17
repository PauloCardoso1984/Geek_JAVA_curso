package aula_19;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dados três valores A,B,C verificar se eles podem ser valores dos lados \n"
        		+ "de um triangulo e, se forem, se é um triangulo escaleno, equilátero ou isosceles.");
        System.out.println();
        
        System.out.println("Digite o valor dos lados do triângulo.");
        
        double ladoA;
        double ladoB;
        double ladoC;
        
        System.out.print("Lado A: ");
        ladoA = sc.nextDouble();
        System.out.print("Lado B: ");
        ladoB = sc.nextDouble();
        System.out.print("Lado C: ");
        ladoC = sc.nextDouble();
        
        if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC && ladoC == ladoA) {        	
        	System.out.println("Esse triangulo é o EQUILÁTERO");
        }
        if (ladoA == ladoB && ladoB != ladoC && ladoC == ladoA || ladoA != ladoB && ladoA == ladoC || ladoA != ladoB && ladoB == ladoC || ladoA == ladoB && ladoB != ladoC) {
        	System.out.println("Esse triangulo é o ISOSCELES");
        }
        if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC && ladoC != ladoA) {
        	System.out.println("Esse triangulo é o ESCALENO");
        }
    }
}
