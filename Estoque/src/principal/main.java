package principal;

import java.util.Scanner;

import Produto.produto;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		produto x= new produto();
		
		
		System.out.println("Entre com os dados do produto");
		System.out.print("Nome: ");
		x.nome= sc.next();
		System.out.print("Preço: ");
		x.preco= sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		x.quantidade= sc.nextInt();
		
		x.imprimir();	
	
		System.out.print("Entre com a quantidade produtos que foram removidos: ");
		x.retirada(sc.nextInt());
		x.imprimir();	
		
		System.out.print("Entre com a quantidade de produtos que foram adicionados: ");
		x.adicionar(sc.nextInt());
		x.imprimir();	
		
		
		sc.close();

	}

}
