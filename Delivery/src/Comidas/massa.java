package Comidas;

public class massa extends Lanche{
	private String molho;
	private TiposMassa tipo;
	
	public massa() {
		super();
	}
	public massa(Double preco, String molho, TiposMassa tipo) {
		super(preco);
		this.molho = molho;
		this.tipo = tipo;
	}
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	public TiposMassa getTipo() {
		return tipo;
	}
	public void setTipo(TiposMassa tipo) {
		this.tipo = tipo;
	}
	@Override
	public Double tempo(double distancia) {
		return 30 + super.tempo(distancia);		
	}
}
