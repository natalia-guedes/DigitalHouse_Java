package produtos;

public class Produto {
	private String nome;
	private int quantidade;
	private double preco;
	protected double custo;
	
	public Produto (String nome, double preco, int quantidade) {
		this.setNome(nome);
		this.preco=preco;
		this.quantidade=quantidade;
	}
	
	
	
	public int getQuantidade() {
		return quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double valorDoEstoque () {
		return preco*quantidade;
	}
	
	public void tirarProduto (int n) {
		quantidade= quantidade-n;
	}
	
	public void adicionarProduto (int n) {
		quantidade= quantidade+n;
	}

	
}
