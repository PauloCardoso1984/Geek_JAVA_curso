package filas;

import java.util.LinkedList;
import java.util.Queue;

// FILAS -> IMPLEMENTAÇÃO DO JAVA
/* 
Todo elemento entra no final da fila.

= O primeiro elemento a entrar é também o primeiro a sair.

=> Adiciona com add
=> Remove com poll
 */ 
public class Programa {
	public static void main(String[] args) {
		
		// INSTANCIANDO / INTERFACE
		Queue<String> fila = new LinkedList<String>();
		System.out.println(fila);
		
		// ADICIONANDO NA FILA
		fila.add("Paulo");
		System.out.println(fila);
		
		fila.add("Reginaldo");
		System.out.println(fila);
	
		fila.add("Cardoso");
		System.out.println(fila);
		
		// REMOVENDO UM ELEMENTO
		fila.poll();
		System.out.println(fila);
		
		fila.poll();
		System.out.println(fila);
	}
}