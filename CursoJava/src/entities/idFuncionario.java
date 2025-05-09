package entities;

public class idFuncionario {
	public int id;
	public String nome;
	public double sal;
	
	public idFuncionario() {
		
	}
	
	public idFuncionario(int id, String nome, double sal) {
		this.id = id;
		this.nome = nome;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + sal;
	}
}
