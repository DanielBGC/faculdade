package controleremoto;

public class ControleRemotoGoku implements ControleRemoto {
	int canal;
	@Override
	public void ligar() {
		System.out.println("controle remoto do goku ligando");
		System.out.println("fazendo um kamehameha");
		
	}

	@Override
	public void desligar() {
		System.out.println("desligando o goku");
		
	}

	@Override
	public int trocarCanal(int x) {
		this.canal = x;
		return this.canal;
	}

}
