package POO;

import java.util.Locale;
import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		
		System.out.print("Quantos números você vai digitar? ");
		int qtde_numeros = sc.nextInt();
		int[] vetor_numero = new int[qtde_numeros];
		
		for (int i = 0; i < qtde_numeros; i++) {
			System.out.print("Digite um número: ");
			vetor_numero[i] = sc.nextInt();
		}
	
		System.out.print("Os números negativos são: ");
		
		for (int i = 0; i < qtde_numeros; i++) {
			if(vetor_numero[i] < 0) {
				System.out.printf("%n%d", vetor_numero[i]);
				}
			
			}
		sc.close();
	}

}
