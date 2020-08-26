package conta;

public class Conta {
	private String numero;
	private String nome;
	private double saldo=0;
	

	public Conta(String numero, String nome, double valorInicial) {
		this.nome=nome;
		this.numero=numero;
		this.saldo=valorInicial;
		this.extrato();
		
	}
	
	public Conta(String numero, String nome) {
		this.nome=nome;
		this.numero=numero;
		
	}


	public String getNumero() {
		return numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public double getSaldo() {
		return saldo;
	}

	public void saque(double valor) {
		this.saldo= saldo - (valor+5);
		this.extrato();
	}
	public void deposito(double valor) {
		this.saldo= saldo + (valor);
		this.extrato();
	}
	
	public void extrato() {
		System.out.println("Nome: "+ this.nome + 
				" \nConta: " + this.numero + 
				"\nSaldo: R$ " + saldo);
	}

	
}
