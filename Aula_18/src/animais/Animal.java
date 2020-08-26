package animais;

public abstract class Animal implements Bicho{

	private String nome;
	
	public Animal(String nome) {
		this.nome=nome;
	}
	
	public Animal() {
		
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void falar() ;
	

}
