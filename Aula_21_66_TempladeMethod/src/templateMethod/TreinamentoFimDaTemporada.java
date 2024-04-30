package templateMethod;

public class TreinamentoFimDaTemporada extends Treinamento {

	@Override
	public void preparoFisico() {
		System.out.println("Preparo físico do fim da temporada...");

	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo treino de fim da temporada...");

	}
	
	@Override
	public void preparo() {
		System.out.println("Fim das competições...");

	}


}
