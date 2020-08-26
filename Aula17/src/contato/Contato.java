package contato;

public class Contato {
	
	private Integer id;
	private String nome;
	private Integer idade;
	private String telefone;
	private Endere�o endereco;

	public Contato(Integer id, String nome, Integer idade, String telefone, Endere�o endereco) {
		
		this.id= id;
		this.nome= nome;
		this.idade=idade;
		this.telefone=telefone;
		this.endereco=endereco;
	}
	
	public void Imprimir() {
		System.out.println("Id: "+ this.id +"\nNome: " + this.nome + "\nIdade: " + this.id + "\nTelefone: " + this.telefone);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	public Endere�o getEndereco() {
		return endereco;
	}

	public void setEndereco(Endere�o endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return ("------------------------------------------\n" + 
	                 " Id: " + this.id +"Nome: " + this.nome + "Idade: " + this.id + "Telefone: " + this.telefone);
	}
	
	

}
