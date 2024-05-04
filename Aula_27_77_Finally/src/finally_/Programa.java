package finally_;

public class Programa {
	public static void main(String[] args) {

		int numeros[] = new int[5];

		System.out.print("Um a frente do outro : ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			System.out.print(numeros[i] + " - ");

		}
		System.out.println();
		System.out.println();

		System.out.println("Um abaixo do outro ");
		// PARA IMPRIMIR O FOR ACIMA USANDO OUTRO FOR
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println();

		// UTILIZAR O try-catch
		System.out.println("Utilizando o Try-Catch");
		for (int i = 0; i <= numeros.length; i++) { // SAINDO DOS LIMITES DO ARRAY, DARÁ ERRO
			try { // TENTE FAZER ISSO
				System.out.println(numeros[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\nERRO!!! Você está tentando acessar uma posição do Array que não existe");
				System.out.println();
			} finally { // ISSO SERÁ EXECUTADO APÓS A CAPTURA DO ERRO
				System.out.println("Reinicie o processo...");
			}
		}
	}
}
