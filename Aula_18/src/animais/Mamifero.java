package animais;

public class Mamifero extends Animal{

	public Mamifero() {
		super();
	}
	
	public Mamifero(String nome) {
		super(nome);
	}
	
	@Override
	public void falar() {
		System.out.println("Falandooo");
	}

	@Override
	public void correr() {
		System.out.println("50km/h");
		
	}

	@Override
	public Double litrosDeAgua() {
		// TODO Auto-generated method stub
		return 100.00;
	}

}
