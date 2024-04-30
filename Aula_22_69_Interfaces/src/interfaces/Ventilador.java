package interfaces;

public class Ventilador implements IEletronico {

	private boolean ligado = false;

	@Override
	// Verifica se está desligado para poder ligar
	public void ligar() {
		if (!this.ligado) {
			this.ligado = true;
			System.out.println("Aparelho ligado...");
		}
	}

	@Override
	// Verifica se está ligado para poder desligar
	public void desligar() {
		if (this.ligado) {
			this.ligado = false;
			System.out.println("Aparelho desligado...");
		}
	}
}