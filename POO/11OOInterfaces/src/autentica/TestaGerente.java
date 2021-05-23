package autentica;

public class TestaGerente {
	public static void main(String args[]) {
		Autenticavel a = new Gerente();
                Funcionario f = new Gerente();
                
                a.autenticaSenha(1223);
	}
}
