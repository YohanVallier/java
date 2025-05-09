package Estrutura_Condicional;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio07 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("informe o eixo x: ");
		double x = sc.nextDouble();
		System.out.print("informe o eixo y: ");
		double y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}
		sc.close();
	}
}
