package interfaces;

/* 
	Uma interface pode conter:
 	- Constantes;
 	- Métodos abstratos;
 	
 Interface para servir de contato para produtyos eletrônicp. Todo produto eletrônico
 que implementar esta interface OBRIGATÓRIAMENTE deverão implmentar os métodos abstratos.
*/

public interface IEletronico {
	// CONSTANTE
	public String MARCA = "Panasonic";  // CONSTANTE NÃO PODE SER ALTERADA
	
	public void ligar();
	
	public void desligar();
}
