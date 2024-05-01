package metodos;

import java.io.ObjectInputStream.GetField;

/*
 * Métodos Estáticos -> não depende de uma instância da classe para ser utilizado,
 * pode-se utilizar conforme NomeDaClasse.metodo();
*/
public class Programa {
	public static void main(String[] args) {

		// METODO ESTATICOS - acessando
		System.out.println("A proxima conta será = " + Conta.proximaConta() + "\n");

		Conta c1 = new Conta("Paulo Cardoso");
		System.out.println(c1);
		
		Conta c2 = new Conta("Paulo Reginaldo");
		System.out.println(c2);
		
		Conta c3 = new Conta("Reginaldo Cardoso");
		System.out.println(c3);

		// METODO ESTATICOS - acessando
		System.out.println("A proxima conta será (MÉTODO ESTÁTICO) = " + Conta.proximaConta());

		// SEM METODO ESTATICO
		System.out.println("A proxima conta será (SEM MÉTODO ESTÁTICO) = " + c1.proximaConta());
		
	}
}
