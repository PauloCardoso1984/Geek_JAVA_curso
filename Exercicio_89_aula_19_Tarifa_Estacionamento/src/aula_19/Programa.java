package aula_19;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("As tarifas de certo estacionamento são as seguintes. \n" + " 1 e 2 horas		R$ 1.00 \n"
				+ " 3 e 4 horas 		R$ 1.4 \n" + " 5 horas a seguir	R$ 2.0");
		System.out.println();

		// Definir o formato desejado para a data e hora
		SimpleDateFormat formatoDataHora = new SimpleDateFormat("HH:mm");

		// Ler a data e hora de entrada e saída do estacionamento do usuário
		System.out.print("Informe a hora de entrada (HH:mm): ");
		String entradaStr = sc.nextLine();

		System.out.print("Informe a hora de saída (HH:mm): ");
		String saidaStr = sc.nextLine();

		double tarifa = 0;

		try {
			// Converter as strings de entrada e saída para objetos Date
			Date entrada = formatoDataHora.parse(entradaStr);
			Date saida = formatoDataHora.parse(saidaStr);

			// Calcular a diferença de horas entre a entrada e saída
			long duracaoSegundos = saida.getTime() - entrada.getTime();
			int duracaoHoras = (int) (duracaoSegundos / 1000 / 60 / 60);

			// Calcular a tarifa com base na quantidade de horas

			if (duracaoHoras <= 2) {
				tarifa = duracaoHoras * 1.00;
			} else if (duracaoHoras <= 4) {
				tarifa = duracaoHoras * 1.40;
			} else if (duracaoHoras >= 5) {
				tarifa = duracaoHoras * 2.00;
			}
			if (duracaoHoras < 0) {
				System.out.println("Valor inválido!! ERRO");
				sc.close();
			}
				// Imprimir a tarifa calculada
				System.out.println("A tarifa total é R$ " + tarifa);
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao efetuar o cálculo das tarifas.");
			e.printStackTrace();
		}
		sc.close();
	}
}
