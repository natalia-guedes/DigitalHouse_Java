package Produto;

public class produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double total() {
		
		return preco * quantidade;
	}
	
	public void retirada(int n) {
		this.quantidade= this.quantidade - n;
		 
	}

	public void adicionar(int n) {
	
		this.quantidade= this.quantidade + n;
}
	
	public void imprimir() {
		
		System.out.println("Dados do produto: " +nome+ ", $ "+preco+", "+quantidade+" unidades. Total: $ " + total());
}
	
}
