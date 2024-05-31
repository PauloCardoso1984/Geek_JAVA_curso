package helper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Utils {
	
	//CONJUNTO DE FUNÇÕES
	// Formatar valores e data
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
	
	// Recebe uma data do tipo DATE e formatará no formato SDF
	public static String dateParaString(Date data) {
		return Utils.sdf.format(data);
	}
	
	// Recebe um valor tipo DOUBLE e formatará no formato NF
	public static String doubleParaString(Double valor) {
		return Utils.nf.format(valor);
	}
	
	// Transformar uma String para Double
	public static Double stringParaDouble(String valor) {
		try {
			return (Double)Utils.nf.parse(valor);
		}catch (ParseException e) {
			return null;
		}
	}
	
	// Método para pausar usando TimeUnit.SECONDS.sleep
	public static void pausar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		}catch (InterruptedException e) {
			System.out.println("Erro ao pausar por " + segundos + " segundos.");
		}
	}
}