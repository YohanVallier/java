package entities;

public class SalarioTotal {
	public String nome;
	public double salario;
	public double taxa;
	public double imposto;
	
	public double salarioLiquido() {
		return salario - taxa;
	}
	public double acrescimoSalario() {
		return (salario * (imposto /100 + 1)) - taxa;
	}
}
