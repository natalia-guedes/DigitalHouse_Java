package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import conta.Conta;

public class main {

	public static void main(String[] args) {
		Conta conta1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o nome");
		String nome= sc.nextLine();
		System.out.println("Entre com o número da conta");
		String conta= sc.nextLine();
		System.out.println("Irá ter depósito inicial? (S/N)");
		char valorInicial= sc.next().toUpperCase().charAt(0);
		if (valorInicial== 'S') {
			System.out.println("Entre com o depósito incial");
			Double valor = sc.nextDouble();
			conta1 = new Conta(conta,nome,valor);
		}else {
			conta1 = new Conta(conta,nome);
		}
		System.out.println("Entre com o valor do depósito: ");
		Double valor = sc.nextDouble();
		conta1.deposito(valor);
		
		System.out.println("Entre com o valor do saque: ");
		valor = sc.nextDouble();
		conta1.saque(valor);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(conta1);
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		for(Conta p : lista) {
			System.out.println(p.getNome());
		}
		
		lista.stream().forEach(x -> System.out.println(x.getNome()));
		
		sc.close();
		
		
	}
}
