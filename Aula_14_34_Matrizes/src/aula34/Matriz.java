//	MATRIZES PARTE 1 e 2
// Arrays, vetores, MATRIZES multi-dimensionais
/*	
 * Matriz [3][3] → 03 linhas e 03 colunas.
 * 
 * numeros[0][0] = 1;
 * numeros[0][1] = 2;
 * numeros[0][2] = 5;
 * numeros[1][0] = 7
 * numeros[1][1] = 4;
 * numeros[1][2] = 9;
 * numeros[2][0] = 3;
 * numeros[2][1] = 6
 * numeros[2][2] = 32
 * */

package aula34;

public class Matriz {
	public static void main(String[] args) {

		// Declaração
		int outros_numeros[][];

		// Declaração e definição de tamannho
		int numeros[][] = new int[3][3];

		// Declaração, definir tamanho e inicializar
		int mais_numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Declaração de uma matriz informando somente as linhas
		int matriz[][] = new int[2][];
		matriz[0] = new int[5];
		matriz[1] = new int[3];

		// Decçlaração de matrizes incompleta
		int nova_matriz[][] = { { 1, 2 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11 } };

		// ******************************************************

		// EXEMPLOS → inicializada e informado os valores
		int numero[][] = new int[3][3];
		numero[0][0] = 1;
		numero[0][1] = 3;
		numero[0][2] = 5;
		
		numero[1][0] = 7;
		numero[1][1] = 9;
		numero[1][2] = 11;
		
		numero[2][0] = 13;
		numero[2][1] = 15;
		numero[2][2] = 17;

		System.out.println("Imprimir um valor especifico = " + numero[1][0]);

		System.out.println();

		System.out.println("A relação da MATRIZ: ");
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				System.out.println(numero[i][j]);
			}
		}
		
		System.out.println();
		for (int i = 0; i < mais_numeros.length; i++) {
			for (int j = 0; j < mais_numeros.length; j++) {
				System.out.println(mais_numeros[i][j]);
			}
		}
		System.out.println();
		
		// A denominação numero[i].length é que a matriz pode não ser quadrada
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero[i].length; j++) {
				System.out.println("numeros[" + i + "][" + j + "] = " + numero[i][j]);
			}
		}
		System.out.println();

		
		// Montando calculos
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero[i].length; j++) {
				numero[i][j] = i + j * 2;
			}
		}
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero[i].length; j++) {
				System.out.println("numeros[" + i + "][" + j + "] = " + numero[i][j]);
			}
		}
	}
}