package Estrutura_Condicional;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o horário de início do jogo: ");
		int horarioinicial = sc.nextInt();
		System.out.print("Informe o horário final do jogo: ");
		int horariofinal = sc.nextInt();
		int duracao;
		if(horarioinicial < horariofinal) {
			duracao = horariofinal - horarioinicial ;
		} else {
			duracao = 24 - horarioinicial + horariofinal;
		}
		
	System.out.println("O jogo durou " + duracao + " horas!");
	}
}
