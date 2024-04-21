package calculo;

import java.util.Scanner;

public class ContaEnergia {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que leia o número de habitantes de uma determinada cidade, "
				+ "o valor do Kwh, e para cada habitante entre com os sweguintes dados: Consumo do mês e o "
				+ "código do consumidor (1 - Residencial, 2 - Comercial, 3 - Inudstrial). No final imprima "
				+ "o maior, o menor e a média do consumo dos habitantes; e por fim o total do consumo de "
				+ "cada categoria de consumidor.");
		System.out.println();
		
		Scanner input = new Scanner(System.in);

	    int numHabitantes, tipoConsumidor;
	    @SuppressWarnings("unused")
		double valorKwh, consumo, totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
	    double maiorConsumo = 0, menorConsumo = Double.MAX_VALUE, mediaConsumo = 0;

	    System.out.print("Digite o número de habitantes da cidade: ");
	    numHabitantes = input.nextInt();

	    System.out.print("Digite o valor do Kwh: ");
	    valorKwh = input.nextDouble();

	    for (int i = 1; i <= numHabitantes; i++) {
	        System.out.println("Habitante " + i);

	        System.out.print("Digite o consumo do mês em Kwh: ");
	        consumo = input.nextDouble();

	        if (consumo > maiorConsumo) {
	            maiorConsumo = consumo;
	        }

	        if (consumo < menorConsumo) {
	            menorConsumo = consumo;
	        }

	        mediaConsumo += consumo;

	        System.out.print("Digite o código do consumidor \n 1 - Residencial, \n 2 - Comercial, \n 3 - Industrial): \n Código: ");
	        tipoConsumidor = input.nextInt();
	        
	        switch (tipoConsumidor) {
	            case 1:
	                totalResidencial += consumo;
	                break;
	            case 2:
	                totalComercial += consumo;
	                break;
	            case 3:
	                totalIndustrial += consumo;
	                break;
	            default:
	                System.out.println("Código de consumidor inválido.");
	        }
	        System.out.println();
	    }
	    mediaConsumo /= numHabitantes;

	    System.out.println("\nMaior consumo: " + maiorConsumo + " Kwh");
	    System.out.println("Menor consumo: " + menorConsumo + " Kwh");
	    System.out.println("Média de consumo dos habitantes: " + mediaConsumo + " Kwh");
	    System.out.println("Total de consumo residencial: " + totalResidencial + " Kwh");
	    System.out.println("Total de consumo comercial: " + totalComercial + " Kwh");
	    System.out.println("Total de consumo industrial: " + totalIndustrial + " Kwh");
	    
	    input.close();
	}
}