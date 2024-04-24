// Operações Matemáticas
package aula29;

public class OperacaoMatematica {
	public static void main(String[] args) {

		int num1 = 5, num2 = 9, res;
		float res2, res3;

		// Soma
		res = num1 + num2;
		System.out.println("A soma entre os números é: " + res);

		// Subtração
		res = num1 - num2;
		System.out.println("A subtração entre os números é: " + res);

		// Multiplicação
		res = num1 * num2;
		System.out.println("A multiplicação entre os números é: " + res);

		// Divisão 1
		res2 = num2 / num1;
		System.out.println("A divisão entre os números é: " + res2);
		// Divisão 2
		res2 = (float)num2 / (float)num1;
		System.out.println("A divisão entre os números é: " + res2);
		// Divisão 3 - MÓDULO
		res2 = num2 % num1;
		System.out.println("O módulo entre os números é: " + res2);
		
		// Potenciação
		res2 = (float) Math.pow(num1, num2);
		System.out.println("A potência entre os números é: " + res2);
		
		// Raiz Quadrada
		res2 = (float) Math.sqrt(num1);
		res3 = (float) Math.sqrt(num2);
		System.out.println("A raiz quadrada é: " + res2);
		System.out.println("A raiz quadrada é: " + res3);
	}
}