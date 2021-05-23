package visibilidade;

public class Carro4Extends extends Carro4 {
	protected int numeroMagico;

	public int getNumeroMagico() {
		return numeroMagico + ano;
	}

	public void setNumeroMagico(int numeroMagico) {
		this.numeroMagico = numeroMagico;
	}
}
