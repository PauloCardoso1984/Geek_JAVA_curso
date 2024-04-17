package estaticos;
/*
 * Atributos estáticos são atributos onde os valores são
  compartilhados entre as instâncias da classe.
  
  Para utilizar o atributo static colocamos o nome da classe
  junto ao atributo.

Exemplo = NomeDaClasse.atributo
*/
public class Programa {
	public static void main(String[] args) {

		Conta c1 = new Conta("Paulo Cardoso");
		Conta c2 = new Conta("Reginaldo Cardoso");
		Conta c3 = new Conta("Reginaldo Paulo");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(Conta.contador);
		Conta.contador = 42;
		System.out.println(Conta.contador);
	}
}
