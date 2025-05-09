package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número para eu informar seu intervalo: ");
		double num = sc.nextDouble();
		if (num >= 0.0 && num <= 25.0) {
			System.out.println("Intervalo [0, 25]");
		}
		if (num > 25.0 && num <= 50.0) {
			System.out.println("Intervalo (25, 50]");
		}
		if (num > 50.0 && num <= 75.0) {
			System.out.println("Intervalo (50, 75]");
		}
		if (num > 75.0 && num <= 100.0) {
			System.out.println("Intervalo (75, 100]");
		} else if (num < 0.0 || num > 100.0) {
			System.out.println("Fora do intervalo");
		}
		sc.close();
	}
}
