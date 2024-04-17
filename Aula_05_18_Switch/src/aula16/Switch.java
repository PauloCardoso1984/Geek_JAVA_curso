package aula16;

public class Switch {
	public static void main(String[] args) {

		int numero = 3;
		
		switch (numero) {
			case 1: 
				System.out.println("O numero é 1.");
				break;
			case 3: 
				System.out.println("O numero é 3.");
				break;
			case 5: 
				System.out.println("O numero é 5.");
				break;	

			default:
				System.out.println("Numero não encontrado: " + numero);
				break;
		}
	}
}