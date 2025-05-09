package Estrutura_Condicional;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("O número é par.");
			} else {
				System.out.print("O número é impar");
			}
		sc.close();
		}
	}