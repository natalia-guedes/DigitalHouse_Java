package banco;

public class ContaPoupanca extends Contas {
	double taxa;

	public ContaPoupanca( double saldo, double taxa) {
		super( saldo);
		this.taxa=taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void recolherJuros () {
		depositar (getSaldo()* taxa);
		
	}
	
	public void sacar(double valor) {
		
	if (valor<=getSaldo()) {
		saldo-=valor;
	} else {
		System.out.println("Você superou seu limite de saldo");
	}
	}

}
