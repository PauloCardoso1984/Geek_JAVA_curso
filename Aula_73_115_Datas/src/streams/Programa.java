package streams;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/* DATAS / HORAS
=> 
 * */
public class Programa {
	public static void main(String[] args) {

		// FORMATO ISO - PADRÃO
		System.out.println("FORMATO ISO - PADRÃO");
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate ano_novo = LocalDate.of(2025, Month.JANUARY, 1);
		System.out.println(ano_novo);

		int ano = ano_novo.getYear();
		Month mes = ano_novo.getMonth();
		int dia = ano_novo.getDayOfYear();

		System.out.println("O ano novo será em " + dia + " de " + mes + " de " + ano + "\n");

		Period periodo = Period.between(hoje, ano_novo);
		System.out.println("Faltam " + periodo.getYears() + " anos " + periodo.getMonths() + " meses "
				+ periodo.getDays() + " dias");
	}
}