package printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/* Escrevendo em arquivos  */

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		try {
			/* Criar um arquivo e escrever dentro dele / Toda vez que o programa for executado o arquivo será recriado 
			e as informações anteriores serão perdidas */
			PrintStream escrever = new PrintStream("saída.txt");

			// SE PRECISAR DE ESCREVER MAIS DE UMA LINHA TEM QUE FAZER UM FOR
			for (int i = 0; i < 5; i++) {

				System.out.print("Escreva alguma mensagem #" + (i + 1) + ": ");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			escrever.close();
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo...");
		} finally {
			System.out.println("Processo finalizado com sucesso...");
		}
		teclado.close();
	}
}
