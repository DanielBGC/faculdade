package c;


public enum EnderecoAeroporto {
	
	END_AERO_BRASILIA("Brasilia", "BSB", "DF047", 1, "Aeroporto", "Lago Sul", "Brasilia", "DF", "Brasil"),
	END_AERO_CONFINS("Confins", "CNF", "MG010", 1, "Kilometro 39", "Confins", "Belo Horizonte", "MG", "Brasil"),
	END_AERO_CURITIBA("Curitiba", "CWB", "Av. Rocha Pombo", 1, "Aeroporto", "Aguas Belas", "Sao Jose dos Pinhais", "PR", "Brasil"),
	END_AERO_GUARULHOS("Guarulhos", "GRU", "Rod. Helio Smidt", 1, "Aeroporto", "Cumbica", "Guarulhos", "SP", "Brasil"),
	END_AERO_PORTO_ALEGRE("Porto Alegre", "POA", "Av. Severo Dulius", 1, "Aeroporto", "Centro", "Porto Alegre", "RS", "Brasil"),
	END_AERO_SANTOS_DUMONT("Santos Dumont", "SDU", "Praca Sen. Salgado Filho", 1, "Aeroporto", "Centro", "Rio de Janeiro", "RJ", "Brasil");
	
	private String nome, codigo, rua, complemento, bairro, cidade, estado, pais;
	private int numero;
	
	private EnderecoAeroporto(String nome, String codigo, String rua, int numero, 
			String complemento, String bairro, String cidade, String estado, String pais) {
		this.nome = nome;
		this.codigo = codigo;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getPais() {
		return pais;
	}
	
	public String getRua() {
		return rua;
	}
}
