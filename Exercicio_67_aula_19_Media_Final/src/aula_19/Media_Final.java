package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Media_Final {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("A nota final de um estudante é calculada a partir de três notas atribuidas \n"
				+ "entre o intervalo de 0 até 10, respectivamente, a um trabalho de laboratório, a uma \n"
				+ "avaliação semestral e a um exame final. A média das três notas mencionadas anteriormente \n"
				+ "obedece aos pesos. \n" 
				+ "→ Trabalho de Laboratório 2; \n" 
				+ "→ Avaliação Semestral 3; \n"
				+ "→ Exame Final 5. \n" 
				+ "De acordo com o resultado, mostre na tela se o aluno está: \n"
				+ "* REPROVADO (0 a 2,9), \n" 
				+ "*RECUPERAÇÃO (3 a 4,9) ou \n" 
				+ "* APROVADO. \n"
				+ "Faça todas as verificações necessárias.");
		System.out.println();
		
		double nota1 = 0, nota2 = 0, nota3 = 0;

		while (nota1 < 0 || nota1 > 10);
		System.out.print("Digite a nota do Trabalho de Laboratório: ");
		nota1 = sc.nextDouble();

		if (nota2 < 0 || nota2 > 10);
		System.out.print("Digite a nota da Avalição Semestral: ");
		nota2 = sc.nextDouble();

		if (nota3 < 0 || nota3 > 10);
		System.out.print("Digite a nota do Exame Final: ");
		nota3 = sc.nextDouble();
	
		double media = calcularMediaPonderada(nota1, nota2, nota3);
	
		System.out.println();
		System.out.println("As notas registrads foram " + nota1 + ", " +  nota2 + " e " + nota3);
		System.out.printf("A média do aluno foi: %.2f%n", media);
		
        if (media >= 5) { System.out.println();
            System.out.println("Aluno aprovado!");
        } 
        if (media >= 0 && media < 2.9){ System.out.println();
        	System.out.println ("Aluno reprovado!!");
        }
        if (media > 3 && media < 4.9) { System.out.println();
            System.out.println("Aluno em Recuperação!!!");
        }		
		sc.close();
	}

	// MÉTODO
    public static double calcularMediaPonderada(double nota1, double nota2, double nota3) {
        return ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10; 
    }
}
