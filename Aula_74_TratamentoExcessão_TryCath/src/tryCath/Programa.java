package tryCath;

/*
 * 
*/
public class Programa {
	public static void main(String[] args) {

		// VETOR COM 5 NÚMEROS / POSIÇÕES
		int numeros[] = new int[5];

		System.out.print("Um a frente do outro : ");
		for (int i = 0; i < numeros.length; i++) {
			// PODE CRIAR EXPRESSÕES
			numeros[i] = i + 1;
			System.out.print(numeros[i] + " - ");

		}
		System.out.println();
		System.out.println();

		System.out.println("Um abaixo do outro " );
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
			}			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println();
				System.out.println("SE esá aqui é porque caiu em excessão. Você está tentando acessar uma posição do Array que não existe, o erro está no sinal de <= da expressão. Essa linha 31 → for (int i = 0; i <= numeros.length; i++)");
			}
		}		
	}
}
