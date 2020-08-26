package banco;


public class Clientes {
	private Integer id;
	private String rg;
	private String cpf;
	private String sobrenome;
	private Contas conta;

	public Clientes(Contas conta, Integer id, String rg, String cpf, String sobrenome) {
		this.id=id;
		this.rg=rg;
		this.cpf=cpf;
		this.sobrenome=sobrenome;
		this.conta=conta;
	}
	
	

	public Contas getConta() {
		return conta;
	}



	public void setConta(Contas conta) {
		this.conta = conta;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	

}
