package view;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class TesteBanco {

	public static void main(String[] args) {
		
		
		Cliente paulo = new Cliente("Paulo Cardoso", "paulo@cardoso.com", "122112321", Utils.stringParaData("18/02/1984"));  
		Cliente paulo1 = new Cliente("Cardoso Paulo", "paulo@regis.com", "321321215", Utils.stringParaData("28/02/1999"));  

		Conta r1 = new Conta(paulo);
		Conta r2 = new Conta(paulo1);
		
		
		System.out.println(paulo);
		System.out.println(paulo1);
		
		System.out.println(r1);
		System.out.println(r2);
		
		// Testando o deposito positivo
		r1.depositar(500.00);
		r2.depositar(800.00);
		System.out.println();

		System.out.println(r1);
		System.out.println(r2);
		
		// Testando o deposito negativo
		r1.depositar(-600.00);
		r2.depositar(-900.00);
		System.out.println();
		
		// Tentando sacar valor no saldo
		r1.sacar(400.0);
		
		// Tentando sacar valor sem saldo
		r1.sacar(1400.0);


	}
}