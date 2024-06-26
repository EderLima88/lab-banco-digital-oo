import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = sc.nextLine();
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		System.out.println("Qual valor a depositar? ");
		double deposito = sc.nextDouble();
		
		//System.out.println("Qual valor a tranferir? ");
		//double transferencia = sc.nextDouble();
	
		System.out.println("Qual valor a sacar? ");
		double sacar = sc.nextDouble();
		
		
		cc.depositar(deposito);
		
		if(!cc.sacar(sacar)) {
			System.out.println("Valor exedido, saque não realizado");
		}
		
		cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
		

	}

}
