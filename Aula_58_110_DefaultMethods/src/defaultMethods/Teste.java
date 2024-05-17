package defaultMethods;

public interface Teste {
	
	int valor = 9;
	
	public String Mensagem();
	
	default void meu_metodo() {
		System.out.println("Meu método padrão => Dentro da Interface Teste....");
	}
}
