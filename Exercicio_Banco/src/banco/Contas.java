package banco;

public abstract class Contas {
	protected double saldo;

	public Contas( double saldo) {
		this.saldo=saldo;
	}


	public double getSaldo() {
		return saldo;
	}
	

	public abstract void sacar(double valor) ;
	
	public void depositar(double valor) {
		this.saldo+=valor;
	}

	

}
