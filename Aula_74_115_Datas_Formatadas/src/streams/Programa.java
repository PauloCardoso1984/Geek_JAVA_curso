package streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
				+ periodo.getDays() + " dias\n");
		
		// FORMATANDO AS DATAS
		System.out.println("FORMATANDO AS DATAS");
		DateTimeFormatter fomatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println((hoje.format(fomatador)));
		
		// FORMATANDO AS DATAS / HORAS
		System.out.println("\nDATAS / HORAS");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("PADR4O IS0: " + agora);
		// FORMANTANDO HORAS
		DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
		System.out.println("FORMATANDO AS DATAS / HORAS: "+ agora.format(formatador_horas) + "\n");
		
		// DEFININDO UM HORÁRIO
		LocalTime intervaloInicio = LocalTime.of(9, 30);
		LocalTime intervaloTermino = LocalTime.of(9, 50);
		System.out.println("O intervalo será das : "  + intervaloInicio + " até " + intervaloTermino);
	}
}