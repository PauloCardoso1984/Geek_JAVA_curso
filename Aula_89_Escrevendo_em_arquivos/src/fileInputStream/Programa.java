package fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/* Lendo em arquivos  */

public class Programa {

	public static void main(String[] args) {

		try {
			// Ler o arquivo
			Scanner ler1 = new Scanner(new FileInputStream("saída.txt"));
			Scanner ler2 = new Scanner(new FileInputStream("entrada.txt"));

			// Ler linha por linha (hasNextLine -> enquento tiver próxima linha)
			while (ler1.hasNextLine()) {
				String linha = ler1.nextLine();
				System.out.println(linha);
			}
			System.out.println();
			
			while (ler2.hasNextLine()) {
				String linha = ler2.nextLine();
				System.out.println(linha);
			}
			ler1.close();
			ler2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado...");
		} 
			
		finally {
			System.out.println();
			System.out.println("Processo finalizado com sucesso...");
		}
	}
}
