package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		double dinheiro;
		
		Conta conta = new Conta();
		Conta conta2 = new Conta();
		Scanner sc = new Scanner(System.in);
		
		conta.setNome("Alex");
		conta.setCpf(06574541174);
		conta.setSaldo(3000);
		
		conta2.setNome("Maria");
		conta2.setCpf(674864496);
		conta2.setSaldo(900);
		
		System.out.print("\nDigite 1 para depositar // 2 para sacar // 3 para consultar saldo: ");
		int x = sc.nextInt();
		
		
		if(x == 1) {
			System.out.print("\nDigite o valor do deposito:");
			conta.setDinheiro(dinheiro = sc.nextDouble());
			conta.deposito(dinheiro);
			
			conta2.setDinheiro(dinheiro);
			conta2.deposito(dinheiro);
		}
		else if (x == 2) {
			System.out.print("\nDigite o valor do saque:");
			conta.setDinheiro(dinheiro = sc.nextDouble());
			conta.sacar(dinheiro);  
			
			conta2.setDinheiro(dinheiro);
			conta2.sacar(dinheiro);
		}
		else if(x == 3) {
			System.out.println("\nConsulta de saldo");
			conta.consultarSaldo();
			
			conta2.consultarSaldo();
		}
		
		
		sc.close();
	}
	

}
