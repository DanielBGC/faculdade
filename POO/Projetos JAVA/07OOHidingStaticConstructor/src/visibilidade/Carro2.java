package visibilidade;

public class Carro2 {
	public String marca;
	public long modelo;
	public String nome;
	public float potencia;
	public int ano;
	public boolean ligado = false;
	
	
	
	void ligar (String nomePessoa) {
		ligado = true;
		System.out.println("Carro ligando...");
		System.out.println("O carro " + nome + " est� ligado");
		System.out.println("Iniciando a primeira...");
		System.out.println("VRUMMMMMMMMMMMMMMMM" + " eu tenho " + potencia + " cavalos!");
		System.out.println("Eu sou o "  +  nomePessoa);
	}
	
	void desligar () {
		ligado = false;
		System.out.println("Carro desligando...");
		System.out.println("Colocando ponto morto...");
		Pessoa p = new Pessoa();
	}
	
	void desligar (Pessoa p) {
		ligado = false;
		System.out.println("Carro desligando...");
		System.out.println("Colocando ponto morto...");
		p.getNome();
	}
	
	
}
