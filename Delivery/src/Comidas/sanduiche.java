package Comidas;

import java.util.List;
public class sanduiche extends Lanche{
	private List<String> ingredientes;
	public sanduiche() {
		super();	
	}
	public sanduiche(Double preco, List<String> ingredientes) {
		super(preco);
		this.ingredientes = ingredientes;
	}
	
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	@Override
	public Double tempo(double distancia) {
		return 15 + super.tempo(distancia);		
	}
}
