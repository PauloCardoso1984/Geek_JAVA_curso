package metodos;
/*
 * Metodos Estáticos -> não depende de uma instância da classe para ser utilizado,
 * pode-se utilizar conforme NomeDaClasse.metodo();
*/
public class Programa {
	public static void main(String[] args) {

		// METODO ESTATICOS - acessando
		System.out.println("A proxima conta será = " + Conta.proximaConta() + "\n");
		
		Conta c1 = new Conta ("Paulo Cardoso");
		System.out.println(c1);
		
		// METODO ESTATICOS - acessando
		System.out.println("A proxima conta será (METODO ESTATICO) = " + Conta.proximaConta());
		
		// SEM METODO ESTATICO
		System.out.println("A proxima conta será (SEM METODO ESTATICO) = "+ c1.proximaConta());
	}
}
