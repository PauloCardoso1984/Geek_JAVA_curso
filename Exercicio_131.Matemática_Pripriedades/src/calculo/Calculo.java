package calculo;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("Escreve um programa que verifique quais números entre 1000 e 9999 (inclusive) possuem "
				+ "a propriedade seguinte: a soma dos dois digitos de mais baixa ordem com os dois digitos de mais"
				+ " alta ordem elevada ao quadrado é igual ao próprio número.");
		System.out.println();

        for (int num = 1000; num <= 9999; num++) {
            int firstTwoDigits = num / 100;
            int lastTwoDigits = num % 100;
            
            int sumSquared = (firstTwoDigits + lastTwoDigits) * (firstTwoDigits + lastTwoDigits);
            
            if (sumSquared == num) {
                System.out.println(num + " possui a propriedade: A soma dos dois digitos de mais baixa ordem com os dois digitos de mais alta ordem elevada ao quadrado é igual ao próprio número.");
            }
        }
        //******* NÃO ENTENDI **************
    }
}