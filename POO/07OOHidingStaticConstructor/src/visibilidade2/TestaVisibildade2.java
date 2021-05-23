package visibilidade2;

import visibilidade.Carro;
import visibilidade.Carro2;
import visibilidade.Carro3;
import visibilidade.Carro4;
import visibilidade.Carro4Extends;

public class TestaVisibildade2 {
	
	public static void main (String args[]) {
		//Variável sem modificador de visibilidade
		
		//sem modificador de visibilidade é acessível dentro do mesmo pacote
		//Carro carro = new Carro();
		//carro.ano = 1994;
		
		//variável com modificador de visibilidade public: acessível de qualquer lugar
		//Carro2 carro2 = new Carro2();
                //carro2.ano = 1996;
		
		
		//variável com modificador de visibilidade private
		//Carro3 carro3 = new Carro3();
		//carro3.ano = 1994;
		
		//variável com modificador de visibilidade protected
		//disponável para a própria classe, mesmo pacote ou herança
		//Carro4 carro4 = new Carro4();
		//carro4.ano = 1994;
		
		//variável com modificador de visibilidade protected e herança
		//Carro4Extends carro4Extends = new Carro4Extends();
		//carro4Extends.ano = 1994;
	}

}
