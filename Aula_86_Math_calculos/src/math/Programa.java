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

		// PI
		System.out.println("PI " + Math.PI);
			
		// Seno de 45º
		System.out.println("Seno de 45º " + Math.sin(45));
		
		// Coseno de 45º
		System.out.println("Coseno de 45º " + (Math.cos(45)));
		
		// Tangente de 45º
		System.out.println("Tangente de 45º " + (Math.tan(45)));
		
		// Arredonda para baixo o número com round
		System.out.println("Arredonda para baixo o número com round " + Math.round(Math.PI));
		System.out.println("Arredonda para baixo o número com round " + Math.floor(Math.PI));
		
		// Arredonda para cima o número com round
		System.out.println("Arredonda para cima o número com round " + Math.ceil(Math.PI));
		
		// Elevar um número 
		System.out.println("Elevar um número " + Math.pow(3, 2));
		System.out.println("Elevar um número " + Math.round(Math.pow(3, 2)));
		System.out.println("Elevar um número " + Math.floor(Math.pow(3, 2)));
		
		// Raiz Quadrada
		System.out.println("Raiz Quadrada " + Math.sqrt(144));
		System.out.println("Raiz Quadrada " + Math.round(Math.sqrt(144)));
		System.out.println("Raiz Quadrada " + Math.floor(Math.sqrt(144)));
	}
}