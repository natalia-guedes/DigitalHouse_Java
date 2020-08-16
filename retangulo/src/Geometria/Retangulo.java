package Geometria;

public class Retangulo {
	public double ladoA;
	public double ladoB;
	
	public double calcularArea() {
		
		return (ladoA*ladoB);
	}
	
	public double calcularPerimetro() {
		
		return ((2*ladoA)+(2*ladoB));
	}
	
	public double calcularDiagonal() {
		
		return Math.sqrt(Math.pow(ladoA, 2)+Math.pow(ladoB, 2));
	}

}
