package calculo;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que calcule o termo pitagórico a, b, c, para o qual a + b + c = 1000. Um termo pitagórico é um conjunto de três nuemros a, b, c.");
		System.out.println();

        int a, b, c;
        
        for (a = 1; a < 1000; a++) {
            for (b = a+1; b < 1000; b++) {
                c = 1000 - a - b;
                
                if (a*a + b*b == c*c) {
                    System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                    System.out.println("Produto abc = " + a*b*c);
                    break;
                }
            }
        }
    }
}