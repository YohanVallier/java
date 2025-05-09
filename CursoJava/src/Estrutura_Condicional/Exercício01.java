package Estrutura_Condicional;
import java.util.Scanner;

public class Exercício01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
			}
		sc.close();
		
	}
}
