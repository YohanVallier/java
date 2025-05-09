package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.quartoAluguel;

public class Exercício08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		quartoAluguel[] vetor = new quartoAluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int numeroQuartos = sc.nextInt();
		
		for(int i = 0; i < numeroQuartos; i++) {
			System.out.println();
			System.out.printf("Quarto #%d:%n ", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			System.out.println();
			
			vetor[quarto] = new quartoAluguel(nome, email);
			
		}
		
		System.out.println();
		
		System.out.println("Quartos alugados: ");
		for(int i = 0; i < 10; i++) {			
			if(vetor[i] != null) {
				System.out.print(i + ": " + vetor[i]);
			}
		}
	}
}
