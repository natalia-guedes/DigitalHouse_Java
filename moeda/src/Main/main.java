package Main;

import java.util.Scanner;

import Dolar.Conversao;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o pre�o do dolar: ");
		double preco= sc.nextDouble();
		
		System.out.println("Quantos dolares voc� quer comprar: ");
		double dolar= sc.nextDouble();
	
	
		System.out.println("Pague o valor de  "+ Conversao.converter(dolar, preco)+" reais");
		
		sc.close();

	}

}
