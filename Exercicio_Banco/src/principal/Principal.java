package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import banco.Cheque;
import banco.Clientes;
import banco.Contas;
import banco.ContaCorrente;
import banco.ContaPoupanca;
public class Principal {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Contas conta;
		String typeAccount = sc.next().toLowerCase();
		sc.nextLine();
		double saldoInicial = sc.nextDouble();
		
		if (typeAccount.charAt(0) == 'p') {
			conta = new ContaPoupanca(saldoInicial, 0.05);
		}else {
			conta = new ContaCorrente(saldoInicial, 200.00);
		}			
		sc.nextLine();
		Clientes client = new Clientes(conta, random.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		System.out.print("Digite o valor do depósito: ");
		conta.depositar(sc.nextDouble());
		sc.nextLine();
		if (conta instanceof ContaCorrente) {
			double valor = sc.nextDouble();
			sc.nextLine();
			((ContaCorrente) conta)
					.depositarCheque( new Cheque( valor, sc.nextLine(), sdf.parse(sc.nextLine())));
		}
		conta.sacar(sc.nextDouble());
		System.out.println(conta);
		
		sc.close();
	}
}