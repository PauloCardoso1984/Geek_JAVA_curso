package calculo;

public class Primo {

	public static void main(String[] args) {
		System.out.println("Faça um programa que calcule a soma de todos os números primos abaixo de dois milhões.");
		System.out.println();

		long soma = 0;

		for (int i = 2; i < 2000000; i++) {
			if (isPrimo(i)) {
				soma += i;
			}
		}

		System.out.println("A soma de todos os números primos abaixo de dois milhões é: " + soma);
	}

	public static boolean isPrimo(int numero) {
	    if (numero < 2) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(numero); i++) {
	        if (numero % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}