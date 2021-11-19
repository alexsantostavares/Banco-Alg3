package application;

public class Conta {
	
	private String nome;
	private double saldo, dinheiro;
	private int cpf;
	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double consultarSaldo() {
		System.out.println("\nO saldo da conta  do(a) "+ this.nome + " é: " + Double.toString(this.saldo));
		return this.saldo;
	}
	
	public void deposito(double dinheiro) {
		saldo = saldo + dinheiro;
		System.out.println("\nSaldo da conta do(a) "+ this.nome +" apos deposito: " + Double.toString(this.saldo));
	}
	
	public void sacar(double dinheiro) {
		if(this.saldo<dinheiro) {
			System.out.println("\nSaldo insuficiente!("+ this.nome+")");
		}
		else {
			saldo = saldo - dinheiro;
			System.out.println("\nSaldo da conta do(a) " + this.nome+ " apos saque é: " + Double.toString(this.saldo));
	
		}
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
}
