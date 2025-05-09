package POO;

import java.util.Locale;
import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		Double[] vet = new Double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		System.out.print("Valores = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vet[i]);
		}
		
		System.out.printf("%nSoma = %.2f%n", soma);
		
		double media = soma / vet.length;
		System.out.printf("Média = %.2f", media);
	}

}
