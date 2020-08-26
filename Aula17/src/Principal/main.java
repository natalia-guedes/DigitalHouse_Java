package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import contato.Contato;
import contato.Endere�o;

public class main {
	
	public static int Menu(){
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("**** Menu Principal *****\n");
		System.out.printf("[ 1 ] Incluir Contato\n"); //add
		System.out.printf("[ 2 ] Excluir Contato\n"); //remove
		System.out.printf("[ 3 ] Listar Contatos\n"); //for
		System.out.printf("[ 4 ] Pesquisar Contato\n"); //for
		System.out.printf("[ 0 ] Encerrar o Programa\n");
		System.out.printf("\nOp��o Desejada: ");
		int n = sc.nextInt();
		sc.nextLine();
		sc.close();
		return n;
		
	}
	
	public static Contato Incluir() {
		System.out.println("pirnt");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o Nome");
		String nome = sc.nextLine();
		System.out.println("Digite a Idade");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o telefone");
		String telefone = sc.nextLine();
		System.out.println("Digite o endere�o");
		Endere�o rua= registrarEndereco();
		sc.close();
		return (new Contato (id,nome,idade,telefone, rua));
	}
	
	
	public static Endere�o registrarEndereco() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a rua");
		String rua = sc.nextLine();
		System.out.println("Digite o numero");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o bairro");
		String bairro = sc.nextLine();
		System.out.println("Digite a cidade");
		String cidade = sc.nextLine();
		System.out.println("Digite o estado");
		String estado = sc.nextLine();
		sc.close();
		return (new Endere�o (rua,numero,bairro,cidade,estado));
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		List<Contato> contatos = new ArrayList<>();
		System.out.println();
		int n = 5;
		System.out.println(n);
		
		do {
			n=Menu();
			System.out.println(n);
			if ( n == 1) {
				System.out.println("oi");
				contatos.add(Incluir());
			}
			else if ( n== 2) {
				System.out.printf("Id do contato que deseja remover: ");
				int remover = sc.nextInt();				
				contatos.remove(remover);
				
			}
			else if ( n== 3) {
				contatos.stream().forEach(x -> System.out.println(x.getNome()));
			}
			else if (n==4) {
				System.out.printf("Id do contato que deseja procurar: ");
				int procurar = sc.nextInt();	
				}
			}while(n!=0);
		}
	}
