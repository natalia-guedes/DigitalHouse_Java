package banco;

import java.util.Date;

public class Cheque {

	private double valor;
	private String banco;
	private Date data;
	
	public Cheque(double valor, String bancoEmissor, Date data) {
		this.banco= bancoEmissor;
		this.data=data;
		this.valor=valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	

}
