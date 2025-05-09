package POO;

import java.util.Locale;
import java.util.Scanner;
import entities.SalarioTotal;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SalarioTotal saltot = new SalarioTotal();
		
		System.out.print("Qual seu nome? ");
		saltot.nome = sc.nextLine();
		System.out.print("Qual seu salário bruto? ");
		saltot.salario = sc.nextDouble();
		System.out.print("Quanto é a taxa? ");
		saltot.taxa = sc.nextDouble();
		
		System.out.printf("Funcionário: %s, R$%.2f%n",  saltot.nome, saltot.salarioLiquido());
		
		System.out.print("Qual porcentagem foi acrescida no seu salário? ");
		saltot.imposto = sc.nextDouble();
		
		System.out.printf("Atualização salarial: %s, R$%.2f", saltot.nome, saltot.acrescimoSalario());
	}
}
