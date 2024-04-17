package aula_19;

import java.util.Locale;
import java.util.Scanner;

public class Media_Ponderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A primeira e a \n"
				+ "segunda prova tem peso 1 e a terceira tem peso 2. Ao final, mostrar a média do aluno e indicar \n"
				+ "se o aluno foi aprovado ou reprovado. A nota para aprovação deve ser igual ou superior a 60 pontos.");
		System.out.println();

        System.out.print("Digite a nota da 1ª prova: ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Digite a nota da 2ª prova: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Digite a nota da 3ª prova: ");
        double nota3 = sc.nextDouble();
        
        // CHAMANDO O MÉTODO
        double media = calcularMediaPonderada(nota1, nota2, nota3);
        
        System.out.println("Média do aluno: " + media);
        
        if (media > 60) {
            System.out.println("Aluno aprovado!");
        } 
        if (media >= 50 && media < 60){
        	System.out.println("Passou com a pontuação mímina. Estudar mais!!!");
        }
        else {
            System.out.println("Aluno reprovado!");
        }
        sc.close();
    }
   
	// MÉTODO
    public static double calcularMediaPonderada(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + (nota3 * 2)) / 4;   
    }
}
