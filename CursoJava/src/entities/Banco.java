package entities;

public class Banco {
	private String nomeTitular;
	private int numeroConta;
	private double valorConta;
	
	
	public Banco(String nomeTitular, int numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}
	
	public Banco(String nomeTitular, int numeroConta, double valorConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		deposito(valorConta);
	}
	
	public double getValorConta() {
		return valorConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double deposito(double quantia) {
		return valorConta += quantia;
	}
	
	public double saque(double quantia) {
		return valorConta -= quantia + 5.00;
	}
	
	public String toString() {
		return "Número da conta: "
				+ numeroConta
				+ " Nome do titular: "
				+ nomeTitular
				+ " Valor em banco: R$"
				+ valorConta;
	}
}
