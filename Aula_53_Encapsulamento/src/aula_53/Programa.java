package aula_53;

public class Programa {

	public static void main(String[] args) {
		
		// INSTANCIANDO O CLIENTE
		Cliente paulo = new Cliente("Paulo Cardoso","Rua A, 100");
		Cliente cardoso = new Cliente("Cardoso Reginaldo", "Rua B, 150");
		
		// INSTANCIANDO A CONTA
		Conta conta_paulo = new Conta(1, 10000.0f, 200.0f, paulo);
		Conta conta_cardoso = new Conta(2, 15000.0f, 6000.0f, cardoso);

		System.out.println("Saldo do Paulo Cardoso: R$ " + conta_paulo.getSaldo());
		System.out.println("Saldo do Cardoso Reginaldo: R$ " + conta_cardoso.getSaldo());
		
		System.out.println();
		
		// SACAR
		conta_paulo.sacar(9900);
		conta_cardoso.sacar(620);
		
		System.out.println("Saldo do Paulo Cardoso: R$ " + conta_paulo.getSaldo());
		System.out.println("Saldo do Cardoso Reginaldo: R$ " + conta_cardoso.getSaldo());
		
		System.out.println();
		
		// DEPOSITAR
		conta_paulo.depositar(1500);
		conta_cardoso.depositar(5210);
		
		System.out.println("Saldo do Paulo Cardoso: R$ " + conta_paulo.getSaldo());
		System.out.println("Saldo do Cardoso Reginaldo: R$ " + conta_cardoso.getSaldo());
				
	}
}
