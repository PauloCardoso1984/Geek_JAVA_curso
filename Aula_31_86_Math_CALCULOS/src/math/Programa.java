package math;
/* Math -> Realizando cáculos matemáticos
 * 
 * A biblioteca Math possui vários métodos e constantes estáticas para 
 * que possamos utilizar nos nossos programas
 
 */

public class Programa { 
	
	public static void main(String[] args) {

		// Logaritmo - constante de Euler
		System.out.println("Logaritmo - constante de Euler " + Math.E); 
		System.out.println();
		
		// PI
		System.out.println("PI = " + Math.PI);
		System.out.println();
		
		// Seno de 45º
		System.out.println("Seno de 45º = " + Math.sin(45));
		System.out.println();
		
		// Coseno de 45º
		System.out.println("Coseno de 45º = " + (Math.cos(45)));
		System.out.println();
		
		// Tangente de 45º
		System.out.println("Tangente de 45º = " + (Math.tan(45)));
		System.out.println();
		
		// Arredonda para baixo o número com round
		System.out.println("Arredonda para baixo o número com round = " + Math.round(Math.PI));
		System.out.println("Arredonda para baixo o número com floor = " + Math.floor(Math.PI));
		System.out.println();
		
		// Arredonda para cima o número com round
		System.out.println("Arredonda para cima o número com ceil = " + Math.ceil(Math.PI));
		System.out.println();
		
		// Elevar um número 
		System.out.println("Elevar um número float (3^2) = " + Math.pow(3, 2));
		System.out.println("Elevar um número int   (3^2) = " + Math.round(Math.pow(3, 2)));
		System.out.println("Elevar um número float (3^2) = " + Math.floor(Math.pow(3, 2)));
		System.out.println();
		
		// Raiz Quadrada
		System.out.println("Raiz Quadrada float (144) = " + Math.sqrt(144));
		System.out.println("Raiz Quadrada int   (144) = " + Math.round(Math.sqrt(144)));
		System.out.println("Raiz Quadrada float (144) = " + Math.floor(Math.sqrt(144)));
	}
}