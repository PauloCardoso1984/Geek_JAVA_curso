package templateMethod;

public class TreinamentoInicioDaTemporada extends Treinamento {

	@Override
	public void preparoFisico() {
		System.out.println("Preparo físico de início da temporada...");

	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo treino de início da temporada...");

	}

	@Override
	public void preparo() {		
		System.out.println("Inicio da competição...");
	}

}
