package funcionario;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario(Integer id, String nome, Double salario) {
		this.id=id;
		this.nome=nome;
		this.salario=salario;
		System.out.println("Id: "+ this.id + 
				" \nNome: " + this.nome + 
				"\nSalário: R$ " + this.salario);
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentoSalario(int id,int porcentagem) {
		this.salario += salario*(porcentagem/100);
		
	}
	
	public void imprimir() {
		System.out.println(this.id + 
				" \n" + this.nome + 
				"\n" + this.getSalario());
	}

}
