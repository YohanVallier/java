package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Exercício04 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	Banco bc;
	
	System.out.print("Informe o nome da conta: ");
	String nomeTitular = sc.nextLine();
	System.out.print("Informe o número da conta: ");
	int numeroConta = sc.nextInt();
	sc.nextLine();
	System.out.print("Gostaria de informar o valor da conta(S/N)? ");
	String resposta = sc.nextLine();
	System.out.println();
	
	if(resposta.equalsIgnoreCase("S")) {
		System.out.print("Informe o valor da sua conta: ");
		double valorConta = sc.nextDouble();
		bc = new Banco(nomeTitular, numeroConta, valorConta);
	}
	
	else {
		bc = new Banco(nomeTitular, numeroConta);
		System.out.println(bc);
	}
	System.out.println();
	
	System.out.print("Informe o valor do depósito: ");
	bc.deposito(sc.nextDouble());
	System.out.println(bc);
	System.out.println();
	System.out.print("Informe o valor do saque: ");
	bc.saque(sc.nextDouble());
	System.out.println(bc);
	
	sc.close();
	}
}
