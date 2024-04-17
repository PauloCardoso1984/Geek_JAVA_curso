package calculo;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		System.out.println(
				"Faça um programa que calcule a área de um triângulo, cuja base e altura são fornecidas pelo usuário. "
						+ "Esse programa não pode permitir a entrada de dados invalidos, ou seja, medidas menores ou igual a 0.");
		System.out.println();

		Scanner input = new Scanner(System.in);

		double base, altura;

		System.out.print("Digite a base do triângulo: ");
		base = input.nextDouble();

		while (base <= 0) {
			System.out.println("A base do triângulo deve ser maior que 0. "); 
			System.out.print("Digite novamente a base do triângulo: ");
			base = input.nextDouble();
			System.out.println();
		}

		System.out.print("Digite a altura do triângulo: ");
		altura = input.nextDouble();

		while (altura <= 0) {
			System.out.println("A altura do triângulo deve ser maior que 0. ");
			System.out.print("Digite novamente a altura do triângulo: ");
			altura = input.nextDouble();
		}

		double area = (base * altura) / 2;

		System.out.println();
		System.out.println("A área do triângulo é: " + area);

		input.close();
	}
}