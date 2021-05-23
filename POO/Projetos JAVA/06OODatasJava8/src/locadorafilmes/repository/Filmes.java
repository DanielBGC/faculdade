package locadorafilmes.repository;



import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import locadorafilmes.model.Filme;



public class Filmes {

	private static Filme[] filmes = {
		new Filme("Jogos Vorazes: Em Chamas", LocalDate.of(2014, Month.MARCH, 5), new BigDecimal(6)),
	    new Filme("Rush - No Limite da Emoção", LocalDate.of(2014, Month.MARCH, 12), new BigDecimal(6)),
	    new Filme("Jobs", LocalDate.of(2014, Month.MARCH, 19), new BigDecimal(6)),
	    new Filme("Elysium", LocalDate.of(2014, Month.APRIL, 2), new BigDecimal(6)),
	    new Filme("12 Anos de Escravidão", LocalDate.of(2014, Month.MAY, 14), new BigDecimal(6))
	};
	
	public List<Filme> todos() {
		return Arrays.asList(filmes);
	}

	public Filme porCodigo(int codigo) {
		return filmes[codigo];
	}
	
}
