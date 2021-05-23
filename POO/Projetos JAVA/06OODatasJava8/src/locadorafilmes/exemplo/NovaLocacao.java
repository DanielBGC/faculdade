package locadorafilmes.exemplo;



import java.util.Arrays;
import java.util.List;
import locadorafilmes.model.Cliente;
import locadorafilmes.model.Filme;



import locadorafilmes.model.Locacao;
import locadorafilmes.repository.Filmes;


public class NovaLocacao {

	public static void main(String[] args) {
		Filmes filmes = new Filmes();
		List<Filme> filmesAlugados = Arrays.asList(filmes.porCodigo(0), filmes.porCodigo(2));
		Locacao locacao = new Locacao(filmesAlugados, new Cliente("João Souza"));
		
		locacao.imprimirRecibo();
	}
	
}
