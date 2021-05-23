package locadorafilmes.exemplo;



import java.time.format.DateTimeFormatter;
import locadorafilmes.model.Filme;
import locadorafilmes.repository.Filmes;



public class ListaTodosFilmes {

	public static void main(String[] args) {
		System.out.printf("%-30s %s\n", "Nome:", "Data de lançamento:");
		
		Filmes filmes = new Filmes();
		/*filmes.todos().forEach(f -> {
			System.out.printf("%-30s %s\n", f.getNome()
					, f.getDataLancamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		});*/
                
                for (Filme f: filmes.todos()) {
			System.out.printf("%-30s %s\n", f.getNome()
					, f.getDataLancamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}
	
}
