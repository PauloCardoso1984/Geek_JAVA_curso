package interfaces;
/*
 * Template Method -> são conhecidas como contratos.
 Uma empresa implementar um contrato 'com regras' para definir a criação
 de um produto/serviço. Quem implementa o contratp é obrigado a seguir as
 regras.
  
*/
public class Programa {
	public static void main(String[] args) {

		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador é = " + vent.MARCA);
		
		vent.desligar(); // Não deve imprimir a mensagem		
		vent.ligar(); // Deve imprimir a mensagem		
		vent.desligar(); // Deve imprimir a mensagem
	}
}
