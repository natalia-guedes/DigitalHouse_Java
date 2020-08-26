package animais;

public class Passaro extends Animal{

	public Passaro() {
		super();
	}
	
	public Passaro(String nome) {
		super(nome);
	}
	
	@Override
	public void falar() {
		System.out.println("Piu piu");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("20km/h");
	}

	@Override
	public Double litrosDeAgua() {
		// TODO Auto-generated method stub
		return 0.10;
	}

}
