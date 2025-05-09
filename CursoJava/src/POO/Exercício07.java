package POO;

import java.util.Locale;
import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		double soma = 0;
		int tamanhoIdade = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.nextLine(); 
			sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
			soma += altura[i];
			
			
			if (idade[i] < 16) {
				tamanhoIdade += 1;
				
			}
		}
		
		
		double mediaAltura = soma / altura.length;
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		double menosDe16 = (tamanhoIdade)*100 /n;
		System.out.printf("Pessoas com menos de 16 anos:  %.1f%%%n", menosDe16);
		
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
