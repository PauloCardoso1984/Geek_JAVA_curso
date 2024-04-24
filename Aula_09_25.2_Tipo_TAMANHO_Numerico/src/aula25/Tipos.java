// Tipos de dados
// Números (inteiros e reais)
package aula25;

public class Tipos {
	public static void main(String[] args) {

		// Tipos primários
		int num1 = 4; // inteiro longo 9999999999999999999
		short num2 = 4; // inteiro (curto/menor/baixo) 99999
		byte num5 = 4; // inteiro
		char num8 = 4;
		float num10 = 4;
		double num12 = 4;
		
		// Tipos não primários / primitivos
		Integer num3 = 98;
		Short num4 = 7; 
		Byte num6 = 9;
		Long num7 = 99L;
		Character num9 = 4;
		Float num11 = 5F;
		Double num13 = 5D;
		
		
		System.out.println("lon 		→ " + num7);
		System.out.println("int 		→ " + num1);
		System.out.println("short 		→ " + num2);
		System.out.println("Integer 	→ " + num3);
		System.out.println("float	 → " + num10);
		System.out.println("Float	 → " + num11);
		System.out.println("double	 → " + num12);
		System.out.println("Double 	→ " + num13);
		System.out.println("char 		→ " + num8);
		System.out.println("Short  		→ " + num4);
		System.out.println("byte 	 	→ " + num5);
		System.out.println("Byte  		→ " + num6);
		System.out.println();
		
		System.out.println("Quanto ocupa em memória");		
		System.out.println("Long 		→ " + Long.SIZE + " bits");
		System.out.println("double/Double 	→ " + Double.SIZE + " bits");
		System.out.println("int/Integer 	→ " + Integer.SIZE + " bits");
		System.out.println("float/Float 	→ " + Float.SIZE + " bits");		
		System.out.println("short/Short 	→ " + Short.SIZE + " bits");
		System.out.println("char/Charecter 	→ " + Character.SIZE+ " bits");
		System.out.println("byte/Byte 	→ " + Byte.SIZE + " bits");
		
		System.out.println();		
		System.out.println("Valor minimo e máximo");
		System.out.println("Valor Minimo long/Long 		" + Long.MIN_VALUE);
		System.out.println("Valor Máximo long/Long 		" + Long.MAX_VALUE);
		System.out.println();
		System.out.println("Valor Minimo double/Double 	" + Double.MIN_VALUE);
		System.out.println("Valor Máximo double/Double 	" + Double.MAX_VALUE);
		System.err.println();
		System.out.println("Valor Minimo int/Integer 	" + Integer.MIN_VALUE);
		System.out.println("Valor Máximo int/Integer 	" + Integer.MAX_VALUE);
		System.out.println();
		System.out.println("Valor Minimo float/Float 	" + Float.MIN_VALUE);
		System.out.println("Valor Máximo float/Float 	" + Float.MAX_VALUE);		
		System.out.println();
		System.out.println("Valor Minimo short/Short 	" + Short.MIN_VALUE);
		System.out.println("Valor Máximo short/Short 	" + Short.MAX_VALUE);
		System.out.println();
		System.out.println("Valor Minimo byte/Byte 		" + Byte.MIN_VALUE);
		System.out.println("Valor Máximo byte/Byte 		" + Byte.MAX_VALUE);
		System.out.println();
		System.out.println("Valor Minimo char/Charecter 	" + Character.MIN_VALUE);
		System.out.println("Valor Máximo char/Character 	" + Character.MAX_VALUE);
		

	}
}