package Estrutura_Condicional;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Cachorro quente R$4,50\n2. X-Salada R$4,50\n3. X-Bacon R$5,00\n4. Torrada Simples R$2,00\n5. Refrigerante R$1,50");
		System.out.print("Escolha o código do item: ");
		int cod = sc.nextInt();
		System.out.print("Informe a quantidade: ");
		int quanti = sc.nextInt();
		double total = 0;
		if(cod == 1) {
			total = 4 * quanti;
		}if(cod == 2) {
			total = 4.50 * quanti;;
		}if(cod == 3) {
			total = 5 * quanti;;
		}if(cod == 4) {
			total = 2 * quanti;;
		}if(cod == 5) {
			total = 1.50 * quanti;;
		}
		System.out.println("O total a ser pago é de R$" + total);
		sc.close();
	}
}
