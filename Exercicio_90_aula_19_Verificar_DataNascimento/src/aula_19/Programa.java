package aula_19;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Leia uma data de nascimento de uma pessoa fornecida através de três números inteiros: \n"
				+ "Dia, Mês e Ano. Teste a validade desta data para saber se esta é uma data válida. \n"
				+ "Teste se o dia fornecido é um dia válido dia > 0, dia <= 28 para o mês de fevereiro \n"
				+ "(29 se o ano for bissexto), dia <=30 em abril, junho, setembro e novembro, dia <= 31 \n"
				+ "nos outros meses. Teste a validade do mês: mês > 0 e mês < 13. Teste a validade do \n"
				+ "ano: <= ano atual (use uma constante definida com o valor igual a 2023). \n"
				+ "Imprimir: 'Data válida' ou 'Data inválida' no final da execução do programa.");
		System.out.println();
		System.out.print("Digite a data de nascimento ('dd/MM/yyyy'): ");
		String data = sc.nextLine();

		String dataDia = data.substring(0, 2);
		int dia = Integer.parseInt(dataDia);
		if (dia < 0 && dia > 31) {
			System.out.println("Dia incorreto");
		}

		String dataMes = data.substring(3, 5);
		int mes = Integer.parseInt(dataMes);
		if (mes < 1 && mes > 12) {
			System.out.println("Mês incorreto");
		}

		String dataAno = data.substring(6, 10);
		int ano = Integer.parseInt(dataAno);

		int anoAtual = LocalDate.now().getYear();
/*		int mesAtual = LocalDate.now().getMonthValue();
		int diaAtual = LocalDate.now().getDayOfMonth();
*/
		int verAno = anoAtual - ano;

		System.out.println("Nascido no dia:	 " + dia);
		System.out.println("No mês de:	 " + mes);
		System.out.println("No ano de:	 " + ano);

		System.out.println();

		System.out.println("Você tem " + verAno + " anos.");

		sc.close();
	}
}