package Estrutura_Condicional;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) { 
		System.out.println("Informe os números para verificar se são multiplos entre si");
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.print("informe o segundo número: ");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Os números " + num1 + " e " + num2 + " são multiplos");
		} else {
			System.out.println("Os números " + num1 + " e " + num2 + " não são multiplos");
		}
	}
}
