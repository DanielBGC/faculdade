package controleremoto;

public class ControleRemotoUniversal implements ControleRemoto {
        private long codigo;
        private String marca;
        private String modelo;
        private String[] canais = new String[]{"Sport TV", "Espn Brasil", "Espn International", "Fox Sports"};
        private int canalSelecionado;
        
        boolean ligado = false;
        
	@Override
	public void ligar() {
                if (!ligado) {
                    System.out.println("ligando universal");
                    ligado = true;
                } else {
                 
               }
		
	}

	@Override
	public void desligar() {
            System.out.println("desligando universal");		
	}

	@Override
	public int trocarCanal(int x) {
            this.canalSelecionado = x;
                String canal = canais[canalSelecionado];
		System.out.println("O meu canal atual é: " + canal);
		return 0;
	}

}
