package sortingcollectionscomparable;

public class Funcionario implements Comparable<Funcionario> {
    //http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/	
        protected String nome;
	protected String cpf;
	protected double salario;
        
        int idade;
	
	//reescrever, sobreescrever e override
	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", idade=" + idade + '}';
    }


        

        /*
         Este método deve retornar zero, se o objeto comparado for igual
a este objeto, um número negativo, se este objeto for menor que o objeto dado, e um número positivo, se
este objeto for maior que o objeto dado.
        
        */
    @Override
    public int compareTo(Funcionario o) {
        if (this.idade < o.idade) {
            return -1;
        }
        if (this.idade > o.idade) {
            return +1;
        }
        return 0;
    }

}
