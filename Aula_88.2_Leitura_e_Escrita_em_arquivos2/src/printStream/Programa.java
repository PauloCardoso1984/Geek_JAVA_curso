package printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/* Escrevendo em arquivos 2  */

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		try {
			// Vai abrir um documento e continuar escrevendo
			PrintStream escrever = new PrintStream(new FileOutputStream("saída.txt", true));

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