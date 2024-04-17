package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		System.out.println("Em matemática, o número harmonico designado por H(n) defini-se como sendo a soma da série"
				+ "harmônica: H(n) = 1+1/2+1/3+1/4 + ... +1/n");
        System.out.println();
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor para n: ");
        int n = entrada.nextInt();
        
        // DECLARADA E INICIADA
        double numeroHarmonico = 0.0;
        
        // CALCULO DA MÉDIA
        for (int i = 1; i <= n; i++) {
            numeroHarmonico += 1.0 / i;
        }
        
        System.out.println("O número harmônico para n = " + n + " é: " + numeroHarmonico);
        
        entrada.close();
    }
}
