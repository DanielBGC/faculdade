package autentica;

public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	//m�todo sobreescrito
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("O gerente est� autenticado...");
			return true;
		} else {
			System.out.println("O gerente N�O est� autenticado...");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	@Override
	public boolean autenticaSenha(int senha) {
		if (senha == 123) {
                    System.out.println("Senha do gerente autenticada");
                    return true;
                } else {
                    System.out.println("Senha do gerente NÃO autenticada");
                    return false;
                }
	}
}
