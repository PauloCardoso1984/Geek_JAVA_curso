package threadsSynchronized;

/* Por padrão as threads não são sincronizadas, pode acontecer de uma acessar um objeto
 * que ainda não fi atualizado ou ainda as threads executarem depois do valor estar
 * impresso.
 * 
 * Synchronized Sincronizada
 * 
 * O sincronismo ocorre pois durante a execução do método a thread executa
 * um "lock" (blqueio) da função para que outra thread 
 * 
 * */

public class Programa {
	public static void main(String[] args) throws InterruptedException {
		
		Cliente cl1 = new Cliente(30, "Paulo Cardoso" , "Rua 59");
		Conta c1 = new Conta(1, 500, 500, cl1);
		
		System.out.println(c1);
		
		System.out.println();
		
		System.out.println("Saldo da conta 			R$ " + c1.getSaldo());
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		t1.start();
		t2.start();
		
		// SINCRONIZAÇÃO
		t1.join(); // Comunica que deve se juntar a um sincronizador
		t2.join(); // Comunica que deve se juntar a um sincronizador
		
		System.out.println("Saldo da conta (Synchronized) 	R$ " + c1.getSaldo());
		
		
		
		
	}
}