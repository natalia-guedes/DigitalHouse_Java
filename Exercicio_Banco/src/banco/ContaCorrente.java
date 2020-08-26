package banco;

public class ContaCorrente extends Contas {
	
	private double limite;
	

	public ContaCorrente( double saldo, double limite) {
		super( saldo);
		this.limite=limite;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	@Override
	public void sacar(double valor) {
		if ((saldo+limite) <= valor) {
			saldo-=valor;
		} else {
			System.out.println("Voc� superou seu limite de conta");
		}
		
	}
	
	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValor());
	}
	
	

}
