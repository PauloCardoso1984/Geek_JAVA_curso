package calculo;

public class Palindromo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que calcule o maior número palíndromo feito a "
				+ "partir do produto de dois números de 3 digitos.");
		System.out.println();

		int maiorPalindromo = 0;

		for (int i = 999; i >= 100; i--) {
			for (int j = i; j >= 100; j--) {
				int produto = i * j;

				if (produto > maiorPalindromo && ehPalindromo(produto)) {
					maiorPalindromo = produto;
				}
			}
		}

		System.out.println("O maior número palíndromo feito a partir do produto de dois números de 3 dígitos é: "
				+ maiorPalindromo);
	}

	public static boolean ehPalindromo(int numero) {
		String numeroStr = String.valueOf(numero);
		int i = 0;
		int j = numeroStr.length() - 1;

		while (i < j) {
			if (numeroStr.charAt(i) != numeroStr.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}
}