package filas;

// FILAS
/* 
Todo elemento entra no final da fila.

= O primeiro elemento a entrar é também o primeiro a sair.
 */ 
public class Programa {
	public static void main(String[] args) {
		
		// INSTANCIANDO
		Fila fila = new Fila();
		System.out.println(fila);
		
		// ADICIONANDO NA FILA
		fila.adiciona("Paulo");
		System.out.println(fila);
		
		fila.adiciona("Reginaldo");
		System.out.println(fila);
		
		fila.adiciona("Cardoso");
		System.out.println(fila);
		
		// REMOVENDO UM ELEMENTO
		fila.remove();
		fila.remove();
		fila.remove();
		fila.remove();
		System.out.println(fila);
		
		// VERIFICAR SE A FILA ESTÁ VAZIA
		System.out.println("A fila está vazia? " + fila.vazia());
		
	}
}