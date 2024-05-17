package defaultMethods;

/* DEFAULT METHODS 
 * => São metodos completos implementados em Interfaces. 
 * Os métodos como são concretos e possuem implementação e não carece de 
 * serem implementados por interfaces.
 * */
public class Programa {
	public static void main(String[] args) {
		
		// CHAMANDO DENTRO DE MINHA CLASSE
		Teste t = new MinhaClasse();
		System.out.println(t.Mensagem() + "\n");
		
		// CHAMANDO DENTRO DA INTERFACE
		t.meu_metodo();
		

	}
}