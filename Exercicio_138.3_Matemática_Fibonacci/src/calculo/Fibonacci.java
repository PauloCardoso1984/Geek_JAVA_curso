package calculo;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Faça um programa que some os termos de valor par da sequencia de Fibonacci, /n"
				+ "cujos valor não ultrapassem quatro milhões.");
		System.out.println();

        int termo1 = 1;
        int termo2 = 2;
        int soma = 0;

        while (termo2 <= 4000000) {
            if (termo2 % 2 == 0) {
                soma += termo2;
            }

            int proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;
        }

        System.out.println("A soma dos termos de valor par da sequência de Fibonacci até 4 milhões é: " + soma);
    }
}