package calculo;

public class EscreverNumero {

	public static void main(String[] args) {
		System.out.println("Se os números de 1 a 5 são escritos em palavras: in, dois, três quatro, cinco, "
				+ "então há 2 + 4 + 4 + 6 + 5 = 22 letras usadas no total. Faça um programa que conte quantas "
				+ "letras seriam utilizadas se todos os números de 1 a 1000 fossem escritos em palavras. "
				+ "Desprezando os espaços e hifens..");
		System.out.println();

		int totalLetters = 0;
		for (int i = 1; i <= 1000; i++) {
			totalLetters += countLetters(convertNumberToWords(i));
		}
		System.out.println("Total de letras utilizadas: " + totalLetters);
	}

	public static String convertNumberToWords(int number) {
		if (number == 1000) {
			return "mil";
		}

		String[] units = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
		String[] teens = { "dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito",
				"dezenove" };
		String[] tens = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta",
				"noventa" };
		String[] hundreds = { "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos",
				"setecentos", "oitocentos", "novecentos" };

		String words = "";
		int unit = number % 10;
		int ten = (number / 10) % 10;
		int hundred = number / 100;

		if (hundred > 0) {
			words += hundreds[hundred] + (ten > 0 || unit > 0 ? " e " : "");
		}

		if (ten > 1) {
			words += tens[ten] + (unit > 0 ? " e " : "");
		} else if (ten == 1) {
			words += teens[unit] + "";
		}

		if (unit > 0 && ten != 1) {
			words += units[unit];
		}

		return words;
	}

	public static int countLetters(String words) {
		words = words.replaceAll(" ", "").replaceAll("-", "");
		return words.length();
	}
}