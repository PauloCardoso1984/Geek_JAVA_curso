package calculo;

public class Comparar {

	public static void main(String[] args) {
		System.out.println("Chico tem 1.50 metro e cesce 2 centimetro por ano, enquanto Zé tem 1.10 e cresce "
				+ "3 centimetros por ano. Escreva um programa que alcule e imprime quantos anos serão necessários "
				+ "para que Zé tenha o mesmo tamanho de Chico.");
		System.out.println();

		double alturaChico = 1.50;
		double alturaZe = 1.10;
		int crescimentoChico = 2; // centímetros por ano
		int crescimentoZe = 3; // centímetros por ano
		int anos = 0;

		while (alturaZe < alturaChico) {
			alturaChico += crescimentoChico / 100.0; // converte centímetros para metros
			alturaZe += crescimentoZe / 100.0; // converte centímetros para metros
			anos++;
		}

		System.out.println("Serão necessários " + anos + " anos para Zé ter a mesma altura que Chico.");
	}
}