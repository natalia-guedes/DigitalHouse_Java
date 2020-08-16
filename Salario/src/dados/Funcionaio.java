package dados;

public class Funcionaio {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	
	public double salarioLiquido() {
		
		return salarioBruto - taxa;
	}
	
	public void aumentoDoSalario(double porcentagem) {
		
		salarioBruto += salarioBruto*(porcentagem/100);
	}

}
