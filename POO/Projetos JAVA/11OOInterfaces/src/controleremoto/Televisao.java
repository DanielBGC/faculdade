package controleremoto;

public class Televisao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ControleRemoto controleRemotoGoku = new ControleRemotoGoku();
		controleRemotoGoku.ligar();
		System.out.println("Canal atual e: "  + controleRemotoGoku.trocarCanal(10) + "\n");
		
                
                ControleRemoto controleRemotoUniversal = new ControleRemotoUniversal();
		controleRemotoUniversal.ligar();
                controleRemotoUniversal.desligar();
                controleRemotoUniversal.trocarCanal(2);
		

	}

}
